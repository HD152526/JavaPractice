/**
 * 
 */
package org.dimigo.abstractclass;

/**
 *<pre>
 * org.dimigo.inheritance
 *   |_ SmartPhone
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author 		: lee
 * @version 	: 1.0
 */
public abstract class SmartPhone {

	private String model;
	private String company;
	private int price;
	
	public SmartPhone(){
		
	}
	public SmartPhone(String model, String company, int price){
		this.model = model;
		this.company = company;
		this.price = price;
	}
	public void turnOn(){
		System.out.println(model + "의 전원을 켭니다.");
	}
	public void turnOff(){
		System.out.println(model + "의 전원을 끕니다.");
	}
	public abstract void pay();
	
	public void useSpecialFunction(){
		// 인스턴스 메소드이므로 객체가 생성된 후 호출됨
		// 생성된 자신의 객체에 접근하기 위해 this 사용
		if(this instanceof IPhone) {
			IPhone iphone = (IPhone)this;
			iphone.useAirDrop();
		} else if(this instanceof Galaxy) {
			Galaxy galaxy = (Galaxy)this;
			galaxy.useWirelessCharging();
		}
	}
	public String toString(){
		return "모델명 : " + model + "," + " 제조사 : " + company + "," + " 가격 : " + String.format("%,d", price)+ "원";
	}
}
