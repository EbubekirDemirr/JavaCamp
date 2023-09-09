package JavaCamp.JavaProject.business.abstracts;

import java.util.List;


import JavaCamp.JavaProject.core.utilities.results.DataResult;
import JavaCamp.JavaProject.core.utilities.results.Result;
import JavaCamp.JavaProject.entities.concretes.Product;

public interface ProductService {
	
	DataResult<List<Product>> getAll();
	Result add(Product product);
	
	 DataResult<Product> getByProductName(String productName);
	  
     DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	  
     DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);
	  
     DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);
	  
     DataResult<List<Product>> getByProductNameContains(String productName);
	  
     DataResult<List<Product>> getByProductNameStartsWith(String productName);

     DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);

}
