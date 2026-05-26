package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {

    private ArrayList<Card> cards = new ArrayList<>();
    private String GameName;



    CardGame(String GameName ) {
        this.GameName = GameName;
        String[] suits = {"♠","♥","♦","♣" };
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        Integer[] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};

        for(int i=0;i<suits.length;i++){
            for(int j=0;j<symbols.length;j++){
                Card card = new Card(suits[i],symbols[j],values[j]);
                cards.add(card);
            }
        }



    }
    public ArrayList<Card> getDeck() {
        return cards;
    }


    //dealCard()
    public Card dealCard(){
        Card deal = cards.get(0);
        cards.remove(0);
        return deal;
    }



    //shuffleDeck()
    public ArrayList<Card> shuffleDeck(){
    Collections.shuffle(cards);
    return cards;
    }
    //sortDeckInNumberOrder()
    public ArrayList<Card> sortDeckInNumberOrder(){
        Collections.sort(cards, (s1, s2) -> Integer.compare(s1.getValue(), s2.getValue()));
        return cards;
    }


    //sortDeckIntoSuits()
    public ArrayList<Card> sortDeckIntoSuits(){
    Collections.sort(cards, (s1, s2) ->
    {
        if (helper(s1.getSuit()) == (helper(s2.getSuit()))) {
            return Integer.compare(s1.getValue(), s2.getValue());
        } else {

            return Integer.compare(helper(s1.getSuit()), helper(s2.getSuit()));
        }
    });
        return cards;
    }










    private int helper(String suit){
        if(suit.equals("♠")) {
            return 4;
        }
        else if(suit.equals("♥")){
            return 3;
        }
        else if(suit.equals("♦")){
            return 2;
        }
        else if(suit.equals("♣")){
            return 1;
        }
return 0;

    }


}
