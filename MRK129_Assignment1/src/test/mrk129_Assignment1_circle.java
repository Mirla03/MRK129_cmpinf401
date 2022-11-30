package test;

import javax.swing.JOptionPane;
import static java.lang.Math.PI; ;

public class mrk129_Assignment1_circle {

	public static void main(String[] args) {
		
		String r = JOptionPane.showInputDialog("Enter the radius.");
		double radius = Double.parseDouble(r);
		double perimeter = 2*Math.PI*radius;
		double area = Math.PI* radius*radius;
		perimeter = perimeter * 100;
		int x = (int) Math.round(perimeter);
		perimeter = x/100;
		area = area * 100;
		int y = (int) Math.round(area);
		area = y/100;
		JOptionPane.showMessageDialog(null,"The circle with radius "+radius+" has an area of "+area+" and a perimeter of "+perimeter);



	}}
