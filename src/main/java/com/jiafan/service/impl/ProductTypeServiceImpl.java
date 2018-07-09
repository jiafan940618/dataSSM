package com.jiafan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiafan.dao.impl.ProductTypeDaoImpl;
import com.jiafan.entity.ProductType;
import com.jiafan.service.ProductTypeService;

@Service("productTypeService")
public class ProductTypeServiceImpl implements ProductTypeService {

	@Autowired
	ProductTypeDaoImpl productTypeDaoImpl;
	
	@Override
	public List<ProductType> selectAll() {
		// TODO Auto-generated method stub
		return productTypeDaoImpl.selectAll();
	}

	@Override
	public ProductType FindById(ProductType productType) {
		// TODO Auto-generated method stub
		return productTypeDaoImpl.FindById(productType);
	}

	@Override
	public void InsertModel(ProductType productType) {
		// TODO Auto-generated method stub
		productTypeDaoImpl.InsertModel(productType);
	}

	@Override
	public void updateById(ProductType productType) {
		// TODO Auto-generated method stub
		productTypeDaoImpl.updateById(productType);
	}

	@Override
	public void deleteById(ProductType productType) {
		// TODO Auto-generated method stub
		productTypeDaoImpl.deleteById(productType);
	}

	
}
