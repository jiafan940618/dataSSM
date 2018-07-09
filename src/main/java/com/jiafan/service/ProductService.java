package com.jiafan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jiafan.entity.Product;
import com.jiafan.entity.ProductExcel;


public interface ProductService {
	
	public List<Product> selectAll(Product product);
	
	public Product FindById(Product product);
	
	public boolean InsertModel(Product product);
	
	public boolean updateById(Product product);
	
	public boolean deleteById(Product product);
	
	public Integer selectCount(Product product);
	
	public List<ProductExcel> toExcel(List<Product> product);
	
	public List<Product> toProduct(List<ProductExcel> product);
	
	public boolean InsertListModel(List<Product> product);
	
	public boolean deleteAllById(Product product);
	

}
