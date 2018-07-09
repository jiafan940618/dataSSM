package com.jiafan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jiafan.entity.Product;

/**
 * Created by Administrator on 2018\6\25 0025.
 */
@Repository("productDao")
public interface ProductDao {
	
	public List<Product> selectAll(Product product);
	
	public Integer selectCount(Product product);
	
	public Product FindById(Product product);
	
	public boolean InsertModel(Product product);
	
	public boolean InsertListModel(@Param("product") List<Product> product);
	
	public boolean updateById(Product product);
	
	public boolean deleteById(Product product);
	
	public boolean deleteAllById(Product product);


}
