package mrk129_MenuManager;
/**
 * Class Entree
 * @author mridulakanakavelan
 * @created: 11/1/2022
 */
public class Entree {
	
	private String name;
	
	private int calories;
	
	private String description;
	
	public Entree() {}

	public Entree(String name, String description, int calories) {

		this.name = name;

		this.calories = calories;

		this.description = description;

	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}


