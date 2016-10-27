package com.softfactory.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.softfactory.pojo.MdpDetails;

public interface XCYMdpDetailsMapper {
	/**
	 *新增
	 */
	
	@Insert("insert into MDPDETAILS(ID,PARENT_ID,DETAILS_NUMBER,PROCEDURE_ID,PROCEDURE_NAME,LABOUR_HOUR_AMOUNT,PROCEDURE_DESCRIBE,AMOUNT_UNIT,COST_PRICE,SUBTOTAL,MODULE_SUBTOTAL,REGISTER,REGISTER_TIME,DESIGN_MODULE_TAG,DESIGN_MODULE_CHANGE_TAG)values({ID},{parentId},{detailsNumber},{procedureId},{procedureName},{labourHourAmount},{procedureDescribe},{amountUnit},{costPrice},{subtotal},{moduleSubtotal},{register},{registerTime},{designModuleTag},{designModuleChangeTag})")
	@SelectKey(statement = "select SEQ_SYS_USER.nextval from dual", keyProperty = "payId", before = true, resultType = int.class)
	int add(MdpDetails mdpdetails);
	/**
	 * 修改
	 */
	@Update("update MDPDETAILS set PARENT_ID={#parentId},DETAILS_NUMBER={#detailsNumber},PROCEDURE_ID={#procedureId},PROCEDURE_NAME={#procedureName},LABOUR_HOUR_AMOUNT={#labourHourAmount},PROCEDURE_DESCRIBE={#procedureDescribe},AMOUNT_UNIT={#amountUnit},COST_PRICE={#costPrice},SUBTOTAL={#subtotal},MODULE_SUBTOTAL={#moduleSubtotal},REGISTER={#register},REGISTER_TIME={#registerTime},DESIGN_MODULE_TAG={#designModuleTag},DESIGN_MODULE_CHANGE_TAG={#designModuleChangeTag},")
	int modify(MdpDetails mdpdetails);
	
	
	
	/**
	 * 分页
	 */
	List<MdpDetails>findPaper(
			@Param("pageno") Integer pageno,
			@Param("pagesize") Integer pagesize, 
			@Param("sort") String sort,
			@Param("order") String order, 
			@Param("payId") String payId
			);
	/**
	 * 分页查询
	 */
	long findPagerTotal(@Param("payId") String payId);
	
	
	
	
}
