import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main 
{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Players>  players = new ArrayList<Players>();
    static int initVal = 0;

    public static void main(String[] args) 
    {
        registerPlayers();
        displayPlayers();
        play();
    }

    public static void registerPlayers()
    {        
        System.out.println("How many players wants to play? : ");
        int playerCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < playerCount; i++) 
        {
        System.out.println("What is this player's name? : ");
        String name = sc.nextLine();

        Players player = new Players(name,initVal);
        players.add(player);
        }
    }

    public static void displayPlayers()
    {
        System.out.println("The Players are : ");

        for(Players p : players)
        {
                System.out.print( "[ ] " +p.getPName() + "\n");    
        }
    }

    public static void bowl(Players p)
    {
        Random rand = new Random();

        int pinsLeft = 10;
        int roll = rand.nextInt(pinsLeft + 1);
        int turn;
        int frame = 1; 

        for(turn = 1; turn <= 2; turn++)
        {
            System.out.println("TURN : " + turn);
            System.out.println("You've knocked down " + roll + " pins.");
            pinsLeft = pinsLeft - roll;
            roll = rand.nextInt(pinsLeft + 1);
            // roll = rand.nextInt(pinsLeft);
            System.out.println("There are " + pinsLeft + " left.");
            
            frame++; 
            if(pinsLeft == 0){
                break;
            }
        }
        giveScore(pinsLeft,turn,frame,p);
        System.out.println("End of Frame. \n");
    }

    public static void giveScore(int pinsLeft, int turn, int frame,Players p)
    {
        int fScore;
        
        if (pinsLeft == 0 && turn == 1)
        {
            System.out.println("STRIKE ! ! !");
            fScore = 20;
        }
        else
        {
            if (pinsLeft == 0)
            {
                System.out.println("SPARE ! ! !");
                fScore = 15;
            }
            else 
            {
                System.out.println("NOT A STRIKE OR SPARE");
                fScore = 10 - pinsLeft;
            }
        }
        // else if (pinsLeft == 0 && turn == 2)
        // {
        //     System.out.println("SPARE ! ! !");
        //     fScore = 15;
        // }
        // else if (pinsLeft != 0 && turn ==2 );
        // {
        //     System.out.println("NOT A STRIKE OR SPARE");
        //     fScore = 10 - pinsLeft;
        // }

        p.setTotalScore(p.getTotalScore() + fScore);
        System.out.println("You Scored : " + fScore + " this frame." );
        System.out.println(p.getTotalScore());
        //getTotalScore(fScore);
    }

    public static void play()
    {
        for (int i = 0; i < players.size(); i++)
        {
            System.out.println("PLAYER : " + players.get(i).getPName());

            for (int frame = 1; frame <= 10; frame++)
            {    
            System.out.println("FRAME : "  + frame);
            bowl(players.get(i));
            }
        }
    }
}
