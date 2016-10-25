package com.softfactory.pojo;

import java.io.Serializable;

/**
 * ������������ʵ����
 * 
 * @author Administrator
 * 
 */
public class MpModule implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;// ���
	private Integer parentId;// �ɹ���������š�
	private Integer detailsNumber;// �������������
	private String productId;// ��Ʒ���
	private String productName;// ��Ʒ����
	private Double costPrice;// ���ϵ���
	private Double amount;// ����
	private Double renewAmount;// ��������
	private Double realAmount;// ʵ������
	private Double subtotal;// ����С��
	private Double realSubtotal;// ʵ������С��

	public MpModule() {
		// TODO Auto-generated constructor stub
	}

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

	public Double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getRenewAmount() {
		return renewAmount;
	}

	public void setRenewAmount(Double renewAmount) {
		this.renewAmount = renewAmount;
	}

	public Double getRealAmount() {
		return realAmount;
	}

	public void setRealAmount(Double realAmount) {
		this.realAmount = realAmount;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getRealSubtotal() {
		return realSubtotal;
	}

	public void setRealSubtotal(Double realSubtotal) {
		this.realSubtotal = realSubtotal;
	}

}
