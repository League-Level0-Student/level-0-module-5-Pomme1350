package algorithms;

public class Fibonnoccithing {
	public static void main(String[] args) {

		int number1 = 0;
		int number2 = 1;
		int number3 = 1;

		for (int i = 0; i < 13; i++) {
			number3 = number1 + number2;
			number1 = number2;
			number2 = number3;
			System.out.println(number3);
		}

	}
}
