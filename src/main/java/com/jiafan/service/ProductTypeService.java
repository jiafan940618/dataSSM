package com.jiafan.service;

import java.util.List;

import com.jiafan.entity.ProductType;

public interface ProductTypeService {
	
	    public List<ProductType> selectAll();
		
		public ProductType FindById(ProductType productType);

		public void InsertModel(ProductType productType);
		
		public void updateById(ProductType productType);
		
		public void deleteById(ProductType productType);

}
