package mrk129_MenuManager;
/**
 * Class Menu
 * @mridulakanakavelan
 * @created: 11/1/2022
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	
	public static ArrayList<Entree> readEntrees(String file) throws IOException {
		
		FileReader fileReader = new FileReader(file);
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		ArrayList<Entree> entreesList = new ArrayList<>();
		
		String line = "";
		
		while((line = bufferedReader.readLine()) != null){
		
			String[] lineSplit = line.split("@@");
			
			if(lineSplit.length != 3) break;
			
			Entree entree = new Entree();
			
			entree.setName(lineSplit[0]);
			
			entree.setDescription(lineSplit[1]);
			
			entree.setCalories(Integer.parseInt(lineSplit[2]));
			
			entreesList.add(entree);
		}
		bufferedReader.close();
		fileReader.close();
		return entreesList;
	}

	public static ArrayList<Salad> readSalads(String file) throws IOException {
		
		FileReader fileReader = new FileReader(file);
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		ArrayList<Salad> saladsList = new ArrayList<>();
		
		String line = "";
		
		while((line = bufferedReader.readLine()) != null){
		
			String[] lineSplit = line.split("@@");
			
			if(lineSplit.length != 3) break;
			
			Salad salad = new Salad();
			
			salad.setName(lineSplit[0]);
			
			salad.setDescription(lineSplit[1]);
			
			salad.setCalories(Integer.parseInt(lineSplit[2]));
			
			saladsList.add(salad);
		}
		bufferedReader.close();
		fileReader.close();
		return saladsList;
	}

	public static ArrayList<Side> readSides(String file) throws IOException {
		
		FileReader fileReader = new FileReader(file);
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		ArrayList<Side> sidesList = new ArrayList<>();
		
		String line = "";
		
		while((line = bufferedReader.readLine()) != null){
		
			String[] lineSplit = line.split("@@");
			
			if(lineSplit.length != 3) break;
			
			Side side = new Side();
			
			side.setName(lineSplit[0]);
			
			side.setDescription(lineSplit[1]);
			
			side.setCalories(Integer.parseInt(lineSplit[2]));
			
			sidesList.add(side);
		}
		bufferedReader.close();
		fileReader.close();
		return sidesList;
	}

	public static ArrayList<Dessert> readDesserts(String file) throws IOException {
		
		FileReader fileReader = new FileReader(file); 
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		ArrayList<Dessert> dessertsList = new ArrayList<>();
		
		String line = "";
		
		while((line = bufferedReader.readLine()) != null){
		
			String[] lineSplit = line.split("@@");
			
			if(lineSplit.length != 3) break;
			
			Dessert dessert = new Dessert();
			
			dessert.setName(lineSplit[0]);
			
			dessert.setDescription(lineSplit[1]);
			
			dessert.setCalories(Integer.parseInt(lineSplit[2]));
			
			dessertsList.add(dessert);
		}
		bufferedReader.close();
		fileReader.close();
		return dessertsList;
	}



}
