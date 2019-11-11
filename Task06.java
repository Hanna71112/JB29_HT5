package by.htp.les08;

// Составьте описание класса для представления времени. Предусмотрте возможности установки 
//времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости 
//вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0. 
//Создать методы изменения времени на заданное количество часов, минут и секунд. 
public class Task06 {
	public static void main(String[] args) {
		// Time time = new Time();
		Time time = new Time(25, 5, 10);
		System.out.println("Установлено время: "+time);
		time.setHour(6);
		time.setMinute(7);
		time.setSecond(25);
		System.out.println("Установлено время: " + time);

		time.changeTime();
		System.out.print("Измененное время: " + time);
	}

}