package com.jiafan.entity;

import java.util.Date;

import com.jiafan.utils.ExcelDesc;


/**
 * 导出实体的工具类
 *  */
public class ProductExcel {
	
	@ExcelDesc(value="ID",orderBy="1")
	private int id;
	@ExcelDesc(value="产品型号",orderBy="2")
    private String productName;   //产品型号
	@ExcelDesc(value="产品数量",orderBy="3")
    private int productNum;    //产品数量
	@ExcelDesc(value="操作员",orderBy="4")
    private String userName;      //操作员
	@ExcelDesc(value="剩余库存",orderBy="5")
    private int remnantNum;       //剩余库存
	@ExcelDesc(value="当天生产数量",orderBy="6")
    private int useNum;          //当天生产数量
	@ExcelDesc(value="当天采购数目",orderBy="7")
    private int purchaseNum;      //当天采购数目
	@ExcelDesc(value="产品类型",orderBy="8")
	private String productType;        //产品类型
	
	@ExcelDesc(value="创建时间",orderBy="9")
    private String createTime;       //创建时间
	@ExcelDesc(value="备注",orderBy="10")
    private String remark;         //备注
	
	
	
	
	
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductNum() {
		return productNum;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getRemnantNum() {
		return remnantNum;
	}
	public void setRemnantNum(int remnantNum) {
		this.remnantNum = remnantNum;
	}
	public int getUseNum() {
		return useNum;
	}
	public void setUseNum(int useNum) {
		this.useNum = useNum;
	}
	public int getPurchaseNum() {
		return purchaseNum;
	}
	public void setPurchaseNum(int purchaseNum) {
		this.purchaseNum = purchaseNum;
	}
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	
}
