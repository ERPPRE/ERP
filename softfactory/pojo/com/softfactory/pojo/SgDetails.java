package com.softfactory.pojo;

import java.io.Serializable;
/**
 * 出库明细表
 * @author lenovo
 *
 */
public class SgDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;   //序号
	private Integer parentId; //出库单序号
	private String productId; //产品编号
	private String productName; //产品名称
	private String productDescribe; //描述
	private Integer amount;   //数量
	private String amountUnit; //单位
	private Double costPrice; //单价
	private Double subtotal; //小计
	private Integer gatheredAmount;  //已出库件数
	private String gatherTag;   //出库标志
	private Integer demandAmounta; //应出库件数
	private Integer realAmounta; //已出库件数
	private Integer nowAmounta;//本次出库数量
	private Integer demandAmountaAlla; //应出库总件数
	private Integer realAmountaAlla; //已出库总件数
	private Double demandSalAlla;//应出库总成本
	private Double realSalAlla;//已出库总成本
	
	public SgDetails(){
		
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

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
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

	public Integer getGatheredAmount() {
		return gatheredAmount;
	}

	public void setGatheredAmount(Integer gatheredAmount) {
		this.gatheredAmount = gatheredAmount;
	}

	public String getGatherTag() {
		return gatherTag;
	}

	public void setGatherTag(String gatherTag) {
		this.gatherTag = gatherTag;
	}

	public Integer getDemandAmounta() {
		return demandAmounta;
	}

	public void setDemandAmounta(Integer demandAmounta) {
		this.demandAmounta = demandAmounta;
	}

	public Integer getRealAmounta() {
		return realAmounta;
	}

	public void setRealAmounta(Integer realAmounta) {
		this.realAmounta = realAmounta;
	}

	public Integer getNowAmounta() {
		return nowAmounta;
	}

	public void setNowAmounta(Integer nowAmounta) {
		this.nowAmounta = nowAmounta;
	}

	public Integer getDemandAmountaAlla() {
		return demandAmountaAlla;
	}

	public void setDemandAmountaAlla(Integer demandAmountaAlla) {
		this.demandAmountaAlla = demandAmountaAlla;
	}

	public Integer getRealAmountaAlla() {
		return realAmountaAlla;
	}

	public void setRealAmountaAlla(Integer realAmountaAlla) {
		this.realAmountaAlla = realAmountaAlla;
	}

	public Double getDemandSalAlla() {
		return demandSalAlla;
	}

	public void setDemandSalAlla(Double demandSalAlla) {
		this.demandSalAlla = demandSalAlla;
	}

	public Double getRealSalAlla() {
		return realSalAlla;
	}

	public void setRealSalAlla(Double realSalAlla) {
		this.realSalAlla = realSalAlla;
	}

	
}
