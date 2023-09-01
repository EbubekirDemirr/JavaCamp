package JavaCamp.JavaProject.business.abstracts;

import java.util.List;

import JavaCamp.JavaProject.core.utilities.results.DataResult;
import JavaCamp.JavaProject.core.utilities.results.Result;
import JavaCamp.JavaProject.entities.concretes.Product;

public interface ProductService {
	
	DataResult<List<Product>> getAll();
	Result add(Product product);

}
