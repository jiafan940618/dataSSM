package com.jiafan.utils;

import java.util.List;
import java.util.Map;

import com.jiafan.utils.ResultData;

/**
 * 数据返回
 * Created by hy-03 on 2017/7/19.
 */
public class ResultVOUtil {

    public static ResultData<Object> success(Object object) {
        ResultData resultData = new ResultData();
        resultData.setCode(200);
        resultData.setMsg("成功");
        resultData.setSuccess(true);
        resultData.setData(object);
        return resultData;
    }
    
    public static  ResultData<Object> newhsuccess(Object object,Map<String,String> map) {
    	ResultData resultData = new ResultData();
        
        resultData.setCode(200);
        resultData.setMsg("成功");
        resultData.setSuccess(true);
        resultData.setData(object);
        resultData.setMap(map);
        return resultData;
    }

    
   
    
 /*   public static ResultData<Object> aginsuccess(Object object,List<PriceVo> list,List<Apolegamy> listapo,ProductionDetail production) {
        ResultData resultData = new ResultData();
        resultData.setCode(200);
        resultData.setMsg("成功");
        resultData.setSuccess(true);
        resultData.setData(object);
        resultData.setList(list);
        return resultData;
    }*/
    
    

    public static ResultData<Object> success() {
        return success(null);
    }

    public static ResultData<Object> error(Integer code, String msg) {
        ResultData resultData = new ResultData();
        resultData.setCode(code);
        resultData.setMsg(msg);
        resultData.setSuccess(false);
        resultData.setData(null);
        return resultData;
    }
    
}
