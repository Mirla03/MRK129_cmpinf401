package mrk129_lab7;

import javax.swing.JOptionPane;

import java.util.Random;

public class lab7 {

	public static double max(double[] data) {

		double max = 0;

		for (int a = 0; a < data.length; a++) {

			if (data[a] > max) {

				max = data[a];

			}
		}
		return max;
	}

	public static double min(double[] data) {

		double min = 0;

		for (int a = 0; a < data.length; a++) {

			if (data[a] < min) {

				min = data[a];

			}
		}
		return min;
	}

	public static double sum(double[] data) {

		double sum = 0;

		for (int a = 0; a < data.length; a++) {

			sum += data[a];
		}
		return sum;
	}

	public static double ave(double[] data) {

		double sum = 0;

		for (int a = 0; a < data.length; a++) {

			sum += data[a];
		}
		double ave = sum / data.length;

		return ave;
	}

	public static void main(String[] args) {

		String items = JOptionPane.showInputDialog("How many items will be entered?");
		
		int itemCount = Integer.parseInt(items);
		
		double [] myArray = new double[itemCount];
		
		Random rand = new Random();
		
		for (int j = 0; j < itemCount; j++) {
			
			myArray[j] = rand.nextInt();
			
		}
		
	
		System.out.println("The maximum value in the array is " + max(myArray));
		
		System.out.println("The minimum value in the array is " + min(myArray));
		
		System.out.println("The sum of the values in the array is " + sum(myArray));
		
		System.out.println("The average of the values in the array is " + ave(myArray));
		
	}
	
}

