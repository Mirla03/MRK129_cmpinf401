package mrk129_lab4;
import javax.swing.JOptionPane;
 

public class logarithms {

	public static void main(String[] args) {
		

		String x;
		
		x = JOptionPane.showInputDialog("Enter a number greater than 0.");
		  String argument = "";
          do {
              
              if (Integer.parseInt(x)>0) {
                  argument = x;
              } else {
                 x = JOptionPane.showInputDialog("Please enter a valid number.");
              }
			  } while (Integer.parseInt(x)<0);
          
        
          String b;    
  
  		b = JOptionPane.showInputDialog("Enter a number greater than 1.");
  		  String base = "";
            do {
                
                if (Integer.parseInt(b)>1) {
                    base = b;
                } else {
                   b= JOptionPane.showInputDialog("Please enter a valid number.");
                }
                } while (Integer.parseInt(b)<1);
            
            
            int counter = 0;
            
        int integerX = (Integer.parseInt(x));
        int integerB = (Integer.parseInt(b));
        
        while (integerX> integerB)
        		{
        	
        		integerX= integerX/integerB;
        		counter++;
       
        		}
        JOptionPane.showMessageDialog(null, "The logarithm is equal to " + counter + ".");
	}

}
