package com.softfactory.pojo;

import java.io.Serializable;
import java.util.Date;
/**
 * 出入库调度类
 * @author caiqg
 *
 */
public class StorageSchedule implements Serializable {

	private static final long serialVersionUID = 1L;
	private String payId;//入库单序号			1	2	3
	private String productId;//产品编号			2	3
	private String productName;//产品名称			2	3
	private Double productPrice;//成本单价				3
	private Integer realAmoutb;// 应入库件数		2
	private Integer nowAmountb;// 已入库件数		2
	private String storagLocation;//存放地址集合	2
	private String reason;// 入库理由			1	2
	private String reasonexact;// 入库详细理由	1	2
	private Date registerTime;// 登记时间		1
	private Double amountSum;// 总件数		1
	private Double costPriceSum;// 总金额		1
	private String warehouseName;//库房名称			3
	private String addressNumber;//存储地址编号			3
	private String addressName;//存储地址名称			3
	private String locationShortName;//存储单元简称		3
	private String currentAmount;//当前可存放量			3
	private Integer demandAmountb;//本次入库件数		3
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public Integer getRealAmoutb() {
		return realAmoutb;
	}
	public void setRealAmoutb(Integer realAmoutb) {
		this.realAmoutb = realAmoutb;
	}
	public Integer getNowAmountb() {
		return nowAmountb;
	}
	public void setNowAmountb(Integer nowAmountb) {
		this.nowAmountb = nowAmountb;
	}
	public String getStoragLocation() {
		return storagLocation;
	}
	public void setStoragLocation(String storagLocation) {
		this.storagLocation = storagLocation;
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
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	public Double getAmountSum() {
		return amountSum;
	}
	public void setAmountSum(Double amountSum) {
		this.amountSum = amountSum;
	}
	public Double getCostPriceSum() {
		return costPriceSum;
	}
	public void setCostPriceSum(Double costPriceSum) {
		this.costPriceSum = costPriceSum;
	}
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
	public String getAddressNumber() {
		return addressNumber;
	}
	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}
	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	public String getLocationShortName() {
		return locationShortName;
	}
	public void setLocationShortName(String locationShortName) {
		this.locationShortName = locationShortName;
	}
	public String getCurrentAmount() {
		return currentAmount;
	}
	public void setCurrentAmount(String currentAmount) {
		this.currentAmount = currentAmount;
	}
	public Integer getDemandAmountb() {
		return demandAmountb;
	}
	public void setDemandAmountb(Integer demandAmountb) {
		this.demandAmountb = demandAmountb;
	}
	
}
