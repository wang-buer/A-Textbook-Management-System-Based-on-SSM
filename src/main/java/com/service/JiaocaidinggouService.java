package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaocaidinggouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaocaidinggouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaocaidinggouView;


/**
 * 教材订购
 *
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
public interface JiaocaidinggouService extends IService<JiaocaidinggouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaocaidinggouVO> selectListVO(Wrapper<JiaocaidinggouEntity> wrapper);
   	
   	JiaocaidinggouVO selectVO(@Param("ew") Wrapper<JiaocaidinggouEntity> wrapper);
   	
   	List<JiaocaidinggouView> selectListView(Wrapper<JiaocaidinggouEntity> wrapper);
   	
   	JiaocaidinggouView selectView(@Param("ew") Wrapper<JiaocaidinggouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaocaidinggouEntity> wrapper);
   	

}

