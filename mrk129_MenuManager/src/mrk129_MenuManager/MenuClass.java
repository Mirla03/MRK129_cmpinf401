package mrk129_MenuManager;
/**
 * Class MenuClass
 * @author mridulakanakavelan
 * 10/14/2022
 */
public class MenuClass {

	public static void main(String[] args) {
		
		Entree entree1 = new Entree ("Cacio E Pepe: ", "Fresh tonnarelli pasta made with the finest of Pecorino\nstraight from Italy with a generous helping of our finest of herbs. ", 370);
		
		Entree entree2 = new Entree ("Teriyaki Salmon: ", "With a sweet and savory soy-based flavor, teriyaki\nsalmon satisfies the best of cravings. ", 360);
		
		Side side1 = new Side ("Fried Mac and Cheese: ", "Fried Mac and Cheese Balls are crispy on the\noutside, cheesy and creamy on the inside which makes them the ultimate comfort food. ", 640);
		
		Salad salad1 = new Salad ("Caesar Salad: ", "Chopped romaine lettuce and garlicky croutons, tossed in a\ncreamy dressing made with eggs, olive oil, lemon, Parmesan, Worcestershire sauce, and anchovies. ", 470);
		
		Salad salad2 = new Salad ("Chef's Salad: ", "This beautiful and delectable Chef Salad brings all the\nbest hearty protein together with fresh tomatoes, cucumbers, and seasoned croutons. ", 370);
		
		Dessert dessert1 = new Dessert ("Molten Lava Cake: ", "Our crowd favorite Molten Lava Cake is served\nwith a scoop of our creamy vanilla ice cream, perfectly balacning the choclately goodness. ", 390);
		
		
	Menu menu1 = new Menu ("MA and Pop's", entree1, salad1);
		
	System.out.println(menu1.description());
	
	System.out.println("Total Calories: " + menu1.totalCalories());
	
	System.out.println("\n");
	
	
	
	Menu menu2 = new Menu ("MA and Pop's", entree2, side1, salad2, dessert1);
	
	System.out.println(menu2.description());
	
	System.out.println("Total Calories: " + menu2.totalCalories());
	
	
	}
}
