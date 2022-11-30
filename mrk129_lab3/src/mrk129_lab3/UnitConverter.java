package mrk129_lab3;
import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		String userInputNumber = JOptionPane.showInputDialog("Please enter a distance or weight amount (with units)");
		String value;
		String unit;
		int space_index;
	
		space_index = userInputNumber.indexOf(' ');
		value = userInputNumber.substring(0, space_index);
		unit = userInputNumber.substring(space_index+1, userInputNumber.length());
		double dvalue = Double.parseDouble(value);
		double result;
		
		if (unit.equalsIgnoreCase("cm")) {
			result = dvalue/2.54;
			System.out.println(result + "in");
			JOptionPane.showMessageDialog(null,userInputNumber +" = " +result+ " in");
		}
		
		if (unit.equalsIgnoreCase("in")) {
			result = dvalue*2.54;
			System.out.println(result + "cm");
			JOptionPane.showMessageDialog(null,userInputNumber +" = " +result+ " cm");
		}

		if (unit.equalsIgnoreCase("yd")) {
			result = dvalue/1.09361;
			System.out.println(result + "m");
			JOptionPane.showMessageDialog(null,userInputNumber +" = " +result+ " m");
		}
		if (unit.equalsIgnoreCase("m")) {
			result = dvalue*1.09361;
			System.out.println(result + "yd");
			JOptionPane.showMessageDialog(null,userInputNumber +" = " +result+ " yd");
		
		}
		if (unit.equalsIgnoreCase("oz")) {
			result = dvalue*28.3495;
			System.out.println(result + "g");
			JOptionPane.showMessageDialog(null,userInputNumber +" = " +result+ " g");
		
		}
		if (unit.equalsIgnoreCase("g")) {
			result = dvalue/28.3495;
			System.out.println(result + "oz");
			JOptionPane.showMessageDialog(null,userInputNumber +" = " +result+ " oz");
		
		}
		if (unit.equalsIgnoreCase("lbs")) {
			result = dvalue/2.20462;
			System.out.println(result + "kg");
			JOptionPane.showMessageDialog(null,userInputNumber +" = " +result+ " kg");
		
		}
		if (unit.equalsIgnoreCase("kg")) {
			result = dvalue*2.20462;
			System.out.println(result + "lbs");
			JOptionPane.showMessageDialog(null,userInputNumber +" = " +result+ " lbs");
		
		}
		
	}

}
