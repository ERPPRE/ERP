package com.softfactory.pojo;

import java.io.Serializable;

/**
 * 生产物料过程记录
 * */
public class MpModuling implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;// 序号
	private Integer parentId;// 派工单工序序号
	private Integer detailsNumber;// 本工序物料序号
	private Integer productId;// 产品编号
	private String productName;// 产品名称
	private double costPrice;// 物料单价
	private Integer amount;// 数量
	private Integer renewAmount;// 补充数量
	private Integer realAmount;// 实际数量
	private Integer subTotal;// 物料小计
	private Integer realSubTotal;// 实际物料小计

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getRenewAmount() {
		return renewAmount;
	}

	public void setRenewAmount(Integer renewAmount) {
		this.renewAmount = renewAmount;
	}

	public Integer getRealAmount() {
		return realAmount;
	}

	public void setRealAmount(Integer realAmount) {
		this.realAmount = realAmount;
	}

	public Integer getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Integer subTotal) {
		this.subTotal = subTotal;
	}

	public Integer getRealSubTotal() {
		return realSubTotal;
	}

	public void setRealSubTotal(Integer realSubTotal) {
		this.realSubTotal = realSubTotal;
	}

}
