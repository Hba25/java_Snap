package org.example;
import java.util.Scanner;
import java.time.Instant;

public class Snap extends CardGame
{
    public Snap()
    {
        super("Snap");

    }
    public void startGame(){
        //Create Players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        //Initialise players scores
        int player1Score = player1.getScore();
        int player2Score = player2.getScore();





        //Turn counter for players, 0 for P1, 1 for P2
        //Make it an integer to call methods on it
        Integer turnCount = 0;
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

            //Prints "Player X, press Enter" using turnCounter
            if(turnCount == 0){
                System.out.println(player1.getName() + " Press Enter");
            } else {
                System.out.println(player2.getName() + " Press Enter");
            }
            sc.nextLine();

            Card currentCard = dealCard();



            if (currentCard == null) {
                System.out.println("No more cards");
                break;
            }
            System.out.println(currentCard);


            //Check if the previous card is null after a snap. If it is
            if (!(previousCard == null)){
                if(currentCard.getSymbol().equals(previousCard.getSymbol())){
//                System.out.println("SNAP! You win!");
                    //Record exact time from snap
                    long beforeSnap = Instant.now().toEpochMilli();
                    System.out.println("Snap! Type snap within two seconds!!");
                    //Scanner to read user input
                    String snapOpp = sc.nextLine();
                    long afterSnap = Instant.now().toEpochMilli();
                    if (snapOpp.equals("snap") && afterSnap-beforeSnap<2000 ){
                        if(turnCount.equals(0)){
                            System.out.println("Player 1 gets a point!");
                            player1Score++;
                        }
                        else {
                            System.out.println("Player 2 gets a point!");
                            player2Score++;
                        }
                        previousCard = null;
                    }
                    else {
                        System.out.println("Too slow!:( Point to other player! >:)");
                        if(turnCount.equals(0)){
                            System.out.println("Player 2 gets a point!");
                            player2Score++;
                        }
                        else {
                            System.out.println("Player 1 gets a point!");
                            player1Score++;
                        }
                        previousCard = null;
                    }


                }
                //If snap is not triggered
                else {
                    previousCard = currentCard;
                }

            }
            //Snap logic


            //If the previous card is Null after a snap
            else{
                previousCard = currentCard;
            }
            //Turn swap
            if(turnCount == 0){
                turnCount = 1;
            } else{
                turnCount =0;
            }


        }
        System.out.println("Game over! Player 1: " + player1Score + " Player 2: " + player2Score);
        if(player1Score>player2Score){
            System.out.println("Player 1 - Wins!!!");
        } else if (player2Score>player1Score) {
            System.out.println("Player 2 - Wins!!!");
        } else {
            System.out.println("Draw :|");
        }








    }

}
