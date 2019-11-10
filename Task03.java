package by.htp.les08;

//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
//Создайте массив из десяти элементов такого типа. 
//Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10. 

public class Task03 {
	public static void main(String[] args) {

		Student[] student = generateArray();
		for (int i = 0; i < student.length; i++) {

			if (student[i].isExellent()) {
				System.out.println(student[i].getName() + "   " + student[i].getGroup());

			}
		}

	}

	public static Student[] generateArray() {
		Student[] student = new Student[10];
		student[0] = new Student("drakava h.n.", 227, new int[] { 9, 9, 9, 9, 9 });
		student[1] = new Student("ivanov i.i.", 227, new int[] { 9, 8, 9, 9, 6 });
		student[2] = new Student("petrov p.p.", 228, new int[] { 9, 8, 7, 5, 9 });
		student[3] = new Student("vdxvd h.n.", 227, new int[] { 9, 8, 7, 5, 9 });
		student[4] = new Student("dfd h.n.", 228, new int[] { 9, 10, 9, 9, 9 });
		student[5] = new Student("dfdf h.n.", 228, new int[] { 10, 10, 10, 10, 10 });
		student[6] = new Student("dfdffd h.n.", 114, new int[] { 9, 6, 7, 5, 9 });
		student[7] = new Student("dfdf h.n.", 228, new int[] { 9, 8, 7, 8, 9 });
		student[8] = new Student("dfdfdfd h.n.", 228, new int[] { 9, 8, 7, 8, 9 });
		student[9] = new Student("dfdfdf h.n.", 200, new int[] { 9, 8, 7, 5, 9 });

		return student;
	}
}
