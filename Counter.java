package by.htp.les08;

import java.util.Random;

public class Counter {

	private int znacUmolch = 10;
	private int randomZnach;
	private int max = 100;
	private int min = 0;
	private int maxRand;
	private int minRand;

	public void setZnacUmolch(int _znacUmolch) {
		znacUmolch = _znacUmolch;
	}

	public int getZnacUmolch() {
		return znacUmolch;
	}

	public void setRandomZnach(int _randomZnach) {
		randomZnach = _randomZnach;
	}

	public int getRandomZnach() {
		Random rand = new Random();
		randomZnach = (int) ((Math.random() * 100));
		return randomZnach;
	}

	public void setMaxRand(int _maxRand) {
		maxRand = _maxRand;
	}

	public int getMaxRand() {
		Random rand = new Random();
		maxRand = (int) ((Math.random() * 100));
		System.out.println("max rand = " + maxRand);
		return maxRand;
	}

	public void setMinRand(int _minRand) {
		minRand = _minRand;
	}

	public int getMinRand() {
		Random rand = new Random();
		minRand = (int) ((Math.random() * 100));
		System.out.println("min rand = " + minRand);
		return minRand;
	}

	public void increase() {

		++znacUmolch;

		if (znacUmolch < min && znacUmolch > max) {
			System.out.println("You exceeded limit");
			System.exit(0);
		}

		++randomZnach;

		if (randomZnach < minRand || randomZnach > maxRand) {
			System.out.println("You exceeded limit");
			System.exit(0);}
	}

	public void decrease() {
		--znacUmolch;

		if (znacUmolch < min && znacUmolch > max) {
			System.out.println("You exceeded limit");
			System.exit(0);
		}
		--randomZnach;

		if (randomZnach < minRand || randomZnach > maxRand) {
			System.out.println("You exceeded limit");
			System.exit(0);
		}
	}

	public void currentState() {
		System.out.println("current state default values " + znacUmolch);
		System.out.println("current state rand values = " + randomZnach);
	}

}
