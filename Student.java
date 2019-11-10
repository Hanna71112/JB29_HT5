package by.htp.les08;

public class Student {

	private String name;
	private int group;
	private int[] mas = new int[5];

	public Student(String _name, int _group, int[] _mas) {
		name = _name;
		group = _group;
		mas = _mas;
	}

	public void setName(String _name) {
		name = _name;

	}

	public String getName() {
		return name;

	}

	public void setGroup(int _group) {
		group = _group;

	}

	public int getGroup() {
		return group;

	}

	public void setMas(int[] _mas) {
		mas = _mas;

	}

	public int[] getMas() {
		return mas;

	}
	
	
	public boolean isExellent () {	
		boolean result = true;
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] != 9 && mas[i] != 10 ) 
			{
				result = false;
			}
		}
		
		return result;

}
}