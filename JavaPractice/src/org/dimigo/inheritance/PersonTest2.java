/**
 * 
 */
package org.dimigo.inheritance;

public class PersonTest2 {
	public static void main(String[] args) {
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
