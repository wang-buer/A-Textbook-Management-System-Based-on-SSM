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


import com.dao.JiaocaidinggouDao;
import com.entity.JiaocaidinggouEntity;
import com.service.JiaocaidinggouService;
import com.entity.vo.JiaocaidinggouVO;
import com.entity.view.JiaocaidinggouView;

@Service("jiaocaidinggouService")
public class JiaocaidinggouServiceImpl extends ServiceImpl<JiaocaidinggouDao, JiaocaidinggouEntity> implements JiaocaidinggouService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaocaidinggouEntity> page = this.selectPage(
                new Query<JiaocaidinggouEntity>(params).getPage(),
                new EntityWrapper<JiaocaidinggouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaocaidinggouEntity> wrapper) {
		  Page<JiaocaidinggouView> page =new Query<JiaocaidinggouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaocaidinggouVO> selectListVO(Wrapper<JiaocaidinggouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaocaidinggouVO selectVO(Wrapper<JiaocaidinggouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaocaidinggouView> selectListView(Wrapper<JiaocaidinggouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaocaidinggouView selectView(Wrapper<JiaocaidinggouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
