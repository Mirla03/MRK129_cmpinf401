package mrk129_MenuManager3;

/**
 * Class MenuTest
 * 
 * @mridulakanakavelan 
 * created: 11/20/22
 */
public class MenuTest {
    public static void main(String[] args) throws Exception{
        MenuManager randomize = new MenuManager("data/dishes.txt");
        Menu myMenu = randomize.randomMenu("test");
        Menu minMenu = randomize.minCaloriesMenu("");
        System.out.println(minMenu.description());
        System.out.println(myMenu.description()+"\nTotal calories\t"+ myMenu.totalCalories());
    }
}