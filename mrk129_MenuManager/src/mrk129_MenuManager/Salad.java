package mrk129_MenuManager;
/**
 * Class Salad
 * @author mridulakanakavelan
 * 10/14/2022
 */
public class Salad {

	private String name;

	private double calories;

	private String description;

	public Salad(String name,  String desc, double calories) {

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

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public String getDesc() {
		return description;
	}

	public void setDesc(String description) {
		this.description = description;
	}

}

