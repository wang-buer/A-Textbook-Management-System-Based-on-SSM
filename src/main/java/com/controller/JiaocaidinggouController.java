package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiaocaidinggouEntity;
import com.entity.view.JiaocaidinggouView;

import com.service.JiaocaidinggouService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 教材订购
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-30 17:40:37
 */
@RestController
@RequestMapping("/jiaocaidinggou")
public class JiaocaidinggouController {
    @Autowired
    private JiaocaidinggouService jiaocaidinggouService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaocaidinggouEntity jiaocaidinggou, 
		HttpServletRequest request){

        EntityWrapper<JiaocaidinggouEntity> ew = new EntityWrapper<JiaocaidinggouEntity>();
    	PageUtils page = jiaocaidinggouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaocaidinggou), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaocaidinggouEntity jiaocaidinggou, 
		HttpServletRequest request){
        EntityWrapper<JiaocaidinggouEntity> ew = new EntityWrapper<JiaocaidinggouEntity>();
    	PageUtils page = jiaocaidinggouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaocaidinggou), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaocaidinggouEntity jiaocaidinggou){
       	EntityWrapper<JiaocaidinggouEntity> ew = new EntityWrapper<JiaocaidinggouEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaocaidinggou, "jiaocaidinggou")); 
        return R.ok().put("data", jiaocaidinggouService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaocaidinggouEntity jiaocaidinggou){
        EntityWrapper< JiaocaidinggouEntity> ew = new EntityWrapper< JiaocaidinggouEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaocaidinggou, "jiaocaidinggou")); 
		JiaocaidinggouView jiaocaidinggouView =  jiaocaidinggouService.selectView(ew);
		return R.ok("查询教材订购成功").put("data", jiaocaidinggouView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaocaidinggouEntity jiaocaidinggou = jiaocaidinggouService.selectById(id);
        return R.ok().put("data", jiaocaidinggou);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaocaidinggouEntity jiaocaidinggou = jiaocaidinggouService.selectById(id);
        return R.ok().put("data", jiaocaidinggou);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaocaidinggouEntity jiaocaidinggou, HttpServletRequest request){
    	jiaocaidinggou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaocaidinggou);

        jiaocaidinggouService.insert(jiaocaidinggou);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaocaidinggouEntity jiaocaidinggou, HttpServletRequest request){
    	jiaocaidinggou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaocaidinggou);

        jiaocaidinggouService.insert(jiaocaidinggou);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiaocaidinggouEntity jiaocaidinggou, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaocaidinggou);
        jiaocaidinggouService.updateById(jiaocaidinggou);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaocaidinggouService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiaocaidinggouEntity> wrapper = new EntityWrapper<JiaocaidinggouEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jiaocaidinggouService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
