package by.htp.les08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов
//массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен
//пользователем. Добавьте возможность сортировки массив по пункту назначения, причем поезда с
//одинаковыми пунктами назначения должны быть упорядочены по времени отправления
public class Task04 {
	public static void main(String[] args) {

		Train[] train = generateArray();
		Train[] mas = sortTrain(train);
	
		System.out.println("Сортировка номеров поездов:");
		for (int i = 0; i < mas.length; i++) {

			System.out.println(mas[i].getNumber() + "   ");

		}

		Scanner in = new Scanner(System.in);
		System.out.print("Введите номер поезда: ");
		int a = in.nextInt();
		for (int i = 0; i < mas.length; i++) {
			if (a == mas[i].getNumber()) {
				System.out.println("направление: " + mas[i].getName() + "  номер поезда: " + mas[i].getNumber()
						+ "  время отправления: " + mas[i].getTime());
			}

		}

		Train[] mas2 = sortPunkt(train);
		System.out.println("Сортировка по пункту назначения:");
		for (int i = 0; i < mas.length; i++) {

			System.out.println(mas[i].getName() + "   " + mas[i].getTime());
		}

	}

	public static Train[] generateArray() {
		Train[] train = new Train[5];
		train[0] = new Train("arest", 4, 1100);
		train[1] = new Train("arest", 2, 1200);
		train[2] = new Train("zinsk", 1, 1300);
		train[3] = new Train("drodno", 5, 1400);
		train[4] = new Train("arest", 3, 1000);
		
	
		return train;
	}
/////////////////////////////////////////////////////////////////////////////
	public static Train[] sortTrain(Train mas[]) {

		Train temp;

		for (int i = 0; i < mas.length - 1; i++) {
			for (int j = 0; j < mas.length - 1; j++) {
				if (mas[j].getNumber() > mas[j + 1].getNumber()) {
					temp = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = temp;
				}
			}
		}
		return mas;
	}

	/////////////////////////////////////////////////////////////////////////////
    public static void sortTime(Train mas[]){
     
        Train temp;

        for(int i = 0; i < mas.length - 1; i++){
            for(int j = 0; j < mas.length - 1; j++){
                if(mas[j].getTime() > mas[j+1].getTime()){
                    temp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = temp;
                }
            }
        }
    }

	/////////////////////////////////////////////////////////////////////////////////////////
	public static Train[] sortPunkt(Train mas[]) {

		Train temp;
sortTime(mas);
		for (int i = 0; i < mas.length - 1; i++) {
			for (int j = 0; j < mas.length - 1; j++) {
				Train a = mas[j];
				Train b = mas[j + 1];
				if (a.getName().compareTo(b.getName()) > 0) {
					temp = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = temp;
				}
			}

		}
		return mas;}}
	


