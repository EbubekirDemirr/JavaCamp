package JavaCamp.JavaProject.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import JavaCamp.JavaProject.entities.concretes.Product;



public interface ProductDao extends JpaRepository<Product, Integer>{
	
}
