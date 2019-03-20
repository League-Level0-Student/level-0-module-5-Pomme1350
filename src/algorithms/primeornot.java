package algorithms;

import javax.swing.JOptionPane;

public class primeornot {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog(null, "Gimme a # (Under 1,000,000,000");
		int Number = Integer.parseInt(number);

		for (int i = 2; i < Number; i++) {
			if (Number % i == 0) {
				JOptionPane.showInputDialog(null, "Is composite");
				System.exit(0);

			}

		}
		JOptionPane.showInputDialog(null, "is prime");
	}
}
