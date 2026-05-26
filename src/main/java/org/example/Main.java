package org.example;

import java.util.ArrayList;

public class Main{
public static void main (String[] args){
//    Card card = new Card("King", "Hearts", 2);
//    System.out.println(card);
CardGame deck = new CardGame("Snap");
ArrayList<Card> output = deck.getDeck();


Snap start = new Snap();
start.startGame();



//    Card deal = deck.dealCard();
//    System.out.println(deal);
//    System.out.println(output.size());
//
//    ArrayList<Card> shuffle = deck.shuffleDeck();
//   System.out.println(shuffle);
//
//    ArrayList<Card> sort = deck.sortDeckInNumberOrder();
//    System.out.println(sort);

//    ArrayList<Card> suitSort = deck.sortDeckIntoSuits();
//    System.out.println(suitSort);

//    for(int i=0;i<output.size();i++){
//        System.out.println(output.get(i));
//            }


}

}