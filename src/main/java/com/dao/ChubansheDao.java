package com.dao;

import com.entity.ChubansheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChubansheVO;
import com.entity.view.ChubansheView;


/**
 * 出版社
 * 
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
public interface ChubansheDao extends BaseMapper<ChubansheEntity> {
	
	List<ChubansheVO> selectListVO(@Param("ew") Wrapper<ChubansheEntity> wrapper);
	
	ChubansheVO selectVO(@Param("ew") Wrapper<ChubansheEntity> wrapper);
	
	List<ChubansheView> selectListView(@Param("ew") Wrapper<ChubansheEntity> wrapper);

	List<ChubansheView> selectListView(Pagination page,@Param("ew") Wrapper<ChubansheEntity> wrapper);
	
	ChubansheView selectView(@Param("ew") Wrapper<ChubansheEntity> wrapper);
	

}
