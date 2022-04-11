/*
 * COP3330 Object Oriented Programming
 * Spring 2022
 * Programming Assignment 1 Runner File
 */

import java.util.Scanner;

public class RockPaperScissorRunner {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        RockPaperScissor.greeting(); // call greet method
        
        RockPaperScissor game1 = new RockPaperScissor(1, 0, input);
       
        game1.playRound();   
        
        if(game1.getWinner() == 1)
            System.out.println("Congratulations! You beat me!");
        else
            System.out.println("Sorry! You didn't win!");
        
        RockPaperScissor game2 = new RockPaperScissor(2, 6, input);
       
        game2.playRound();   
        
        if(game2.getWinner() == 1)
            System.out.println("Congratulations! You beat me!");
        else
            System.out.println("Sorry! You didn't win!");
        
        
        RockPaperScissor game3 = new RockPaperScissor(3, 1, input);
       
        game3.playRound();   
        
        if(game3.getWinner() == 1)
            System.out.println("Congratulations! You beat me!");
        else
            System.out.println("Sorry! You didn't win!");
        

        System.out.println("Thank you for playing today!");
    }
}

    
