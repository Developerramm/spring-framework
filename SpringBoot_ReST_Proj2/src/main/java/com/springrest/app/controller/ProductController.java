package com.springrest.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.app.entity.Address;
import com.springrest.app.entity.ProductEntity;
import com.springrest.app.entity.SellerEntity;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@GetMapping("/get-product")
	public ProductEntity getProduct() {
		return new ProductEntity("USB Mouse",900.0f,
				new SellerEntity("XYZ Pvt ldt",(byte) 4, 
						new Address("Riga road","Sitamarhi","843302")));
	}
	
	@GetMapping("/get-all-product")
	public List<ProductEntity> getAllProducts(){
		Address address = new Address("riga road", "Maniyari", "843302");
		SellerEntity sellerEntity = new SellerEntity("ABC Pvt Ltd",(byte)4,address);
		return Arrays.asList(
				new ProductEntity("Keyboard", 1000.0f, sellerEntity),
				new ProductEntity("laptop", 40000.0f, sellerEntity),
				new ProductEntity("Mobile", 14000.0f, sellerEntity),
				new ProductEntity("Chasma", 200.0f, sellerEntity),
				new ProductEntity("copy", 100.0f, sellerEntity)
				);
	}

}
