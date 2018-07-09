package com.jiafan.controller;

import com.jiafan.dao.ProductDao;
import com.jiafan.dao.ProductTypeDao;
import com.jiafan.entity.Product;
import com.jiafan.entity.ProductExcel;
import com.jiafan.entity.ProductType;
import com.jiafan.service.ProductService;
import com.jiafan.service.ProductTypeService;
import com.jiafan.utils.ExcelUtil;
import com.jiafan.utils.JSONUtils;
import com.jiafan.utils.WebFileUtils;

import net.sf.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Administrator on 2018\6\25 0025.
 */
@Controller
@RequestMapping(value="/product")
public class ProductController {

    private Logger logger  = LoggerFactory.getLogger(ProductController.class);

  
    
    private String productName;
    
    @Autowired
    ProductService productService;
    @Autowired
    ProductTypeService productTypeService ;
    
    @Autowired
    ProductTypeDao productTypeDao;


    @RequestMapping(value="/skips")
    public String doSelect(HttpServletResponse response){
    	
    	
 
    	return "index";
    }
	//@RequestParam String aoData,
	   @RequestMapping(value="/selectAll")
	   @ResponseBody
	    public void doSelectAll(@RequestBody Product product, HttpServletResponse response){
		  response.setContentType("text/html;charset=utf-8");
		  List<Product> pro = new ArrayList<Product>();
/*
			 int count = 0;
			 
			 if(product.getPageCount() == 0){
				 product.setPageCount(1);
				 
			 }
			 count = (product.getPageCount()-1)*product.getPageSize();
			 
			 product.setPageCount(count);*/
			 
			 pro =	productService.selectAll(product);
			 
			 Integer total =  productService.selectCount(product);
				 
		    
		    for (Product products : pro) {
		    	String mic1 = products.getId()+"";
		    /*	String mic1 ="<td style='text-align:center'><input type='checkbox' value='"+products.getId()+"' name='checkId'></td>";*/
		    	String mic2 ="<td style='text-align:center' class='f-14 td-manage'><a style='text-decoration:none'"+
				"class='ml-5' onClick=\"article_edit('编辑','../HTML/product-edit.html?id=','"+products.getId()+"')\" href='javascript:;'"+
				" title='编辑'><i class='Hui-iconfont'>&#xe6df;</i></a>"+
               "<a style='text-decoration:none' class='ml-5' onClick=\"article_del(this,'"+products.getId()+"')\" href='javascript:;'"+
               " title='删除'><i class='Hui-iconfont'>&#xe6e2;</i></a></td>";
		    	products.setMic1(mic1);
		    	products.setMic2(mic2);
		    	
		    	SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		        String newTime=	simple.format(products.getCreateTime());
		    	
		        products.setTime(newTime);
				
			}
	
		    String json =  JSONUtils.toJSONString(pro);
		    String sEcho =  JSONUtils.toJSONString(product);
		    
		    JSONObject getObj = new JSONObject();
		    getObj.put("sEcho", "");//参数回显字段
		    getObj.put("page",pro.size());//实际的行数
		    getObj.put("total", total);//显示的行数,这个要和上面写的一样
		     
		    getObj.put("data", json);//要以JSON格式返回

		    
		    try {
				response.getWriter().println(getObj.toString());
				response.getWriter().flush();
				response.getWriter().close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};	
        
    }

	  

    @RequestMapping(value="/selectProT")
    public void SelectProT(HttpServletResponse response){
    	response.setContentType("text/html;charset=utf-8");
    	
    	List<ProductType> proType =  productTypeService.selectAll();
    	
    	String json =  JSONUtils.toJSONString(proType);
    	
    	try {
			response.getWriter().println(json);
			response.getWriter().flush();
			response.getWriter().close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};	
    }
    
    @RequestMapping(value="/addProduct",method=RequestMethod.POST)
    @ResponseBody
    public String AddProT(Product product, HttpServletResponse response){
    	response.setContentType("text/html;charset=utf-8");
    
    	boolean flag = productService.InsertModel(product);
    	
    	String json =  JSONUtils.toJSONString(flag);

		return json;
    }
    
    @RequestMapping(value="/delProduct")
    @ResponseBody 
    public String DelProT(@RequestBody Product product,HttpServletResponse response){
    	response.setContentType("text/html;charset=utf-8");
    	
    	boolean flag = productService.deleteById(product);
    	String json =  JSONUtils.toJSONString(flag);
    	
    	return json; 
    }
    
    @RequestMapping(value="/delAllProduct")
    @ResponseBody 
    public String DelAllProT(@RequestBody Product product,HttpServletResponse response){
    	response.setContentType("text/html;charset=utf-8");
    	boolean flag  = false;
    	if(product.getMicx().length == 0){
    		flag = false;
    	}else{
    	
    		flag = productService.deleteAllById(product);
    	}
    	String json =  JSONUtils.toJSONString(flag);
    	
    	return json; 
    }
    
    
    @RequestMapping(value="/editProduct")
    @ResponseBody 
    public String editProT(@RequestBody Product product,HttpServletResponse response){
    	response.setContentType("text/html;charset=utf-8");
    	
    	boolean flag = productService.updateById(product);
    	String json =  JSONUtils.toJSONString(flag);
    	
		return json;  
    }
    
    @RequestMapping(value="/selProduct")
    @ResponseBody
    public Product selProT(@RequestBody Product product,HttpServletResponse response){
    	response.setContentType("text/html;charset=utf-8");
    	
    	product = productService.FindById(product);

		return product;
    	
    }
    
    
    @RequestMapping(value="/excelProduct")
    public void excelProT(Product product,HttpServletResponse response){
    	response.setContentType("text/html;charset=utf-8");
    	List<Product> product2 =	productService.selectAll(product);
    	
    	List<ProductExcel> productExcels = productService.toExcel(product2);
    	
    	try {
			ExcelUtil.exportExcel(productExcels, "产品统计报表", "产品数量列表", response, false);
		} catch (IllegalAccessException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    
    
    /**
     * 导入商品价格报表
     * utils.xls
     * @RequestParam(value = "excel") MultipartFile excel
     */
    @SuppressWarnings("finally")
	@RequestMapping(value = "/product_list")
    @ResponseBody
    public String importProductExcel(@RequestParam(value = "excel") MultipartFile excel) {
    	
    	boolean flag = false;
    	
        try {

            ExcelUtil<ProductExcel> util = new ExcelUtil<ProductExcel>(ProductExcel.class);// 创建excel工具类
            List<ProductExcel> list = util.importExcel(excel.getOriginalFilename(),"产品统计报表", excel.getInputStream());// 导出
            for (ProductExcel productExcel : list) {
            	  System.out.println("产品名称：--"+productExcel.getProductName()+"数量--："+productExcel.getProductNum());
			}
          
            List<Product> listpro =  productService.toProduct(list);
 
            flag =  productService.InsertListModel(listpro);	
 
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
        	if(flag){
        		 return "success";
        	}
        	     return "error";
        }

    }

    
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
    
}
