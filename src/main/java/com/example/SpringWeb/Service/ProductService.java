package com.example.SpringWeb.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringWeb.Model.Product;

@Service
public class ProductService {
	
	List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"Laptop","Electronics"),
											new Product(102,"Desktop","Electronics"),
											new Product(103,"MIrror","Cosmotics")));

	public List<Product> getProducts()
	{
		return products;
	}
	public Product getProductById(int productId)
	{
		return  products.stream().filter(p->p.getProductId() == productId).findFirst().get();
	}
	
	public void DeleteProduct(int productId) {
		 
		products.removeIf(product -> product.getProductId() == productId);
		
	}
}
