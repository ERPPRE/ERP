package com.softfactory.core.dao;

import org.apache.ibatis.annotations.Insert;
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
	@Update("upadate SPAY set PAY_ID={#payId},STORER={##storer}")
	int remove(SPay spay);
}
