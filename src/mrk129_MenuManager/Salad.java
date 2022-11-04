package mrk129_MenuManager;
/**
 * Class Salad
 * Author : Mridula Kanakavelan
 * created: 10/14/2022
 */
public class Salad {

	String name;

	double calories;

	String desc;

	public Salad(String name, double calories, String desc) {

		this.name = name;

		this.calories = calories;

		this.desc = desc;

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
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
