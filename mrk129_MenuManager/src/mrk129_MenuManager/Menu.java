package mrk129_MenuManager;

/**
 * Class Menu
 * @author mridulakanakavelan
 * 10/14/2022
 */
public class Menu {

	private String name;

	private Entree entree;

	private Side side;

	private Salad salad;

	private Dessert dessert;

	public Menu(String name) {

		this.name = name;

		this.entree = null;

		this.side = null;

		this.salad = null;

		this.dessert = null;

	}

	public Menu(String name, Entree entree, Salad salad) {
		this.name = name;

		this.entree = entree;

		this.side = null;

		this.salad = salad;

		this.dessert = null;

	}

	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;

		this.entree = entree;

		this.side = side;

		this.salad = salad;

		this.dessert = dessert;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Salad getSalad() {
		return salad;
	}

	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
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

	public String description() {
		
		String description = " ";
		
		description += this.name;
		
		description += "\n";
		
		if (this.entree != null) {
			
		
			description+= "Entree: " + this.entree.getName() + this.entree.getDesc(); 
			
		}else {
			
			description += "Entree: N/A";
	
		}
		description += "\n";

		if (this.side != null) {
			
			
			description+= "Side: " + this.side.getName() + this.side.getDescription(); 
			
		}else {
			
			description += "Side: N/A";
	
		}
		description += "\n";

		if (this.salad != null) {
			
			
			description+= "Salad: " + this.salad.getName() + this.salad.getDesc(); 
			
		}else {
			
			description += "Salad: N/A";
	
		}
		description += "\n";

		if (this.dessert != null) {
			
			
			description+= "Dessert: " + this.dessert.getName() + this.dessert.getDesc(); 
			
		}else {
			
			description += "Dessert: N/A";
	
		}
		description += "\n";
		
		return description;
		
	}
	
}
