package com.softfactory.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.softfactory.pojo.SPay;

/**
 * 入库映射接口
 * 
 * @author Administrator
 * 
 */
@Repository("spayMapper")
public interface HZJSPayMapper {
	/**
	 * 新增入库
	 */
	@Insert("insert into SPAY(ID,PAY_ID,STORER,REASON,REASONEXACT,AMOUNT_SUM,COST_PRICE_SUM,PAID_AMOUNT_SUM,REMARK,REGISTER,REGISTER_TIME,CHECKER,CHECK_TIME,CHECK_TAG,ATTEMPER,ATTEMPER_TIME,PRODUCT_ID,STORE_TAG)values({#id},{#payId},{#storer},{#reason},{#reasonexact},{#amountSum},{#costPriceSum},{#paidAmountSum},{#remark},{#register},{#registerTime},{#checker},{#checkTime},{#checkTag},{#attmper},{#attemperTime},{#productId},{#storeTag}")
	@SelectKey(statement = "select SEQ_SYS_USER.nextval from dual", keyProperty = "payId", before = true, resultType = int.class)
	int add(SPay spay);

	/**
	 * 修改入库
	 */
	@Update("upadate SPAY set PAY_ID={#payId},STORER={##storer},REASON={#reason},REASONEXACT={#reasonexact},AMOUNT_SUM={#amountSum},COST_PRICE_SUM={#costPriceSum},PAID_AMOUNT_SUM={#paidAmountSum},REMARK={#remark},REGISTER={#register},REGISTER_TIME={#registerTime},CHECKER={#checker},CHECK_TIME={#checkTime},CHECK_TAG={#checkTag},ATTEMPER={#attmper},ATTEMPER_TIME={#attemperTime},PRODUCT_ID={#productId},STORE_TAG={#storeTag}")
	int remove(SPay spay);

	/**
	 * 分页查询+条件查询入库
	 */
	List<SPay> findPager(
			@Param("pageno") Integer pageno,
			@Param("pagesize") Integer pagesize, 
			@Param("sort") String sort,
			@Param("order") String order, 
			@Param("payId") String payId
			);
	/**
	   * 查询分页记录总数 + 条件查询
	   * @param payId
	   * @return
	   */
	  long findPagerTotal(@Param("payId") String payId);

}
