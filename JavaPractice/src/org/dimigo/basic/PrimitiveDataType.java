/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *    |_ PrimitiveDataType
 * 
 * 1. 개요 : 아이유 프로필 출력하기
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 * 
 * @author : 윤정호
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean isMale = false;
		int age = 25;
		String name = "아이유";
		double height = 161.8;
		float weight = 44.3f;
		char bloodType='A';
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : " + name);
		System.out.printf("성별 : %s\n", isMale ? "남자" : "여자");
		System.out.printf("나이 : %d세\n",age);
		System.out.printf("키 : %.1fcm\n", height);
		System.out.printf("몸무게 : %.1fKg\n", weight);
		System.out.printf("혈액형 : %c형", bloodType);
		
		
	}

}
