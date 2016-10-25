package com.softfactory.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 出库表
 * 
 * @author lenovo
 *
 */
public class Sgather implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id; // 序号
	private String gatherId; // 出库单编号
	private String storer; // 出库人
	private String reason; // 出库理由
	private String reasonexact; // 出库详细理由
	private Integer amountSum; // 总件数
	private Double costPriceSum; // 总金额
	private Integer gatheredAmountSum; // 已出库总件数
	private String remark; // 备注
	private String register; // 登记人
	private Date registerTime; // 登记时间
	private String checker; // 复核人
	private Date checkTime; // 复核时间
	private String checkTag; // 复核标志
	private String attemper; // 调度人
	private Date attemperTime; // 调度时间
	private String storeTag; // 库存标志
	private Integer maId; // 生产总表ID

	public Sgather() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGatherId() {
		return gatherId;
	}

	public void setGatherId(String gatherId) {
		this.gatherId = gatherId;
	}

	public String getStorer() {
		return storer;
	}

	public void setStorer(String storer) {
		this.storer = storer;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReasonexact() {
		return reasonexact;
	}

	public void setReasonexact(String reasonexact) {
		this.reasonexact = reasonexact;
	}

	public Integer getAmountSum() {
		return amountSum;
	}

	public void setAmountSum(Integer amountSum) {
		this.amountSum = amountSum;
	}

	public Double getCostPriceSum() {
		return costPriceSum;
	}

	public void setCostPriceSum(Double costPriceSum) {
		this.costPriceSum = costPriceSum;
	}

	public Integer getGatheredAmountSum() {
		return gatheredAmountSum;
	}

	public void setGatheredAmountSum(Integer gatheredAmountSum) {
		this.gatheredAmountSum = gatheredAmountSum;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getCheckTag() {
		return checkTag;
	}

	public void setCheckTag(String checkTag) {
		this.checkTag = checkTag;
	}

	public String getAttemper() {
		return attemper;
	}

	public void setAttemper(String attemper) {
		this.attemper = attemper;
	}

	public Date getAttemperTime() {
		return attemperTime;
	}

	public void setAttemperTime(Date attemperTime) {
		this.attemperTime = attemperTime;
	}

	public String getStoreTag() {
		return storeTag;
	}

	public void setStoreTag(String storeTag) {
		this.storeTag = storeTag;
	}

	public Integer getMaId() {
		return maId;
	}

	public void setMaId(Integer maId) {
		this.maId = maId;
	}

}
