package by.htp.les08;

import java.util.Scanner;

//Составьте описание класса для представления времени. Предусмотрте возможности установки 
//времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости 
//вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0. 
//Создать методы изменения времени на заданное количество часов, минут и секунд.
public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	public void setHour(int _hour) {

		if (_hour >= 0 && _hour <= 23) {
			hour = _hour;
		} else {
			hour = 0;
		}
	}

	public int getHour() {
		return hour;
	}

	public void setMinute(int _minute) {
		if (_minute >= 0 && _minute <= 60) {
			minute = _minute;
		}
		else {
		minute = 0;
	}
	}
	public int getMinute() {
		return minute;
	}

	public void setSecond(int _second) {
		if (_second >= 0 && _second <= 60) {
			second = _second;
		}
		else {
		second = 0;
	}
	}
	public int getSecond() {
		return second;
	}

	public void changeTime() {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите час: ");
		hour = in.nextInt();
		if (hour >= 0 && hour <= 23) {
		} else {
			hour = 0;
		}
		System.out.print("Введите минуты: ");
		minute = in.nextInt();
		if (minute >= 0 && minute <= 60) {
		} else {
			minute = 0;
		}
		minute = 0;
		System.out.print("Введите секунды: ");
		second = in.nextInt();
		if (second >= 0 && second <= 60) {
		} else {
			second = 0;
		}
	}

}
