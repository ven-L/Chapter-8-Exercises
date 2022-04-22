import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    static ArrayList<Food> foodList = new ArrayList<Food>();
    
    private static double hamburgerPriceTotal;
    private static double saladPriceTotal;
    private static double frenchFriesPriceTotal;
    private static double sodaPriceTotal;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {    
        initializeFood();
        takeOrders();
        computeTotal();
        closeScanner();
    }
    
    public static void initializeFood()
    {
        Food Hamburger = new Food("Hamburger",1.85,9,33,1);
        Food Salad = new Food("Salad",2.00,1,11,15);
        Food FrenchFries = new Food("FrenchFries",1.30,11,36,4);
        Food Soda = new Food("Soda",0.95,0,38,0);
        
        foodList.add(Hamburger);
        foodList.add(Salad);
        foodList.add(FrenchFries);
        foodList.add(Soda);
    }

    public static void takeOrders()
    {
        takeHamburgerOrders();
        takeSaladOrders();
        takeFrenchFriesOrders();
        takeSodaOrders();
    }

    public static void takeHamburgerOrders()
    {   
        System.out.println("Enter number of hamburger : ");
        System.out.println("Each " + foodList.get(0).getNAME() + " has " + foodList.get(0).getFAT() + "g of fat, " + foodList.get(0).getCARBS() + "g of carbs, and " + foodList.get(0).getCARBS() + "g of fiber." );            

        int hamburgerOrder = sc.nextInt();
        
        hamburgerPriceTotal = hamburgerOrder * foodList.get(0).getPRICE();
        System.out.println("You have ordered " + hamburgerOrder + " " + foodList.get(0).getNAME() + " for " + hamburgerPriceTotal);
    }

    public static void takeSaladOrders()
    {   
        System.out.println("Enter number of salad : ");
        System.out.println("Each " + foodList.get(1).getNAME() + " has " + foodList.get(1).getFAT() + "g of fat, " + foodList.get(1).getCARBS() + "g of carbs, and " + foodList.get(1).getCARBS() + "g of fiber." );            

        int saladOrder = sc.nextInt();
        
        saladPriceTotal = saladOrder * foodList.get(1).getPRICE();
        System.out.println("You have ordered " + saladOrder + " " + foodList.get(1).getNAME() + " for " + saladPriceTotal);
    }

    public static void takeFrenchFriesOrders()
    {
        System.out.println("Enter number of French Fries : ");
        System.out.println("Each " + foodList.get(2).getNAME() + " has " + foodList.get(2).getFAT() + "g of fat, " + foodList.get(2).getCARBS() + "g of carbs, and " + foodList.get(2).getCARBS() + "g of fiber." );            

        int frenchFriesOrder = sc.nextInt();
        
        frenchFriesPriceTotal = frenchFriesOrder * foodList.get(0).getPRICE();
        System.out.println("You have ordered " + frenchFriesOrder + " " + foodList.get(2).getNAME() + " for " + frenchFriesPriceTotal);
    }

    public static void takeSodaOrders()
    {
        System.out.println("Enter number of Soda : ");
        System.out.println("Each " + foodList.get(3).getNAME() + " has " + foodList.get(3).getFAT() + "g of fat, " + foodList.get(3).getCARBS() + "g of carbs, and " + foodList.get(3).getCARBS() + "g of fiber." );            

        int sodaOrder = sc.nextInt();
        
        sodaPriceTotal = sodaOrder * foodList.get(3).getPRICE();
        System.out.println("You have ordered " + sodaOrder + " " + foodList.get(3).getNAME() + " for " + sodaPriceTotal);
    }

    public static void computeTotal()
    {
        double totalOrderPrice = hamburgerPriceTotal + saladPriceTotal + frenchFriesPriceTotal + sodaPriceTotal;
        System.out.println("Your order has come to : $ " + totalOrderPrice);
    }

    public static void closeScanner()
    {
        sc.close();
    }
}
