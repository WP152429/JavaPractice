/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Car.java
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author : jjjj
 * @version : 1.0
 */
public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getPrice() {
		return price;
	}
	public void setCompany(String newCompany) {
		company = newCompany;
	}
	public void setModel(String newModel) {
		model = newModel;
	}
	public void setColor(String newColor) {
		color = newColor;
	}
	public void setMaxSpeed(int newMaxSpeed) {
		maxSpeed = newMaxSpeed;
	}
	public void setPrice(int newPrice) {
		price = newPrice;
	}
	
	public void print() {
		System.out.println("제조사명 : "+company);
		System.out.println("모델명 : "+model);
		System.out.println("색상 : "+color);
		System.out.println("최대속도 : "+maxSpeed+"km");
		System.out.println("가격 : "+String.format("%,d원", price));
	}
}
