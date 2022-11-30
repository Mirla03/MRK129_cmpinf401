package mrk129_MenuManager3;

/**
 * Class MenuTest
 * 
 * @mridulakanakavelan 
 * created: 11/20/22
 */
public class MenuTest {

	public static void main(String[] args) throws Exception{
	MenuManager randomize = new MenuManager("data/entrees.txt", "data/salads.txt", "data/sides.txt", "data/desserts.txt");
	Menu myMenu = randomize.randomMenu("Menu");
	System.out.println(myMenu.description()+ "\nTotal Calories: " + myMenu.totalCalories());
	System.out.println( "\nTotal Price: $" + (myMenu.totalPrice()) +"0");
}
	
}