package mrk129_lab5;

import java.util.Random;
import javax.swing.JOptionPane;

public class Lab5 {

	public static void main(String[] args) {

		{
			Random rand = new Random();

			do {
				int rollCount = Integer.parseInt(JOptionPane.showInputDialog("Enter a number of rolls."));

				rollDice(rollCount, rand);

			} while (JOptionPane.showInputDialog("Would you like to continue? (Y or N)").equalsIgnoreCase("Y"));
		}

	}

	static void rollDice(int rollCount, Random rand) {

		int two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0, ten = 0, eleven = 0,
				twelve = 0;

		for (int counter = 1; counter <= rollCount; counter++) {

			int x = rand.nextInt(6);
			x = x + 1;

			int y = rand.nextInt(6);
			y = y + 1;

			int z;
			z = x + y;

			if (z == 2) {
				two++;

			}

			if (z == 3) {
				three++;

			}
			if (z == 4) {
				four++;

			}
			if (z == 5) {
				five++;

			}
			if (z == 6) {
				six++;

			}
			if (z == 7) {
				seven++;

			}
			if (z == 8) {
				eight++;

			}
			if (z == 9) {
				nine++;

			}
			if (z == 10) {
				ten++;

			}
			if (z == 11) {
				eleven++;

			}
			if (z == 12) {
				twelve++;
			}
		}
		double t = two;

		double th = three;

		double f = four;

		double fi = five;

		double s = six;

		double se = seven;

		double e = eight;

		double n = nine;

		double te = ten;

		double el = eleven;

		double tw = twelve;

		System.out.println("2 will appear " + two + " times. The fraction of all rolls that are 2 is " + t / rollCount);

		System.out.println(
				"3 will appear " + three + " times. The fraction of all rolls that are 3 is " + th / rollCount);

		System.out
				.println("4 will appear " + four + " times. The fraction of all rolls that are 4 is " + f / rollCount);

		System.out
				.println("5 will appear " + five + " times. The fraction of all rolls that are 5 is " + fi / rollCount);

		System.out.println("6 will appear " + six + " times. The fraction of all rolls that are 6 is " + s / rollCount);

		System.out.println(
				"7 will appear " + seven + " times. The fraction of all rolls that are 7 is " + se / rollCount);

		System.out
				.println("8 will appear " + eight + " times. The fraction of all rolls that are 8 is " + e / rollCount);

		System.out
				.println("9 will appear " + nine + " times. The fraction of all rolls that are 9 is " + n / rollCount);

		System.out.println(
				"10 will appear " + ten + " times. The fraction of all rolls that are 10 is " + te / rollCount);

		System.out.println(
				"11 will appear " + eleven + " times. The fraction of all rolls that are 11 is " + el / rollCount);

		System.out.println(
				"12 will appear " + twelve + " times. The fraction of all rolls that are 12 is " + tw / rollCount);

	}

}
