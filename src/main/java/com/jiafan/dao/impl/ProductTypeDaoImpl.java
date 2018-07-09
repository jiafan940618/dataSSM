package com.jiafan.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jiafan.dao.ProductTypeDao;
import com.jiafan.entity.ProductType;

@Repository
public class ProductTypeDaoImpl implements  ProductTypeDao{

	@Autowired
	ProductTypeDao productTypeDao;
	
	@Override
	public List<ProductType> selectAll() {
		// TODO Auto-generated method stub
		return productTypeDao.selectAll();
	}

	@Override
	public ProductType FindById(ProductType productType) {
		// TODO Auto-generated method stub
		return productTypeDao.FindById(productType);
	}

	@Override
	public void InsertModel(ProductType productType) {
		// TODO Auto-generated method stub
		productTypeDao.InsertModel(productType);
	}

	@Override
	public void updateById(ProductType productType) {
		// TODO Auto-generated method stub
		productTypeDao.updateById(productType);
	}

	@Override
	public void deleteById(ProductType productType) {
		// TODO Auto-generated method stub
		productTypeDao.deleteById(productType);
	}

}
