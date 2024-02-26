package com.entity.view;

import com.entity.ChubansheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 出版社
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
@TableName("chubanshe")
public class ChubansheView  extends ChubansheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChubansheView(){
	}
 
 	public ChubansheView(ChubansheEntity chubansheEntity){
 	try {
			BeanUtils.copyProperties(this, chubansheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
