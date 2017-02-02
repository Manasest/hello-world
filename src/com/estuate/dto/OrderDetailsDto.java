package com.estuate.dto;

public class OrderDetailsDto {
	private int orderDetailsId;
	private String orderDetailsName;
	private double orderDetailsPrice;
	/**
	 * @return the orderDetailsId
	 */
	public int getOrderDetailsId() {
		return orderDetailsId;
	}
	/**
	 * @param orderDetailsId the orderDetailsId to set
	 */
	public void setOrderDetailsId(int orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}
	/**
	 * @return the orderDetailsName
	 */
	public String getOrderDetailsName() {
		return orderDetailsName;
	}
	/**
	 * @param orderDetailsName the orderDetailsName to set
	 */
	public void setOrderDetailsName(String orderDetailsName) {
		this.orderDetailsName = orderDetailsName;
	}
	/**
	 * @return the orderDetailsPrice
	 */
	public double getOrderDetailsPrice() {
		return orderDetailsPrice;
	}
	/**
	 * @param orderDetailsPrice the orderDetailsPrice to set
	 */
	public void setOrderDetailsPrice(double orderDetailsPrice) {
		this.orderDetailsPrice = orderDetailsPrice;
	}
}
