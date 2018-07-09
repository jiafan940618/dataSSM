package com.jiafan.service.impl;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiafan.dao.impl.ProductMapperImpl;
import com.jiafan.entity.Product;
import com.jiafan.entity.ProductExcel;
import com.jiafan.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductMapperImpl productMapperImpl ;
	
	
	@Override
	public List<Product> selectAll(Product product) {
		// TODO Auto-generated method stub
		return productMapperImpl.selectAll(product);
	}

	@Override
	public Product FindById(Product product) {
		// TODO Auto-generated method stub
		return productMapperImpl.FindById(product);
	}

	@Override
	public boolean InsertModel(Product product) {
		
		return productMapperImpl.InsertModel(product);
	}

	@Override
	public boolean updateById(Product product) {
		
		return productMapperImpl.updateById(product);
	}

	@Override
	public boolean deleteById(Product product) {
		// TODO Auto-generated method stub
		return	productMapperImpl.deleteById(product);
	}

	@Override
	public Integer selectCount(Product product) {
		// TODO Auto-generated method stub
		return productMapperImpl.selectCount(product);
	}

	@Override
	public List<ProductExcel> toExcel(List<Product> product) {
		List<ProductExcel> list = new LinkedList<ProductExcel>();
		for (Product prod : product) {
			ProductExcel produEx = new ProductExcel();
			produEx.setId(prod.getId());
			produEx.setProductName(prod.getProductName());
			produEx.setProductNum(prod.getProductNum());
			produEx.setPurchaseNum(prod.getPurchaseNum());
			produEx.setRemark(prod.getRemark());
			produEx.setRemnantNum(prod.getRemnantNum());
			produEx.setUseNum(prod.getUseNum());
			produEx.setUserName(prod.getUserName());
			SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        String newTime=	simple.format(prod.getCreateTime());	
	        produEx.setCreateTime(newTime);
	        
	        produEx.setProductType(changeType(prod.getProductType()));
			
	        list.add(produEx);
		}
		return list;
	}
	
	@Override
	public List<Product> toProduct(List<ProductExcel> product) {
		List<Product> list = new LinkedList<Product>();
		for (ProductExcel prod : product) {
			Product produEx = new Product();
			produEx.setId(prod.getId());
			produEx.setProductName(prod.getProductName());
			produEx.setProductNum(prod.getProductNum());
			produEx.setPurchaseNum(prod.getPurchaseNum());
			produEx.setRemark(prod.getRemark());
			produEx.setRemnantNum(prod.getRemnantNum());
			produEx.setUseNum(prod.getUseNum());
			produEx.setUserName(prod.getUserName());
 
	        produEx.setProductType(changeNum(prod.getProductType()));
			
	        list.add(produEx);
		}
		return list;
	}
	
	
	public String changeType(int productType){
		String typeName = "";
		if(1 == productType){
			typeName = "硅胶";
		}else if(2 == productType){
			typeName = "外壳";
		}else if(3 == productType){
			typeName = "线路板";
		}else if(4 == productType){
			typeName = "发射管";
		}else if(5 == productType){
			typeName = "五金";
		}else if(6 == productType){
			typeName = "IC";
		}else if(7 == productType){
			typeName = "其他材料";
		}
		return typeName;
	}
	
	public int changeNum(String productType){
		int num = 0;
		String typeName = "";
		if(productType.equals("硅胶")){
			num = 1;
		}else if(productType.equals("外壳")){
			num = 2;
		}else if(productType.equals("线路板")){
			num = 3;
		}else if(productType.equals("发射管")){
			num = 4;
		}else if(productType.equals("五金")){
			num = 5;
		}else if(productType.equals("IC")){
			num = 6;
		}else if(productType.equals("其他材料")){
			num = 7;
		}
		return num;
	}
	

	@Override
	public boolean deleteAllById(Product product) {
		
		return productMapperImpl.deleteAllById(product);
	}

	@Override
	public boolean InsertListModel(List<Product> product) {
		// TODO Auto-generated method stub
		return productMapperImpl.InsertListModel(product);
	}

	
	
	
	
}
