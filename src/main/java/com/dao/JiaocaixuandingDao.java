package com.dao;

import com.entity.JiaocaixuandingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaocaixuandingVO;
import com.entity.view.JiaocaixuandingView;


/**
 * 教材选定
 * 
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
public interface JiaocaixuandingDao extends BaseMapper<JiaocaixuandingEntity> {
	
	List<JiaocaixuandingVO> selectListVO(@Param("ew") Wrapper<JiaocaixuandingEntity> wrapper);
	
	JiaocaixuandingVO selectVO(@Param("ew") Wrapper<JiaocaixuandingEntity> wrapper);
	
	List<JiaocaixuandingView> selectListView(@Param("ew") Wrapper<JiaocaixuandingEntity> wrapper);

	List<JiaocaixuandingView> selectListView(Pagination page,@Param("ew") Wrapper<JiaocaixuandingEntity> wrapper);
	
	JiaocaixuandingView selectView(@Param("ew") Wrapper<JiaocaixuandingEntity> wrapper);
	

}
