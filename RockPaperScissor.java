/* Sam Dosi
 * Dr. Steinberg
 * COP3330 Spring 2022
 * Programming Assignment 1
*/
import java.util.Scanner; 
import java.util.Random;
public class RockPaperScissor {
    private int userwins;
    private int computerwins;
    private int game;
    private Random r;
    private Scanner input;
    public RockPaperScissor(int game,int seed, Scanner input)
    {
        r = new Random();
        r.setSeed(seed);
        this.game = game;
        this.input = input;
        userwins = 0;
        computerwins = 0;   
    }
    
    public static void greeting()
    {
        System.out.println("Welcome to the Rock...Paper...Scissor Game!");
        System.out.println("Let me tell you the rules to this game.");
        System.out.println("You and I will get to choose rock, paper, or scissor.");
        System.out.println("After we made a decision, we will then reveal the choices we both made and " +
"decide a winner based on these rules.");
        System.out.println("Rock beats Scissor!");
        System.out.println("Paper beats Rock!");
        System.out.println("Scissor beats Paper!");
        System.out.println("If we both pick the same option, then it is a tie.");
        System.out.println("Ready to play? Here we go! I've been told by users that I'm really good!");
        
        
    }
    
    public void playRound()
    {
        
        while(userwins < 3 && computerwins < 3)
        {
        System.out.println("Game " + game + " Tally");
        System.out.println("Player 1:     " + userwins );
        System.out.println("Player 2:     " + computerwins);
        System.out.println("It is your turn to choose.");
        int uChoice = userChoice();
        System.out.println("You have selected " + getChoice(uChoice) + "." );
        int result = choiceBattle(uChoice, computerChoice() );
        if(result == 1)
            userwins++;
        else if(result == 2)
            computerwins++; 
        }
   }
   public int userChoice() 
   {
            int choice;
            
             while(true){
            System.out.println("1: Rock\n" + "2: Paper\n" + "3: Scissor");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if(choice <= 0 || choice >= 4)
                System.out.println("That is an invalid choice. Please try again.");
            else
                break;
            }
             return choice;
   }
    public String getChoice(int x)
    {
        if(x == 1)
             return "rock";
        else if(x == 2)
            return "paper";
        else if(x == 3)
            return "scissor";
       return "A";   
    }
    
    public int computerChoice()
    {
    int upperbound = 3 ;
    int int_random = r.nextInt(upperbound) + 1;
        return int_random; 
        
    }
    public int choiceBattle(int p1, int p2)
    {
        String Choice,Choice2;
        //Tie
        if( p1 == p2 )
        {
            System.out.println("Tie!");
            System.out.println("A Tie Occur.");
               return 0;
         }

        System.out.println("You used " + getChoiceC(p1) + " and I used "+ getChoiceC(p2) +"!");

        //User selects rock computer picks paper
        if(p1 == 1 && p2 == 2){
            System.out.println("Paper beats Rock!");
            System.out.println("Player 2 gets a point.");
            return 2;
    }
        //User selects rock computer picks scissor 
        else if (p1 == 1 && p2 == 3){
            System.out.println("Rock beats Scissor!");
            System.out.println("Player 1 gets a point.");
            return 1;}
        //User selects paper computer picks rock 
        else if (p1 == 2 && p2 == 1 ){
            System.out.println("Paper beats Rock!");
            System.out.println("Player 1 gets a point.");
            return 1;
        }
        //User selects paper computer picks scissor 
        else if (p1 == 2 && p2 == 3 ){
            System.out.println("Scissor beats Paper!");
            System.out.println("Player 2 gets a point.");
            return 2;
        }
        //User selects scissor computer picks rock 
        else if (p1 == 3 && p2 == 1 ){
            System.out.println("Rock beats Scissor!");
            System.out.println("Player 2 gets a point.");
            return 2;
        }
        //User selects scissor computer picks paper 
        else if (p1 == 3 && p2 == 2 ){
            System.out.println("Scissor beats Paper!");
            System.out.println("Player 1 gets a point.");
            return 1;
        }
       return 0;
    }
    public String getChoiceC(int x)
    {
        if(x == 1)
             return "Rock";
        else if(x == 2)
            return "Paper";
        else if(x == 3)
            return "Scissor";
       return "A";   
    }
    public int getWinner() {
    if (userwins == 3) 
        return 1;
    else 
        return 0;
    }

    
}
