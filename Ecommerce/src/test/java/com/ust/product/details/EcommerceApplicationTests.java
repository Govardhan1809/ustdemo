package com.ust.product.details;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.ust.product.enities.Product;
import com.ust.product.store.ProductStore;

@SpringBootTest
class EcommerceApplicationTests {
	
	@Autowired
	private ProductStore ProductStore;
	@Test
	public void CreateProduct() {
		
			Product product =new Product();
			product.setTitle("Monitor");
			product.setPrice(5000d);
			product.setCategory("Electronics");
			product.setDescription("Used for every CPU");
			product.setImage("https://store.hp.com/");
			
			ProductStore.save(product);
		
	}
	@Test
	public void findProductbyID() {
		Product product = ProductStore.findById(1l).get();
		System.out.println(product);
			}
	@Test
	public void updateProduct() {
		Product product = ProductStore.findById(1l).get();
		product.setPrice(16632d);
		ProductStore.save(product);
	}
	@Test 
	public void deleteProduct() {
		Product product = ProductStore.findById(1l).get();
		product.setId(1l);
		ProductStore.delete(product);
		
	
	
	
	}
}