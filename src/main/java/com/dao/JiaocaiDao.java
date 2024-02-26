package com.dao;

import com.entity.JiaocaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaocaiVO;
import com.entity.view.JiaocaiView;


/**
 * 教材
 * 
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
public interface JiaocaiDao extends BaseMapper<JiaocaiEntity> {
	
	List<JiaocaiVO> selectListVO(@Param("ew") Wrapper<JiaocaiEntity> wrapper);
	
	JiaocaiVO selectVO(@Param("ew") Wrapper<JiaocaiEntity> wrapper);
	
	List<JiaocaiView> selectListView(@Param("ew") Wrapper<JiaocaiEntity> wrapper);

	List<JiaocaiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaocaiEntity> wrapper);
	
	JiaocaiView selectView(@Param("ew") Wrapper<JiaocaiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaocaiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaocaiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaocaiEntity> wrapper);
}
