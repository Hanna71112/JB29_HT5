package by.htp.les08;

public class Train {
	
	private String name;
	private int number;
	private int time;
	
	public Train(String _name, int _number, int _time) {
		name = _name;
		number = _number;
		time = _time;
	}

	public void setName(String _name) {
		name = _name;

	}

	public String getName() {
		return name;

	}
	public void setNumber(int _number) {
		number = _number;

	}

	public int getNumber() {
		return number;

	}
	public void setTime(int _time) {
		time = _time;

	}

	public int getTime() {
		return time;

	}
	
}
