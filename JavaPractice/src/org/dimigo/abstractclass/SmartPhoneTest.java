/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author		: danie
 * @version		: 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		
		SmartPhone i = new IPhone("iPhone 7","애플",900000);
		System.out.println(i);
		i.turnOn();
		i.pay();
		i.useSpecialFunction();
		i.turnOff();
		SmartPhone g = new Galaxy("갤럭시 S8","삼성",800000);
		System.out.println(g);
		g.turnOn();
		g.pay();
		g.useSpecialFunction();
		g.turnOff();
		
		
	}

}
