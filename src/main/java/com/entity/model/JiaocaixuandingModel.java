package com.entity.model;

import com.entity.JiaocaixuandingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 教材选定
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
public class JiaocaixuandingModel  implements Serializable {
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
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 出版社
	 */
	
	private String chubanshe;
		
	/**
	 * 选定详情
	 */
	
	private String xuandingxiangqing;
				
	
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
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
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
	 * 设置：选定详情
	 */
	 
	public void setXuandingxiangqing(String xuandingxiangqing) {
		this.xuandingxiangqing = xuandingxiangqing;
	}
	
	/**
	 * 获取：选定详情
	 */
	public String getXuandingxiangqing() {
		return xuandingxiangqing;
	}
			
}
