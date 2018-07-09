package com.jiafan.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jiafan.dao.ProductDao;
import com.jiafan.entity.Product;

@Repository
public class ProductMapperImpl implements ProductDao {
	
	@Autowired
	ProductDao productDao;

	@Override
	public List<Product> selectAll(Product product) {
		// TODO Auto-generated method stub
		return productDao.selectAll(product);
	}

	@Override
	public Product FindById(Product product) {
		// TODO Auto-generated method stub
		return productDao.FindById(product);
	}

	@Override
	public boolean InsertModel(Product product) {
		return productDao.InsertModel(product);
	}

	@Override
	public boolean updateById(Product product) {
		return productDao.updateById(product);
	}

	@Override
	public boolean deleteById(Product product) {
		// TODO Auto-generated method stub
		return productDao.deleteById(product);
	}

	@Override
	public Integer selectCount(Product product) {
		// TODO Auto-generated method stub
		return productDao.selectCount(product);
	}

	@Override
	public boolean deleteAllById(Product product) {
		// TODO Auto-generated method stub
		return productDao.deleteAllById(product);
	}

	@Override
	public boolean InsertListModel(List<Product> product) {
		// TODO Auto-generated method stub
		return productDao.InsertListModel(product);
	}

}
