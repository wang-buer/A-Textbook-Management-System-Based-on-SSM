package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 教材订购
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
@TableName("jiaocaidinggou")
public class JiaocaidinggouEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaocaidinggouEntity() {
		
	}
	
	public JiaocaidinggouEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 订购编号
	 */
					
	private String dinggoubianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：订购编号
	 */
	public void setDinggoubianhao(String dinggoubianhao) {
		this.dinggoubianhao = dinggoubianhao;
	}
	/**
	 * 获取：订购编号
	 */
	public String getDinggoubianhao() {
		return dinggoubianhao;
	}
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
