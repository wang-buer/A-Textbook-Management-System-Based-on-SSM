package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChubansheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChubansheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChubansheView;


/**
 * 出版社
 *
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
public interface ChubansheService extends IService<ChubansheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChubansheVO> selectListVO(Wrapper<ChubansheEntity> wrapper);
   	
   	ChubansheVO selectVO(@Param("ew") Wrapper<ChubansheEntity> wrapper);
   	
   	List<ChubansheView> selectListView(Wrapper<ChubansheEntity> wrapper);
   	
   	ChubansheView selectView(@Param("ew") Wrapper<ChubansheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChubansheEntity> wrapper);
   	

}

