package mrk129_MenuManager3;

/**
 * Class Menu
 * 
 * @author mridulakanakavelan
 * @created:11/20/2022
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
		this.dessert = null;
		this.salad = null;
		this.side = null;
	}

	public Menu(String name, Entree entree, Salad salad) {
		this.name = name;
		this.entree = entree;
		this.salad = salad;
		this.side = null;
		this.dessert = null;

	}

	public Menu(String name, Entree entree, Salad salad, Side side, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.salad = salad;
		this.side = side;
		this.dessert = dessert;

	}

	public Menu(String name, Side side, Salad salad) {
		this.name = name;
		this.entree = null;
		this.salad = salad;
		this.side = side;
		this.dessert = null;

	}

	public int totalCalories() {
		int total = 0;
		if (this.entree != null) {
			total += this.entree.getCalories();
		}
		if (this.salad != null) {
			total += this.salad.getCalories();
		}
		if (this.side != null) {
			total += this.side.getCalories();
		}
		if (this.dessert != null) {
			total += this.dessert.getCalories();
		}
		return total;
	}

	public String description() {
		String description = "";
		description += this.name;
		description += "\n";

		if (this.entree == null) {
			description += "\n";
			description += "Entree: N/A ";
		} else {
			description += "\n";
			description += "Entree: " + this.entree.getName() + ": " + this.entree.getDescription();
		}
		if (this.side == null) {
			description += "\n";
			description += "Side: N/A ";
		} else {
			description += "\n";
			description += "Side: " + this.side.getName() + ": " + this.side.getDescription();
		}
		if (this.salad == null) {
			description += "\n";
			description += "Salad: N/A ";
		} else {
			description += "\n";
			description += "Salad: " + this.salad.getName() + ": " + this.salad.getDescription();
		}
		if (this.dessert == null) {
			description += "\n";
			description += "Dessert: N/A ";
		} else {
			description += "\n";
			description += "Dessert: " + this.dessert.getName() + ": " + this.dessert.getDescription();
		}
		// description +="\n";
		return description;

	}

	public double totalPrice() {
		Entree et = getEntree(); // initialize all the objects
		Side s = getSide();
		Salad sal = getSalad();
		Dessert des = getDessert();
		double sum = 0;
		if (et != null)
			sum += et.getPrice(); // judge if there is the object
		if (s != null)
			sum += s.getPrice();
		if (sal != null)
			sum += sal.getPrice();
		if (des != null)
			sum += des.getPrice();
		return sum;
	}

	public String priceAndCalories(double price, int calories) {
		String res = "Total calories:\t" + calories + "\n" + "Total price:\t" + price + "\n";
		return res;
	}

	// getter and setter
	public Entree getEntree() {
		return entree;
	}

	@Override
	public String toString() {
		return "Menu{" + "name='" + name + '\'' + '}';
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}