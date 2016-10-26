package com.softfactory.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.pojo.Manufacture;

@Repository("lbManufactureMapper")
public interface LbManufactureMapper {

	Integer add(Manufacture manufacture);

	Integer modify(Manufacture manufacture);

	Integer delete(Integer id);

	List<Manufacture> findPaper(@Param("pageno") Integer pageno,
			@Param("pagesize") Integer pagesize, @Param("sort") String sort,
			@Param("order") String order);

	Manufacture findById(String manufactureid);

	long findPagerTotal();

}
