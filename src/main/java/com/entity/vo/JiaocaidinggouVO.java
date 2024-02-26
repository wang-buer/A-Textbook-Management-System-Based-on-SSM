package com.entity.vo;

import com.entity.JiaocaidinggouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 教材订购
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
public class JiaocaidinggouVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教材名称
	 */
	
	private String jiaocaimingcheng;
		
	/**
	 * 教材封面
	 */
	
	private String jiaocaifengmian;
		
	/**
	 * 订购时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dinggoushijian;
		
	/**
	 * 订购数量
	 */
	
	private Integer dinggoushuliang;
		
	/**
	 * 订购价
	 */
	
	private Float dinggoujia;
		
	/**
	 * 出版社
	 */
	
	private String chubanshe;
		
	/**
	 * 订购详情
	 */
	
	private String dinggouxiangqing;
				
	
	/**
	 * 设置：教材名称
	 */
	 
	public void setJiaocaimingcheng(String jiaocaimingcheng) {
		this.jiaocaimingcheng = jiaocaimingcheng;
	}
	
	/**
	 * 获取：教材名称
	 */
	public String getJiaocaimingcheng() {
		return jiaocaimingcheng;
	}
				
	
	/**
	 * 设置：教材封面
	 */
	 
	public void setJiaocaifengmian(String jiaocaifengmian) {
		this.jiaocaifengmian = jiaocaifengmian;
	}
	
	/**
	 * 获取：教材封面
	 */
	public String getJiaocaifengmian() {
		return jiaocaifengmian;
	}
				
	
	/**
	 * 设置：订购时间
	 */
	 
	public void setDinggoushijian(Date dinggoushijian) {
		this.dinggoushijian = dinggoushijian;
	}
	
	/**
	 * 获取：订购时间
	 */
	public Date getDinggoushijian() {
		return dinggoushijian;
	}
				
	
	/**
	 * 设置：订购数量
	 */
	 
	public void setDinggoushuliang(Integer dinggoushuliang) {
		this.dinggoushuliang = dinggoushuliang;
	}
	
	/**
	 * 获取：订购数量
	 */
	public Integer getDinggoushuliang() {
		return dinggoushuliang;
	}
				
	
	/**
	 * 设置：订购价
	 */
	 
	public void setDinggoujia(Float dinggoujia) {
		this.dinggoujia = dinggoujia;
	}
	
	/**
	 * 获取：订购价
	 */
	public Float getDinggoujia() {
		return dinggoujia;
	}
				
	
	/**
	 * 设置：出版社
	 */
	 
	public void setChubanshe(String chubanshe) {
		this.chubanshe = chubanshe;
	}
	
	/**
	 * 获取：出版社
	 */
	public String getChubanshe() {
		return chubanshe;
	}
				
	
	/**
	 * 设置：订购详情
	 */
	 
	public void setDinggouxiangqing(String dinggouxiangqing) {
		this.dinggouxiangqing = dinggouxiangqing;
	}
	
	/**
	 * 获取：订购详情
	 */
	public String getDinggouxiangqing() {
		return dinggouxiangqing;
	}
			
}
