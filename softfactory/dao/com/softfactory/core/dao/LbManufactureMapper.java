package com.softfactory.core.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.softfactory.pojo.Manufacture;

@Repository("manufactureMapper")
public interface LbManufactureMapper {
	
	Integer add(Manufacture manufacture);
	
	Integer modify(Manufacture manufacture);
	
	Integer delete(Integer id);
	
	List<Manufacture>findPaper(Integer pageno,Integer pagesize,String sort,String order);

}
