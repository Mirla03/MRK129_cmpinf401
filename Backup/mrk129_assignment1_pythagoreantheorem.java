package test;

import javax.swing.JOptionPane;
import static java.lang.Math.sqrt;

public class mrk129_assignment1_pythagoreantheorem {

	public static void main(String[] args) {

		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter a number");
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		double hypotenuse = Math.sqrt(Math.pow(num1, 2)+Math.pow(num2, 2));
		hypotenuse = hypotenuse * 100;
		int r = (int) Math.round(hypotenuse);
		hypotenuse = r/100;
		JOptionPane.showMessageDialog(null,"The hypotenuse is " + hypotenuse);


	}

}
