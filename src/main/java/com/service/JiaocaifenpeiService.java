package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaocaifenpeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaocaifenpeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaocaifenpeiView;


/**
 * 教材分配
 *
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
public interface JiaocaifenpeiService extends IService<JiaocaifenpeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaocaifenpeiVO> selectListVO(Wrapper<JiaocaifenpeiEntity> wrapper);
   	
   	JiaocaifenpeiVO selectVO(@Param("ew") Wrapper<JiaocaifenpeiEntity> wrapper);
   	
   	List<JiaocaifenpeiView> selectListView(Wrapper<JiaocaifenpeiEntity> wrapper);
   	
   	JiaocaifenpeiView selectView(@Param("ew") Wrapper<JiaocaifenpeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaocaifenpeiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JiaocaifenpeiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JiaocaifenpeiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JiaocaifenpeiEntity> wrapper);
}

