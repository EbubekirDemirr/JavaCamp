package JavaCamp.JavaProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaCamp.JavaProject.business.abstracts.ProductService;
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
	public List<Product> getAll() {
		
		return this.productDao.findAll();
	}

}
