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


import com.dao.JiaocaiDao;
import com.entity.JiaocaiEntity;
import com.service.JiaocaiService;
import com.entity.vo.JiaocaiVO;
import com.entity.view.JiaocaiView;

@Service("jiaocaiService")
public class JiaocaiServiceImpl extends ServiceImpl<JiaocaiDao, JiaocaiEntity> implements JiaocaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaocaiEntity> page = this.selectPage(
                new Query<JiaocaiEntity>(params).getPage(),
                new EntityWrapper<JiaocaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaocaiEntity> wrapper) {
		  Page<JiaocaiView> page =new Query<JiaocaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaocaiVO> selectListVO(Wrapper<JiaocaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaocaiVO selectVO(Wrapper<JiaocaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaocaiView> selectListView(Wrapper<JiaocaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaocaiView selectView(Wrapper<JiaocaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<JiaocaiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<JiaocaiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<JiaocaiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
