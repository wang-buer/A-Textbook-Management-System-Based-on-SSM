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


import com.dao.JiaocaifenpeiDao;
import com.entity.JiaocaifenpeiEntity;
import com.service.JiaocaifenpeiService;
import com.entity.vo.JiaocaifenpeiVO;
import com.entity.view.JiaocaifenpeiView;

@Service("jiaocaifenpeiService")
public class JiaocaifenpeiServiceImpl extends ServiceImpl<JiaocaifenpeiDao, JiaocaifenpeiEntity> implements JiaocaifenpeiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaocaifenpeiEntity> page = this.selectPage(
                new Query<JiaocaifenpeiEntity>(params).getPage(),
                new EntityWrapper<JiaocaifenpeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaocaifenpeiEntity> wrapper) {
		  Page<JiaocaifenpeiView> page =new Query<JiaocaifenpeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaocaifenpeiVO> selectListVO(Wrapper<JiaocaifenpeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaocaifenpeiVO selectVO(Wrapper<JiaocaifenpeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaocaifenpeiView> selectListView(Wrapper<JiaocaifenpeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaocaifenpeiView selectView(Wrapper<JiaocaifenpeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<JiaocaifenpeiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<JiaocaifenpeiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<JiaocaifenpeiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
