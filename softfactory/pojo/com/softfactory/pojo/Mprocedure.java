package com.softfactory.pojo;

import java.io.Serializable;

/**
 * ��������ʵ����
 * 
 * @author Administrator
 * 
 */
public class Mprocedure implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;// ���
	private Integer parentId;// �ɹ������
	private Integer detailsNumber;// �������
	private String procedureId;// ������
	private String procedureName;// ��������
	private Double labourHourAmount;// ��ƹ�ʱ��
	private Double realLabourHourAmount;// ʵ�ʹ�ʱ��
	private Double subtotal;// ��ƹ�ʱ�ɱ�
	private Double realSubtotal;// ʵ�ʹ�ʱ�ɱ�
	private Double moduleSubtotal;// ������ϳɱ�
	private Double realModuleSubtotal;// ʵ�����ϳɱ�
	private Double costPrice;// ��λ��ʱ�ɱ�
	private Double demandAmount;// ��������
	private Double realAmount;// ʵ������
	private String procedureFinishTag;// ������ɱ�־
	private String procedureTransferTag;// ���򽻽ӱ�־

	public Mprocedure() {
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

	public String getProcedureId() {
		return procedureId;
	}

	public void setProcedureId(String procedureId) {
		this.procedureId = procedureId;
	}

	public String getProcedureName() {
		return procedureName;
	}

	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

	public Double getLabourHourAmount() {
		return labourHourAmount;
	}

	public void setLabourHourAmount(Double labourHourAmount) {
		this.labourHourAmount = labourHourAmount;
	}

	public Double getRealLabourHourAmount() {
		return realLabourHourAmount;
	}

	public void setRealLabourHourAmount(Double realLabourHourAmount) {
		this.realLabourHourAmount = realLabourHourAmount;
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

	public Double getModuleSubtotal() {
		return moduleSubtotal;
	}

	public void setModuleSubtotal(Double moduleSubtotal) {
		this.moduleSubtotal = moduleSubtotal;
	}

	public Double getRealModuleSubtotal() {
		return realModuleSubtotal;
	}

	public void setRealModuleSubtotal(Double realModuleSubtotal) {
		this.realModuleSubtotal = realModuleSubtotal;
	}

	public Double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	public Double getDemandAmount() {
		return demandAmount;
	}

	public void setDemandAmount(Double demandAmount) {
		this.demandAmount = demandAmount;
	}

	public Double getRealAmount() {
		return realAmount;
	}

	public void setRealAmount(Double realAmount) {
		this.realAmount = realAmount;
	}

	public String getProcedureFinishTag() {
		return procedureFinishTag;
	}

	public void setProcedureFinishTag(String procedureFinishTag) {
		this.procedureFinishTag = procedureFinishTag;
	}

	public String getProcedureTransferTag() {
		return procedureTransferTag;
	}

	public void setProcedureTransferTag(String procedureTransferTag) {
		this.procedureTransferTag = procedureTransferTag;
	}

}
