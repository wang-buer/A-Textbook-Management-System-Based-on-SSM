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
 * 教材分配
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
@TableName("jiaocaifenpei")
public class JiaocaifenpeiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaocaifenpeiEntity() {
		
	}
	
	public JiaocaifenpeiEntity(T t) {
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
	 * 分配编号
	 */
					
	private String fenpeibianhao;
	
	/**
	 * 分配学院
	 */
					
	private String fenpeixueyuan;
	
	/**
	 * 教材名称
	 */
					
	private String jiaocaimingcheng;
	
	/**
	 * 教材封面
	 */
					
	private String jiaocaifengmian;
	
	/**
	 * 分配时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fenpeishijian;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 出版社
	 */
					
	private String chubanshe;
	
	/**
	 * 分配详情
	 */
					
	private String fenpeixiangqing;
	
	
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
	 * 设置：分配编号
	 */
	public void setFenpeibianhao(String fenpeibianhao) {
		this.fenpeibianhao = fenpeibianhao;
	}
	/**
	 * 获取：分配编号
	 */
	public String getFenpeibianhao() {
		return fenpeibianhao;
	}
	/**
	 * 设置：分配学院
	 */
	public void setFenpeixueyuan(String fenpeixueyuan) {
		this.fenpeixueyuan = fenpeixueyuan;
	}
	/**
	 * 获取：分配学院
	 */
	public String getFenpeixueyuan() {
		return fenpeixueyuan;
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
	 * 设置：分配时间
	 */
	public void setFenpeishijian(Date fenpeishijian) {
		this.fenpeishijian = fenpeishijian;
	}
	/**
	 * 获取：分配时间
	 */
	public Date getFenpeishijian() {
		return fenpeishijian;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
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
	 * 设置：分配详情
	 */
	public void setFenpeixiangqing(String fenpeixiangqing) {
		this.fenpeixiangqing = fenpeixiangqing;
	}
	/**
	 * 获取：分配详情
	 */
	public String getFenpeixiangqing() {
		return fenpeixiangqing;
	}

}
