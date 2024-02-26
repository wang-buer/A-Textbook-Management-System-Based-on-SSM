package com.entity.vo;

import com.entity.XueyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 学院
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
public class XueyuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学院
	 */
	
	private String xueyuan;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 学院位置
	 */
	
	private String xueyuanweizhi;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 学院详情
	 */
	
	private String xueyuanxiangqing;
				
	
	/**
	 * 设置：学院
	 */
	 
	public void setXueyuan(String xueyuan) {
		this.xueyuan = xueyuan;
	}
	
	/**
	 * 获取：学院
	 */
	public String getXueyuan() {
		return xueyuan;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：学院位置
	 */
	 
	public void setXueyuanweizhi(String xueyuanweizhi) {
		this.xueyuanweizhi = xueyuanweizhi;
	}
	
	/**
	 * 获取：学院位置
	 */
	public String getXueyuanweizhi() {
		return xueyuanweizhi;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：学院详情
	 */
	 
	public void setXueyuanxiangqing(String xueyuanxiangqing) {
		this.xueyuanxiangqing = xueyuanxiangqing;
	}
	
	/**
	 * 获取：学院详情
	 */
	public String getXueyuanxiangqing() {
		return xueyuanxiangqing;
	}
			
}
