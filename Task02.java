package by.htp.les08;

//Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. 
//Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса. 

public class Task02 {
	public static void main(String[] args) {

		Test2 test1 = new Test2();
		System.out.println("a = " + test1.getA() + ", b = " + test1.getB());

		Test2 test2 = new Test2(1, 6);
		System.out.println("a = " + test2.getA() + ", b = " + test2.getB());

		test1.setA(5);
		test1.setB(4);

		System.out.println("a = " + test1.getA() + ", b = " + test1.getB());

		test2.setA(6);
		test2.setB(8);
		System.out.println("a = " + test2.getA() + ", b = " + test2.getB());

	}
}
