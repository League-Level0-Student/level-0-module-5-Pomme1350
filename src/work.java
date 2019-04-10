import javax.swing.JOptionPane;

public class work {
	public static void main(String[] args) {

		work skills = new work();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have

		String dimes = JOptionPane.showInputDialog(null, "How many dimes do you have?");

		// Tell them how many cents they have (hint multiply by 10)
		int cents = Integer.parseInt(dimes);

		double amount = cents * 10;
		JOptionPane.showMessageDialog(null, "You have " + amount);

		// Ask the user how tall they are (inches)
		String height = JOptionPane.showInputDialog("How tall are you in inches?");
		int inches = Integer.parseInt(height);
		// If they are shorter than 36 inches, tell them to eat their Wheaties
		if (inches <= 36) {
			JOptionPane.showMessageDialog(null, "eat your wheaties");
		}

	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		for (int i = 0; i < 30; i++) {

		}
	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
		System.out.println(15);

		// Get another random number that is less than 10 and print it to the console
		System.out.println(3);
		// Using a pop-up, tell the user the difference between the numbers
		JOptionPane.showMessageDialog(null, "");

	}

	void skill4() { // In a pop-up, ask the user for the city they live in
		String city = JOptionPane.showInputDialog(null, "What city do you live in?(Use lowercase)");
		// If they answered "San Diego", tell them they live in America's Finest City
		if (city.equals("san diego")) {
			JOptionPane.showMessageDialog(null, "You live in america's finest city");
		} else {
			JOptionPane.showMessageDialog(null, "Move to sandiego   ):");
		}
		// Otherwise, tell them to move to San Diego

		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."
		int cars = 2;
		// If there is 1 car, use a pop-up to display the make/model of the car
		if (cars > 1) {
			JOptionPane.showMessageDialog(null, "the cars have 4 wheels in between them.");

		}

		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.

	}

	void skill5() { // In a pop-up, ask the user for the name of their school
		String school = JOptionPane.showInputDialog("What is the name of your school?");
		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.
		JOptionPane.showMessageDialog(null, (school + " is a fantastic school!!!"));

	}
}

// Copyright 2013-2018
