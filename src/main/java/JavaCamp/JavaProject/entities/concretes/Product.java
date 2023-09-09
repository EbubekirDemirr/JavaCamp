package JavaCamp.JavaProject.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name="products")
@AllArgsConstructor
@NoArgsConstructor

public class Product {
	
	
	@Column(name="product_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	
	@ManyToOne()
	@JoinColumn(name="category_id")
	private Category category;
	

}
