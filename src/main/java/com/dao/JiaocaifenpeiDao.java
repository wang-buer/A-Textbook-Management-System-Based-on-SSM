package com.dao;

import com.entity.JiaocaifenpeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaocaifenpeiVO;
import com.entity.view.JiaocaifenpeiView;


/**
 * 教材分配
 * 
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
public interface JiaocaifenpeiDao extends BaseMapper<JiaocaifenpeiEntity> {
	
	List<JiaocaifenpeiVO> selectListVO(@Param("ew") Wrapper<JiaocaifenpeiEntity> wrapper);
	
	JiaocaifenpeiVO selectVO(@Param("ew") Wrapper<JiaocaifenpeiEntity> wrapper);
	
	List<JiaocaifenpeiView> selectListView(@Param("ew") Wrapper<JiaocaifenpeiEntity> wrapper);

	List<JiaocaifenpeiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaocaifenpeiEntity> wrapper);
	
	JiaocaifenpeiView selectView(@Param("ew") Wrapper<JiaocaifenpeiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaocaifenpeiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaocaifenpeiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaocaifenpeiEntity> wrapper);
}
