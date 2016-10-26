package com.softfactory.core.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.softfactory.core.dao.LbManufactureMapper;
import com.softfactory.core.util.Pager;
import com.softfactory.pojo.Manufacture;

@Service("lbManufactureService")
public class LbManufactureService {
	
	@Resource(name="lbManufactureMapper")
	private LbManufactureMapper lbManufactureMapper;

	public Manufacture findById(String manufactureid) {
		
		return lbManufactureMapper.findById(manufactureid);
	}

	public Pager<Manufacture> findPager(Integer pageno, Integer pagesize,
			String sort, String order) {
		Pager<Manufacture>pager=new Pager<Manufacture>();
		pager.setRows(lbManufactureMapper.findPaper(pageno, pagesize, sort, order));
		pager.setTotal(lbManufactureMapper.findPagerTotal());
		return pager;
	}

}
