package mrk129_MenuManager3;

/**
 * Class Salad
 * 
 * @author mridulakanakavelan
 * @created: 11/20/2022
 */

public class Salad extends MenuItem {

	public Salad(String n, String d, int c, double p) {
		super(n,d,c,p);
	}
	@Override 
	public String toString() {
		return getName() +"@@" + getDesc() + "@@" + getCal()
		+ "@@" +getPrice() + "@@" + super.toString() + "@@" + getClass()
		+ "@@" + hashCode();
	}
}