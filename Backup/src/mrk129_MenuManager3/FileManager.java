package mrk129_MenuManager3;

/**
 * Class FileManager
 * 
 * @mridulakanakavelan
 * @created: 11/20/2022
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

	public static ArrayList<MenuItem> readItems(String file) throws IOException {
		FileReader fileReader = new FileReader(file); // open a fileReader stream
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		ArrayList<MenuItem> menuItems = new ArrayList<>();
		//String line = "";
		for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine())  {
			String[] lineSplit = line.split("@@");
			if (lineSplit.length != 4)
				break;
			double price = Double.parseDouble(lineSplit[3]);
			int calories = Integer.parseInt(lineSplit[2]);
			MenuItem menuItem; //= new Entree(lineSplit[0], lineSplit[1], calories, price);
		
		if (file.equals("data/entrees.txt")) {
				menuItem = new Entree(lineSplit[0], lineSplit[1], calories, price);
			} else if (file.equals("data/sides.txt")) {
				menuItem = new Side(lineSplit[0], lineSplit[1], calories, price);
			} else if (file.equals("data/salads.txt")) {
				menuItem = new Salad(lineSplit[0], lineSplit[1], calories, price);
			} else {
				menuItem = new Dessert(lineSplit[0], lineSplit[1], calories, price);
			}
			menuItems.add(menuItem);
		}
		bufferedReader.close();
		fileReader.close();
		return menuItems;
	}

	public static void writeMenu(String fileName, ArrayList<Menu> menus) throws IOException {
		FileWriter fileWriter = new FileWriter(fileName);
		for (Menu menu : menus) {
			String data = menu.toString() + "\n" + menu.description()
			+ menu.priceAndCalories(menu.totalPrice(), menu.totalCalories());
			fileWriter.append(data);
			fileWriter.append("\n");
		}
		fileWriter.close();
	}

}