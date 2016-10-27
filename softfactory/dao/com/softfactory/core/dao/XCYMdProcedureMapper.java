package com.softfactory.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.softfactory.pojo.MdProcedure;


@Repository("MdProcedureMapper")
public interface XCYMdProcedureMapper {
		/**
		 * 新增
		 */
		@Insert("insert into MDPROCEDURE(ID,DESIGN_ID,FIRST_KIND_ID,FIRST_KIND_NAME,SECOND_KIND_ID,SECOND_KIND_NAME,THIRD_KIND_ID,THIRD_KIND_NAME,PRODUCT_ID,PRODUCT_NAME,PROCEDURE_DESCRIBE,COST_PRICE_SUM,MODULE_COST_PRICE_SUM,DESIGNER,REGISTER,REGISTER_TIME,CHECKER,CHECK_TIME,CHECK_SUGGESTION,CHECK_TAG,CHANGER,CHANGE_TIME,CHANGE_TAG,DESIGN_MODULE_TAG,DESIGN_MODULE_CHANGE_TAG)values({id},{designId},{firstKindId},{firstKindName},{secondKindId},{secondKindName},{thirdKindId},{thirdKindName},{productId},{productName},{procedureDescribe},{costPriceSum},{moduleCostPriceSum},{designer},{register},{registerTime},{checker},{checkTime},{checkSuggestion},{checkTag},{changer},{changeTime},{changeTag},{designModuleTag},{designModuleChangeTag})")
		@SelectKey(statement = "select SEQ_SYS_USER.nextval from dual", keyProperty = "payId", before = true, resultType = int.class)
		int add(MdProcedure mdprocedure);
		 /**
		  * 修改
		  */
		@Update("update MDPROCEDURE set DESIGN_ID={#designId},FIRST_KIND_ID={#firstKindId},FIRST_KIND_NAME={#firstKindName},SECOND_KIND_ID={#secondKindId},SECOND_KIND_NAME={#secondKindName},THIRD_KIND_ID={#thirdKindId},THIRD_KIND_NAME={#thirdKindName},PRODUCT_ID={#productId},PRODUCT_NAME={#productName},PROCEDURE_DESCRIBE={#procedureDescribe},COST_PRICE_SUM={#costPriceSum},MODULE_COST_PRICE_SUM={#moduleCostPriceSum},DESIGNER={#designer},REGISTER={#register},REGISTER_TIME={#registerTime},CHECKER={#checker},CHECK_TIME={#checkTime},CHECK_SUGGESTION={#checkSuggestion},CHECK_TAG={#checkTag},CHANGER={#changer},CHANGE_TIME={#changeTime},CHANGE_TAG={#changeTag},DESIGN_MODULE_TAG={#designModuleTag},DESIGN_MODULE_CHANGE_TAG={#designModuleChangeTag}")
		int modify(MdProcedure mdprocedure);
		
		
		/**
		 * 分页
		 */
		List<MdProcedure>findPaper(
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
