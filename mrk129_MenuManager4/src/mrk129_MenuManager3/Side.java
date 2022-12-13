package mrk129_MenuManager3;

/**
 * Class Side
 * 
 * @author mridulakanakavelan
 * @created:11/20/2022
 */

public class Side extends MenuItem {

	public Side(String n, String d, int c, double p) {
		super(n, d, c, p);
	}
	@Override 
	public String toString() {
		return getName() +"@@" +getDesc() + "@@" + getCal()
		+ "@@" +getPrice() + "@@" + super.toString() + "@@" + getClass()
		+ "@@" + hashCode();
	}
}