package com.softfactory.core.dao;

import java.util.List;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.stereotype.Repository;

import com.softfactory.pojo.SPayDetails;

/**
 * 入库明细映射接口
 * @author Administrator
 *
 */
@Repository("hzjspaydetailsMapper")
public interface HZJSPayDetailsMapper {
	/**
	 * 新增入库明细 
	 */
	@Insert("insert into SPAY(ID,PARENT_ID,PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESCRIBE,AMOUNT,AMOUNT_UNIT,COST_PRICE,SUBTOTAL,PAID_AMOUNT,PAY_TAG)values({#id},{#parentId},{#productId},{#productName},{#productDescribe},{#amount},{#amountUnit},{#costPrice},{#subtotal},{#paidAmount}，{#payTag}")
	@SelectKey(statement = "select SEQ_SYS_USER.nextval from dual", keyProperty = "id", before = true, resultType = int.class)
	int add(SPayDetails spaydetails);

	

	/**
	 * 分页查询+条件查询入库明细
	 */
	List<SPayDetails> findPager(
			@Param("pageno") Integer pageno,
			@Param("pagesize") Integer pagesize, 
			@Param("sort") String sort,
			@Param("order") String order, 
			@Param("parentId") String parentId
			);
	/**
	   * 查询分页记录总数 + 条件查询
	   * @param payId
	   * @return
	   */
	  long findPagerTotal(@Param("parentId") String parentId);
	  
	  
	  /**
	   * 根据ID查询
	   * @param 
	   * @return
	   */
	  SPayDetails findById(Integer parentId);
	  
}
