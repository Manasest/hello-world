package com.estuate.dto;
/**
*DTO class
*/
public class AddressDto {
	private int adressId;
	private String workAddress;
	private String homeAddress;
	/**
	 * @return the adressId
	 */
	public int getAdressId() {
		return adressId;
	}
	/**
	 * @param adressId the adressId to set
	 */
	public void setAdressId(int adressId) {
		this.adressId = adressId;
	}
	/**
	 * @return the workAddress
	 */
	public String getWorkAddress() {
		return workAddress;
	}
	/**
	 * @param workAddress the workAddress to set
	 */
	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}
	/**
	 * @return the homeAddress
	 */
	public String getHomeAddress() {
		return homeAddress;
	}
	/**
	 * @param homeAddress the homeAddress to set
	 */
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	
}
