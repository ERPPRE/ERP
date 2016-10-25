package com.softfactory.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;

import com.softfactory.pojo.SPay;

public interface HZJSPayDetailsMapper {
	/**
	 * 新增入库明细
	 */
	@Insert("insert into SPAY(ID,PARENT_ID,PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESCRIBE,AMOUNT,AMOUNT_UNIT,COST_PRICE,SUBTOTAL,PAID_AMOUNT,PAY_TAG,DEMAND_AMOUNTB,REAL_AMOUNTB,NOW_AMOUNTB,DEMAND_AMOUNT_ALLB,REAL_AMOUNT_ALLB,DEMAND_SAL_ALLB,REAL_SAL_ALLB)values({#id},{#parentId},{#productId},{#productName},{#productDescribe},{#amount},{#amountUnit},{#costPrice},{#subtotal},{#paidAmount}，{#payTag},{#demandAmountb},{#realAmoutb},{#nowAmountb},{#demandAmountAllb},{#realAmountAllb},{#demandSalAllb},{#realSalAllb}")
	@SelectKey(statement = "select SEQ_SYS_USER.nextval from dual", keyProperty = "parentId", before = true, resultType = int.class)
	int add(SPay spay);

	

	/**
	 * 分页查询+条件查询入库明细
	 */
	List<SPay> findPager(
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
}
