import java.util.Scanner;

public class PiggyBank 
{
    double savings;
    double newSavings;

    //COIN VALUES
    double Penny = 0.01;
    double Nickel = 0.05;
    double Dime = 0.10;
    double Quarter = 0.25;

    //COIN COUNTERS
    int pennyCount;
    int nickelCount;
    int dimeCount;
    int quarterCount; 

    Scanner sc = new Scanner(System.in);
    int userInput;
    
    public void displayOptions()
    {
        System.out.println("[1] Show total in Bank. \n[2] Add a penny. \n[3] Add a nickel. \n[4] Add a dime. \n[5] add a quarter. \n[6] Take a money out of bank. \nEnter 0 to quit. \nEnter your choice :");
    }    

    public void acceptUserInput()
    {
        userInput = sc.nextInt();

        //TO CHECK WHAT THE "userInput" VARIABLES CONTAINS...
        //System.out.println(userInput);
    }

    // public double getSavings()
    // {
    //     return savings;
    // }

    public void mainMenu()
    {
        displayOptions();
        acceptUserInput();

        switch (userInput)
        {
            case 0:
                System.exit(0);
                sc.close();
            break;

            case 1:
            showTotalInBank();
            break;

            case 2:
            addPenny();
            break;

            case 3:
            addNickel();
            break;

            case 4:
            addDime();
            break;

            case 5:
            addQuarter();
            break;

            case 6:
            takeOutMoney();
            break;
        }
    }

    public void showTotalInBank()
    {
        String strSavings = String.valueOf(savings);
        System.out.println("You are total savings is : "+ "$ " + strSavings);

        //DISPLAY THE COUNTS OF EACH COIN
        System.out.println(
            "PENNIES : " + pennyCount + "\n" +
            "NICKEL : " + nickelCount + "\n" +
            "DIME : " + dimeCount + "\n" +
            "QUARTER : " + quarterCount
            );

        System.out.println("Enter 0 to return to main menu.");

        userInput = sc.nextInt();

        if (userInput == 0);
        {
            mainMenu();    
        }
    }

    //THE FOLLOWING METHODS ARE FOR ADDING THE VALUE OF THE COINS TO YOUR TOTAL SAVINGS...
    public void addPenny()
    {
        newSavings = savings + Penny;
        savings = newSavings;

        System.out.println("You have added a Penny to your account.");
        pennyCount ++;
        mainMenu();
    }

    public void addNickel()
    {
        newSavings = savings + Nickel;
        savings = newSavings;

        System.out.println("You have added a Nickel to your account.");
        nickelCount ++;
        mainMenu();
    }

    public void addDime()
    {
        newSavings = savings + Dime;
        savings = newSavings;

        System.out.println("You have added a Dime to your account.");
        dimeCount ++;
        mainMenu();
    }

    public void addQuarter()
    {
        newSavings = savings + Quarter;
        savings = newSavings;

        System.out.println("You have added a Quarter to your account.");
        quarterCount ++;
        mainMenu();
    }

    public void takeOutMoney()
    {
        System.out.println("[1] Remove coins \n[2] Smash Piggy Bank \nEnter 0 to return to Main Menu \nEnter your choice : ");

        acceptUserInput();
        
        switch (userInput)
        {
            case 0:
                mainMenu();
            break;

            case 1:
                removeCoins();
            break;

            case 2:
                smashPiggyBank();
            break;
        }
    }

    public void removeCoins()
    {
        System.out.println(
            "PENNIES : " + pennyCount + "\n" +
            "NICKEL : " + nickelCount + "\n" +
            "DIME : " + dimeCount + "\n" +
            "QUARTER : " + quarterCount
            );

            acceptUserInput();
        
            switch (userInput)
            {
                case 0:
                    mainMenu();
                break;
    
                case 1:
                    removeAPenny();
                break;
    
                case 2:
                    removeANickel();
                break;

                case 3:
                    removeADime();
                break;

                case 4:
                    removeAQuarter();
                break;
            } 
    }

    //THE FOLLOWING METHODS ARE FOR REMOVING CERTAIN COINS IN YOUR PIGGYBANK...
    public void removeAPenny()
    {
        newSavings = savings - Penny;
        savings = newSavings;

        System.out.println("You have removed a Penny from your Piggy Bank");
        pennyCount --;
        mainMenu();
    }

    public void removeANickel()
    {
        newSavings = savings - Nickel;
        savings = newSavings;

        System.out.println("You have removed a Nickel from your Piggy Bank");
        nickelCount --;
        mainMenu();
    }

    public void removeADime()
    {
        newSavings = savings - Dime;
        savings = newSavings;

        System.out.println("You have removed a Dime from your Piggy Bank");
        dimeCount --;
        mainMenu();
    }

    public void removeAQuarter()
    {
        newSavings = savings - Quarter;
        savings = newSavings;

        System.out.println("You have removed a Quarter from your Piggy Bank");
        quarterCount --;
        mainMenu();
    }

    public void smashPiggyBank()
    {
        System.out.println("SMASSSSSSSHHHHHHHHHEEEEEEDDDDDDD");
        System.out.println("You've Smashed your Piggy Bank");

        System.out.println("You've Taken out" + " $ " + savings);

        //ZERO OUT THE COINS AND THE SAVINGS...
        pennyCount = 0; nickelCount = 0; dimeCount = 0; quarterCount = 0;
        savings = 0;

        System.out.println("Enter 0 to return to Main Menu");
        if (userInput == 0);
        {
            mainMenu();    
        }
    }

}
