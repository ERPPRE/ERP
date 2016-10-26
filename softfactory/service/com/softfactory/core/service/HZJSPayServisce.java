package com.softfactory.core.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.softfactory.core.dao.HZJSPayMapper;
import com.softfactory.core.util.Pager;
import com.softfactory.pojo.SPay;
/**
 * 入库业务逻辑
 * @author Administrator
 *
 */
@Service("hzjspayService")
public class HZJSPayServisce {
	@Resource(name = "hzjspayMapper")
	private HZJSPayMapper hzjspayMapper;

	public Pager<SPay> findPager(Integer pageno, Integer pagesize, String sort,
			String order, String payId) {
		Pager<SPay> pager = new Pager<SPay>();
		// 设置分页数据
		pager.setRows(hzjspayMapper.findPager(pageno, pagesize, sort, order,
				payId));
		// 设置数据总数 
		pager.setTotal(hzjspayMapper.findPagerTotal(payId));
		return pager;
	}

	public int add(SPay spay) {
		return hzjspayMapper.add(spay);
	}

	public int modify(SPay spay) {
		return hzjspayMapper.modify(spay);
	}


	public SPay findById(Integer payId) {
		return hzjspayMapper.findById(payId);
	}
}
