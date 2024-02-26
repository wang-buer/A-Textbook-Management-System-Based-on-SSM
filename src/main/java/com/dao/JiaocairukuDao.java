package com.dao;

import com.entity.JiaocairukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaocairukuVO;
import com.entity.view.JiaocairukuView;


/**
 * 教材入库
 * 
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
public interface JiaocairukuDao extends BaseMapper<JiaocairukuEntity> {
	
	List<JiaocairukuVO> selectListVO(@Param("ew") Wrapper<JiaocairukuEntity> wrapper);
	
	JiaocairukuVO selectVO(@Param("ew") Wrapper<JiaocairukuEntity> wrapper);
	
	List<JiaocairukuView> selectListView(@Param("ew") Wrapper<JiaocairukuEntity> wrapper);

	List<JiaocairukuView> selectListView(Pagination page,@Param("ew") Wrapper<JiaocairukuEntity> wrapper);
	
	JiaocairukuView selectView(@Param("ew") Wrapper<JiaocairukuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaocairukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaocairukuEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaocairukuEntity> wrapper);
}
