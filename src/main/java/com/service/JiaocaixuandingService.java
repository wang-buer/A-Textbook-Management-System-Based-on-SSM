package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaocaixuandingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaocaixuandingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaocaixuandingView;


/**
 * 教材选定
 *
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
public interface JiaocaixuandingService extends IService<JiaocaixuandingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaocaixuandingVO> selectListVO(Wrapper<JiaocaixuandingEntity> wrapper);
   	
   	JiaocaixuandingVO selectVO(@Param("ew") Wrapper<JiaocaixuandingEntity> wrapper);
   	
   	List<JiaocaixuandingView> selectListView(Wrapper<JiaocaixuandingEntity> wrapper);
   	
   	JiaocaixuandingView selectView(@Param("ew") Wrapper<JiaocaixuandingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaocaixuandingEntity> wrapper);
   	

}

