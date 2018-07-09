package com.jiafan.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018\6\25 0025.
 */
public class Product {


    private int id;

    private String productName;   //产品型号

    private int productNum;    //产品数量

    private String userName;      //操作员

    private int remnantNum;       //剩余库存

    private int useNum;          //当天生产数量

    private int purchaseNum;      //当天采购数目

    private Date createTime;       //创建时间

    private String remark;         //备注
    
    private int productType;        //产品类型
    
    private String time;
    
    private String mic1;
    
    private String mic2;
    
    private Integer[] micx; 
    
    private String logmin;
    
    private String logmax;
    
    

	public Integer[] getMicx() {
		return micx;
	}

	public void setMicx(Integer[] micx) {
		this.micx = micx;
	}

	private int pageCount = 0;
    
    private int pageSize = 10;

    	
    public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getProductType() {
		return productType;
	}

	public void setProductType(int productType) {
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
        
        public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public void setRemark(String remark) {
            this.remark = remark;
        }

        public Date getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Date createTime) {
            this.createTime = createTime;
        }

		public String getMic1() {
			return mic1;
		}

		public void setMic1(String mic1) {
			this.mic1 = mic1;
		}

		public String getMic2() {
			return mic2;
		}

		public void setMic2(String mic2) {
			this.mic2 = mic2;
		}

		public String getLogmin() {
			return logmin;
		}

		public void setLogmin(String logmin) {
			this.logmin = logmin;
		}

		public String getLogmax() {
			return logmax;
		}

		public void setLogmax(String logmax) {
			this.logmax = logmax;
		}
		
		
        
}
