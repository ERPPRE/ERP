package com.softfactory.pojo;

import java.io.Serializable;
/**
 * 生产总表
 * */
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Manufacture implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;//序号
	private String manufactureid;//派工单编号
	private String productid;//产品编号
	private String productname;//产品名称
	private Integer amount;//投产数量
	private Integer testedAmount;//合格数量
	private String applyIdGroup;//生产计划序号组
	private String productDescribe;//产品描述
	private Double mouleCostPriceSum;//设计物料总成本
	private Double realModuleCostPriceSum;//实际物料总成本
	private Double labourCostPriceSum;//设计工时总成本
	private Double realLabourCostPriceSum;//实际工时总成本
	private String designer;//工单指定人
	private String regtster;//登记人
	@DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
	private Date registerTime;//登记时间
	private String chcker;//审核人
	@DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
	private String checkTime;//审核时间
	private String remark;//备注
	private String checkTag;//审核标志
	private String manufactureProcedureTag;//生产过程标志
	
	public Manufacture(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getManufactureid() {
		return manufactureid;
	}

	public void setManufactureid(String manufactureid) {
		this.manufactureid = manufactureid;
	}

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getTestedAmount() {
		return testedAmount;
	}

	public void setTestedAmount(Integer testedAmount) {
		this.testedAmount = testedAmount;
	}

	public String getApplyIdGroup() {
		return applyIdGroup;
	}

	public void setApplyIdGroup(String applyIdGroup) {
		this.applyIdGroup = applyIdGroup;
	}

	public String getProductDescribe() {
		return productDescribe;
	}

	public void setProductDescribe(String productDescribe) {
		this.productDescribe = productDescribe;
	}

	public Double getMouleCostPriceSum() {
		return mouleCostPriceSum;
	}

	public void setMouleCostPriceSum(Double mouleCostPriceSum) {
		this.mouleCostPriceSum = mouleCostPriceSum;
	}

	public Double getRealModuleCostPriceSum() {
		return realModuleCostPriceSum;
	}

	public void setRealModuleCostPriceSum(Double realModuleCostPriceSum) {
		this.realModuleCostPriceSum = realModuleCostPriceSum;
	}

	public Double getLabourCostPriceSum() {
		return labourCostPriceSum;
	}

	public void setLabourCostPriceSum(Double labourCostPriceSum) {
		this.labourCostPriceSum = labourCostPriceSum;
	}

	public Double getRealLabourCostPriceSum() {
		return realLabourCostPriceSum;
	}

	public void setRealLabourCostPriceSum(Double realLabourCostPriceSum) {
		this.realLabourCostPriceSum = realLabourCostPriceSum;
	}

	public String getDesigner() {
		return designer;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
	}

	public String getRegtster() {
		return regtster;
	}

	public void setRegtster(String regtster) {
		this.regtster = regtster;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getChcker() {
		return chcker;
	}

	public void setChcker(String chcker) {
		this.chcker = chcker;
	}

	public String getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCheckTag() {
		return checkTag;
	}

	public void setCheckTag(String checkTag) {
		this.checkTag = checkTag;
	}

	public String getManufactureProcedureTag() {
		return manufactureProcedureTag;
	}

	public void setManufactureProcedureTag(String manufactureProcedureTag) {
		this.manufactureProcedureTag = manufactureProcedureTag;
	}

	
}
