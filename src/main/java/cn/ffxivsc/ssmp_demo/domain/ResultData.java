package cn.ffxivsc.ssmp_demo.domain;

import lombok.Data;

@Data
public class ResultData {
    public int status ;
    public Object data ;

    public static ResultData build(int status , Object data){
        ResultData resultData = new ResultData();
        resultData.setStatus(status);
        resultData.setData(data);
        return resultData;
    }
    public static ResultData build(int status){
        return build(status,null);
    }
}
