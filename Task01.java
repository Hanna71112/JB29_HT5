package by.htp.les08;

//Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
//Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных 

public class Task01 {
	public static void main(String[] args) {

		Test1 test1 = new Test1();

		test1.setA(5);
		test1.setB(4);
		test1.PrintA();
		test1.PrintB();

		System.out.println("sum = " + test1.getSum());
		System.out.println("max = " + test1.getMax());

	}
}
