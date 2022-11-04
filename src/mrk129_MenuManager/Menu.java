package mrk129_MenuManager;
/**
 * Class Menu
 * Author : Mridula Kanakavelan
 * created: 10/14/2022
 */
public class Menu {

	String name;
	
	Entree entree;
	
	Side side;
	
	Salad salad;
	
	Dessert dessert;
	
	public Menu (String name, Entree entree, Salad salad) {
		
		this.name = name;
		
		this.entree = entree;
		
		this.side = null;
		
		this.salad = salad;
		
		this.dessert = null;
		
	}
	public Menu (String name, Side side, Salad salad) {
		this.name = name;
		
		this.entree = null;
		
		this.side = side;
		
		this.salad = salad;
		
		this.dessert = null;
		
	}
	public Menu (String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		
		this.entree = entree;
		
		this.side = side;
		
		this.salad = salad;
		
		this.dessert = dessert;
	}
		
			

	public double totalCalories() {
		
		double totalCalories = 0.0;
		
		if (this.entree != null) {
			
			totalCalories += this.entree.getCalories();
			
		}
		
		if (this.side != null) {
			
			totalCalories += this.side.getCalories();
		
		}
		if (this.salad != null) {
			
			totalCalories += this.salad.getCalories();
		
		
		} 
		if (this.dessert != null) {
			
			totalCalories += this.dessert.getCalories();
		
		}
		return totalCalories;
	
	}
	
	public String desc() {
		
		String desc = " ";
		
		desc += this.name;
		
		desc += "\n";
		
		if (this.entree != null) {
			
		
			desc+= "Entree: " + this.entree.getName() + this.entree.getDesc(); 
			
		}else {
			
			desc += "Entree: N/A";
	
		}
		desc += "\n";

		if (this.side != null) {
			
			
			desc+= "Side: " + this.side.getName() + this.side.getDesc(); 
			
		}else {
			
			desc += "Side: N/A";
	
		}
		desc += "\n";

		if (this.salad != null) {
			
			
			desc+= "Salad: " + this.salad.getName() + this.salad.getDesc(); 
			
		}else {
			
			desc += "Salad: N/A";
	
		}
		desc += "\n";

		if (this.dessert != null) {
			
			
			desc+= "Dessert: " + this.dessert.getName() + this.dessert.getDesc(); 
			
		}else {
			
			desc += "Dessert: N/A";
	
		}
		desc += "\n";
		
		return desc;
		
	}
	
}
