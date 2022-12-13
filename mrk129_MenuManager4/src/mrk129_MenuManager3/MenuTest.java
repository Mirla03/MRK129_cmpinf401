package mrk129_MenuManager3;

/**
 * Class MenuTest
 * 
 * @mridulakanakavelan 
 * created: 11/20/22
 */
public class MenuTest {

	public static void main(String[] args) {
		//testing manueRandomize & FileManager
		MenuManager randomize = new MenuManager("data/dishes.txt");
		Menu myMenu = randomize.randomMenu("NameOfMenu");
		System.out.println(myMenu.description()+"\nTotal calories: "+
   			myMenu.totalCalories());

	}

}

