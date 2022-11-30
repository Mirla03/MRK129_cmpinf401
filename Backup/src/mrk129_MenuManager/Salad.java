package mrk129_MenuManager;
/**
 * Class Salad
 * @author mridulakanakavelan
 * @created: 11/1/2022
 */
public class Salad {

	private String name;

	private int calories;

	private String description;
	
	public Salad() {}

	public Salad(String name,  String desc, int calories) {

		this.name = name;

		this.calories = calories;

		this.description = desc;

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

