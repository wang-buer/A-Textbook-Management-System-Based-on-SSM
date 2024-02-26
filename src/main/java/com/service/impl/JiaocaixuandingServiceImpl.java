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


import com.dao.JiaocaixuandingDao;
import com.entity.JiaocaixuandingEntity;
import com.service.JiaocaixuandingService;
import com.entity.vo.JiaocaixuandingVO;
import com.entity.view.JiaocaixuandingView;

@Service("jiaocaixuandingService")
public class JiaocaixuandingServiceImpl extends ServiceImpl<JiaocaixuandingDao, JiaocaixuandingEntity> implements JiaocaixuandingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaocaixuandingEntity> page = this.selectPage(
                new Query<JiaocaixuandingEntity>(params).getPage(),
                new EntityWrapper<JiaocaixuandingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaocaixuandingEntity> wrapper) {
		  Page<JiaocaixuandingView> page =new Query<JiaocaixuandingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaocaixuandingVO> selectListVO(Wrapper<JiaocaixuandingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaocaixuandingVO selectVO(Wrapper<JiaocaixuandingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaocaixuandingView> selectListView(Wrapper<JiaocaixuandingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaocaixuandingView selectView(Wrapper<JiaocaixuandingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
