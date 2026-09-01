package com.example.SpringWeb.Cntroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringWeb.Model.Product;
import com.example.SpringWeb.Service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	@RequestMapping("/Products")
	List<Product> getProductsData()
	{
		return productService.getProducts();
		
	}
	
	@RequestMapping("/Products/{ProductId}")
	Product getproductById(@PathVariable int ProductId)
	{
		return productService.getProductById(ProductId);
	}
	@PostMapping("/Products")
	public void addProduct(@RequestBody Product product)
	{
		productService.getProducts().add(product);
	}
	
	@PutMapping("/Products")
	public void updateProject(@RequestBody Product product)
	{
		int index = 0;
		for(Product productVar:productService.getProducts())
		{
			if(productVar.getProductId()==product.getProductId())
			{
				index++;
			}
		}
		productService.getProducts().set(index, product);
	}
	
	@DeleteMapping("/Products/{prodId}")
	public void deleteProduct(@PathVariable int prodId)
	{
			productService.DeleteProduct(prodId);
		
	}
}
