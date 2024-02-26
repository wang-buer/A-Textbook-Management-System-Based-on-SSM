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
 * 学院
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
@TableName("xueyuan")
public class XueyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XueyuanEntity() {
		
	}
	
	public XueyuanEntity(T t) {
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
	 * 学院编号
	 */
					
	private String xueyuanbianhao;
	
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
	 * 设置：学院编号
	 */
	public void setXueyuanbianhao(String xueyuanbianhao) {
		this.xueyuanbianhao = xueyuanbianhao;
	}
	/**
	 * 获取：学院编号
	 */
	public String getXueyuanbianhao() {
		return xueyuanbianhao;
	}
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
