package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class Snap extends CardGame
{
    public Snap()
    {
        super("Snap");

    }
    public void startGame(){
        shuffleDeck();
        System.out.println("Game start!");
        //Create scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1- Press Enter to draw");
        //When input detected, move to the next line
        sc.nextLine();

        //Store card created from deal card in a variable
        Card previousCard = dealCard();
        System.out.println(previousCard);


        while(getDeck().size()>0)
        {
            System.out.println("Press Enter to draw!!");
            sc.nextLine();
            Card currentCard = dealCard();

            if (currentCard == null) {
                System.out.println("No more cards");
                break;
            }
            System.out.println(currentCard);

            if(currentCard.getSymbol().equals(previousCard.getSymbol())){
                System.out.println("SNAP! You win!");
                break;
            }
            else{
                previousCard = currentCard;
            }



        }







    }

}
