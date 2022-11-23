import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>(
                Arrays.asList(
                        new Product("Mars", 10.5),
                        new Product("Twix", 20.00),
                        new Product("Nuts", 19.00)
                )
        );
        Machine machine = new Machine(list);
        String key = "Nuts";
        System.out.println(machine.getProductByName(key));

        List<Product> listBotlle = new ArrayList<Product>(
                Arrays.asList(
                        new Bottle("Coca Cola", 1.5, 0.5),
                        new Bottle("Sprite", 15.5, 1.00)

                )
        );

        Machine bottleMachine = new BottleMachine(listBotlle);
        String keyBottle = "Sprite";
        System.out.println(bottleMachine.getProductByName(keyBottle));

        List<Product> listBeverageTemperature = new ArrayList<Product>(
                Arrays.asList(
                        new BeverageTemperature("Coffee", 3.5, 0.3, 75),
                        new BeverageTemperature("CoffeeAndMilk", 5.1, 0.5, 65)

                )
        );

        Machine hotDrinkMachine = new HotDrinkMachine(listBeverageTemperature);
        String keyBeverageTemperature = "Coffee";
        System.out.println(hotDrinkMachine.getProductByName(keyBeverageTemperature));
    }
}
