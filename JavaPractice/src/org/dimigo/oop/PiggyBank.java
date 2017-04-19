/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_ PiggyBank
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 19.
 * </pre>
 * 
 * @author : 윤정호
 * @version : 1.0
 */
public class PiggyBank {
	private static int balance = 0;
	
	public static void putMoney(FamilyMember member, int amout){
			System.out.println(member.getMemberName() + " : " + amout + "원 넣음");
			balance  += amout;
	}
	public static void printBalance(){
		System.out.println("돼지저금통 총 금액: " + balance + "원");
	}
	
}
