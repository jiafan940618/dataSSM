package com.jiafan.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jiafan.entity.ProductType;

@Repository("productTypeDao")
public interface ProductTypeDao {
	
	
    public List<ProductType> selectAll();
	
	public ProductType FindById(ProductType productType);
	
	
	public void InsertModel(ProductType productType);
	
	public void updateById(ProductType productType);
	
	public void deleteById(ProductType productType);

}
