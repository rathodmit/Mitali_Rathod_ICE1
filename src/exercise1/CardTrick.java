package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Mitali
 * @author  Mitali Rathod Jan 25, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(1+Math.random()*13));
            card.setSuit(Card.SUITS[(int)(0+Math.random()*3)]);
    
            hand[i]=card;
            System.out.println(hand[i].getSuit() + hand[i].getValue());
        }

        Scanner kb = new Scanner(System.in);
        
        System.out.println("Please enter the value of your card between 1 to 13");
        int value =kb.nextInt();
        System.out.println("Please enter the value of your suit"); 
        String suit = kb.next();
        for(int i =0;i<hand.length;i++)
        {
         if(value==hand[i].getValue() && suit.equalsIgnoreCase(hand[i].getSuit()))
          
        {
            printInfo();
        }
        }
    
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Mitali Rathod Jan 2023
     */
   private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Mitali, but you can call me mini");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- I want to be an IT Technician");
        System.out.println("-- I also like cooking!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Painting");
        System.out.println("-- Travelling");
        System.out.println("-- Reading");
        System.out.println("-- Listening Music");

        System.out.println();
        
    
    }

}
