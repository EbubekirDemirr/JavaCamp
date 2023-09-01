package JavaCamp.JavaProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaCamp.JavaProject.business.abstracts.ProductService;
import JavaCamp.JavaProject.core.utilities.results.DataResult;
import JavaCamp.JavaProject.core.utilities.results.Result;
import JavaCamp.JavaProject.core.utilities.results.SuccessDataResult;
import JavaCamp.JavaProject.core.utilities.results.SuccessResult;
import JavaCamp.JavaProject.dataaccess.abstracts.ProductDao;
import JavaCamp.JavaProject.entities.concretes.Product;


@Service
public class ProductManager implements ProductService {
	private ProductDao productDao;
      
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Data Listelendi");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("ürün eklendi");
	}

}
