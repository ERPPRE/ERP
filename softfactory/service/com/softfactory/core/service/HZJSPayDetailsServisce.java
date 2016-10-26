package com.softfactory.core.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.softfactory.core.dao.HZJSPayDetailsMapper;
import com.softfactory.core.util.Pager;
import com.softfactory.pojo.SPayDetails;
/**
 * 入库明细业务逻辑
 * @author Administrator
 *
 */
@Service("hzjspaydetailsServisce")
public class HZJSPayDetailsServisce {
	@Resource(name = "hzjspaydetailsMapper")
	private HZJSPayDetailsMapper hzjspaydetailsMapper;

	public Pager<SPayDetails> findPager(Integer pageno, Integer pagesize, String sort,
			String order, String parentId) {
		Pager<SPayDetails> pager = new Pager<SPayDetails>();
		// 设置分页数据
		pager.setRows(hzjspaydetailsMapper.findPager(pageno, pagesize, sort, order,
				parentId));
		// 设置数据总数
		pager.setTotal(hzjspaydetailsMapper.findPagerTotal(parentId));
		return pager;
	}

	public int add(SPayDetails spaydetails) {
		return hzjspaydetailsMapper.add(spaydetails);
	}


	public SPayDetails findById(Integer parentId) {
		return hzjspaydetailsMapper.findById(parentId);
	}
}
