package com.softfactory.pojo;

import java.io.Serializable;

/**
 * 入库明细
 * @author huzjian
 *
 */
public class SPayDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//序号
	private String parentId;//入库单序号
	private String productId;//产品编号
	private String productName;//产品名称
	private String productDescribe;//描述
	private Double amount;//数量
	private String amountUnit;//单位
	private Double costPrice;//单价
	private Double subtotal;//小计
	private Integer paidAmount;//确认入库件数
	private String payTag;//入库标志
	private Integer demandAmountb;//已入库件数
	private Integer realAmoutb;// 应出库件数
	private Integer nowAmountb;// 已出库件数
	private Integer demandAmountAllb;// 本次出库数量
	private Integer realAmountAllb;// 已出库总件数
	private Integer demandSalAllb;// 应出库总件数
	private Integer realSalAllb;// 已出库总成本
	
	
	public SPayDetails(){
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
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
	public String getProductDescribe() {
		return productDescribe;
	}
	public void setProductDescribe(String productDescribe) {
		this.productDescribe = productDescribe;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getAmountUnit() {
		return amountUnit;
	}
	public void setAmountUnit(String amountUnit) {
		this.amountUnit = amountUnit;
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
	public Integer getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(Integer paidAmount) {
		this.paidAmount = paidAmount;
	}
	public String getPayTag() {
		return payTag;
	}
	public void setPayTag(String payTag) {
		this.payTag = payTag;
	}
	public Integer getDemandAmountb() {
		return demandAmountb;
	}
	public void setDemandAmountb(Integer demandAmountb) {
		this.demandAmountb = demandAmountb;
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
	public void setNowAmountb(Integer mowAmountb) {
		this.nowAmountb = mowAmountb;
	}
	public Integer getDemandAmountAllb() {
		return demandAmountAllb;
	}
	public void setDemandAmountAllb(Integer demandAmountAllb) {
		this.demandAmountAllb = demandAmountAllb;
	}
	public Integer getRealAmountAllb() {
		return realAmountAllb;
	}
	public void setRealAmountAllb(Integer realAmountAllb) {
		this.realAmountAllb = realAmountAllb;
	}
	public Integer getDemandSalAllb() {
		return demandSalAllb;
	}
	public void setDemandSalAllb(Integer demandSalAllb) {
		this.demandSalAllb = demandSalAllb;
	}
	public Integer getRealSalAllb() {
		return realSalAllb;
	}
	public void setRealSalAllb(Integer realSalAllb) {
		this.realSalAllb = realSalAllb;
	}
	
	
	
}
