package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChubansheDao;
import com.entity.ChubansheEntity;
import com.service.ChubansheService;
import com.entity.vo.ChubansheVO;
import com.entity.view.ChubansheView;

@Service("chubansheService")
public class ChubansheServiceImpl extends ServiceImpl<ChubansheDao, ChubansheEntity> implements ChubansheService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChubansheEntity> page = this.selectPage(
                new Query<ChubansheEntity>(params).getPage(),
                new EntityWrapper<ChubansheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChubansheEntity> wrapper) {
		  Page<ChubansheView> page =new Query<ChubansheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChubansheVO> selectListVO(Wrapper<ChubansheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChubansheVO selectVO(Wrapper<ChubansheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChubansheView> selectListView(Wrapper<ChubansheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChubansheView selectView(Wrapper<ChubansheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
