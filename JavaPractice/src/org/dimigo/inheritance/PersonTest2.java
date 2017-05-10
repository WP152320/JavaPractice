/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance을 만든 사람은 huseong입니다.
 *     |__PersonTest2이 타입 네임입니다.
 * 1. 이 프로그램이 뭔지
 * 
 * 2. 작성일
 * 이 프로그램은 2017. 5. 10.에 작성 된듯 합니다.
 * 3. 정보
 * @author : huseong
 * @version : 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Tom");
		Person k = new Korean("홍길동");
		Person j = new Japanese("다나카");
		Person c = new Chinese("왕밍");
		Person[] persons = {p, k, j, c};
		for(Person person : persons) {
			System.out.println(person);
			person.sayHello();
			person.sayBye();
			System.out.println();
		}
	}

}
