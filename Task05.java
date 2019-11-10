package by.htp.les08;

import java.util.Arrays;

import java.util.Scanner;

//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать
//свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика 
//значениями по умолчанию и произвольными значениями. Счетчик имеет методы увеличения и 
//уменьшения состояния, и метод позволяющее получить его текущее состояние. Написать код, 
// демонстрирующий все возможности класса. 

public class Task05 {
	public static void main(String[] args) {
		Counter counter = new Counter();
		
		counter.getMaxRand();
		counter.getMinRand();
		System.out.println("current random counter = " + counter.getRandomZnach());
		System.out.println("current counter by default = " + counter.getZnacUmolch());
		
		System.out.println("after increase:");
		counter.increase();
		counter.currentState();
		System.out.println("after decrease:");
		counter.decrease();
		counter.currentState();
		
		
		
	   
                }      
	
	
	
}


