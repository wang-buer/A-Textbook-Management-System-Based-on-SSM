package com.entity.view;

import com.entity.JiaocaifenpeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教材分配
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
@TableName("jiaocaifenpei")
public class JiaocaifenpeiView  extends JiaocaifenpeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaocaifenpeiView(){
	}
 
 	public JiaocaifenpeiView(JiaocaifenpeiEntity jiaocaifenpeiEntity){
 	try {
			BeanUtils.copyProperties(this, jiaocaifenpeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
