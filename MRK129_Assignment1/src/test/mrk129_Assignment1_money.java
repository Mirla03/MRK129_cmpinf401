package test;

import javax.swing.JOptionPane;
import static java.lang.Math.PI;

public class mrk129_Assignment1_money {

	public static void main(String[] args)  {
	
	String m = JOptionPane.showInputDialog("Enter a number between 1-9999");
	int dollars = Integer.parseInt(m);
	
	int grand = dollars/1000;
	int remain1 = dollars % 1000;
	
	int Benjamins = remain1/100;
	int remain2 = remain1 % 100;
	
	int Sawbucks = remain2/10;
	int remain3 = remain2 % 10;
	
	int Bucks = remain3;
	
	JOptionPane.showMessageDialog(null,grand + " Grands, " + Benjamins + " Benjamins, " + Sawbucks + " sawbucks, "+ Bucks + " bucks");
	
	}}
