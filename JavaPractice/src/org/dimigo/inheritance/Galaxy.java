/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Galaxy
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author		: danie
 * @version		: 1.0
 */
public class Galaxy extends SmartPhone{
	public Galaxy() {
		
	}
	public Galaxy(String name, String company, int price) {
		super(name,company,price);
	}
	public void pay() {
		System.out.println("삼성 페이로 결제합니다.");
	}
	public void useWirelessCharging() {
		System.out.println("무선 충전 기능을 이용합니다.");
	}
}
