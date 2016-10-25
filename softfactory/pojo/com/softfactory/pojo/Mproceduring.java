package com.softfactory.pojo;

import java.io.Serializable;
/**
 * 生产工序过程记录
 * */
import java.util.Date;
public class Mproceduring implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;//序号
	private Integer parentId;//派工单序号
	private Integer detailsNumber;//工序序号
	private String procedure_Id;//工序编号
	private String procedure_Name;//工序名称
	private Double labourHourAmount;//本次工时数
	private Double costPrice;//单位工时成本
	private Double subtotal;//工时成本小计
	private String rocedureDescribe;//工序描述
	private Integer regCount;//登记次数
	private String procedureResponsiblePerson;//负责人
	private String register;//登记人
	private Date registerTime;//登记时间
	private String checker;//审核人
	private Date checkTime;//审核时间
	public Integer getId() {
		return id;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getDetailsNumber() {
		return detailsNumber;
	}
	public void setDetailsNumber(Integer detailsNumber) {
		this.detailsNumber = detailsNumber;
	}
	public String getProcedure_Id() {
		return procedure_Id;
	}
	public void setProcedure_Id(String procedure_Id) {
		this.procedure_Id = procedure_Id;
	}
	public String getProcedure_Name() {
		return procedure_Name;
	}
	public void setProcedure_Name(String procedure_Name) {
		this.procedure_Name = procedure_Name;
	}
	public Double getLabourHourAmount() {
		return labourHourAmount;
	}
	public void setLabourHourAmount(Double labourHourAmount) {
		this.labourHourAmount = labourHourAmount;
	}
	public Double getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public String getRocedureDescribe() {
		return rocedureDescribe;
	}
	public void setRocedureDescribe(String rocedureDescribe) {
		this.rocedureDescribe = rocedureDescribe;
	}
	public Integer getRegCount() {
		return regCount;
	}
	public void setRegCount(Integer regCount) {
		this.regCount = regCount;
	}
	public String getProcedureResponsiblePerson() {
		return procedureResponsiblePerson;
	}
	public void setProcedureResponsiblePerson(String procedureResponsiblePerson) {
		this.procedureResponsiblePerson = procedureResponsiblePerson;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	public String getChecker() {
		return checker;
	}
	public void setChecker(String checker) {
		this.checker = checker;
	}
	public Date getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
