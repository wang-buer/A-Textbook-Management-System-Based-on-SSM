package com.entity.view;

import com.entity.JiaocaixuandingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教材选定
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
@TableName("jiaocaixuanding")
public class JiaocaixuandingView  extends JiaocaixuandingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaocaixuandingView(){
	}
 
 	public JiaocaixuandingView(JiaocaixuandingEntity jiaocaixuandingEntity){
 	try {
			BeanUtils.copyProperties(this, jiaocaixuandingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
