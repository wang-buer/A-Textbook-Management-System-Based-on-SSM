package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaocaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaocaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaocaiView;


/**
 * 教材
 *
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
public interface JiaocaiService extends IService<JiaocaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaocaiVO> selectListVO(Wrapper<JiaocaiEntity> wrapper);
   	
   	JiaocaiVO selectVO(@Param("ew") Wrapper<JiaocaiEntity> wrapper);
   	
   	List<JiaocaiView> selectListView(Wrapper<JiaocaiEntity> wrapper);
   	
   	JiaocaiView selectView(@Param("ew") Wrapper<JiaocaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaocaiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JiaocaiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JiaocaiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JiaocaiEntity> wrapper);
}

