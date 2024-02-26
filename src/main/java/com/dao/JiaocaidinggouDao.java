package com.dao;

import com.entity.JiaocaidinggouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaocaidinggouVO;
import com.entity.view.JiaocaidinggouView;


/**
 * 教材订购
 * 
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
public interface JiaocaidinggouDao extends BaseMapper<JiaocaidinggouEntity> {
	
	List<JiaocaidinggouVO> selectListVO(@Param("ew") Wrapper<JiaocaidinggouEntity> wrapper);
	
	JiaocaidinggouVO selectVO(@Param("ew") Wrapper<JiaocaidinggouEntity> wrapper);
	
	List<JiaocaidinggouView> selectListView(@Param("ew") Wrapper<JiaocaidinggouEntity> wrapper);

	List<JiaocaidinggouView> selectListView(Pagination page,@Param("ew") Wrapper<JiaocaidinggouEntity> wrapper);
	
	JiaocaidinggouView selectView(@Param("ew") Wrapper<JiaocaidinggouEntity> wrapper);
	

}
