package e1;
import java.util.Scanner;
public class ex1_11_PokerHands {

	public static void main(String[] args){
		
		Hand thisHand = new Hand();
		
		Scanner kb = new Scanner(System.in);
		int added = 0;
		boolean quit = false;

		while (added < 5)
		{
			Boolean error = false;
			System.out.print("Please input card number " + (added + 1) + " in format (or j, q, k) follwed by suit (C,D,H,S) (q for quit):"); //ace is 1
			String input = kb.nextLine();
			int num=0;
			Suit suit=null;
			
			if (input.charAt(0) == 'q' && (input.length() == 1 || input.charAt(1) == ' ')) 
			{
				quit = true; 
				break;
			}
			
			if (input.length() <= 1) error = true;
			else if (input.length() > 2 && input.charAt(0) == '1' && input.charAt(1) == '0' ) num = 10;
			else if (input.length() > 1 && input.charAt(0) == 'j') num = 11; 
			else if (input.length() > 1 && input.charAt(0) == 'q') num = 12; 
			else if (input.length() > 1 && input.charAt(0) == 'k') num = 13;
			else if (Character.isDigit(input.charAt(0)))  num=Integer.parseInt(input.substring(0,1));
			else error = true;
			
			if (!error)
			{
				char suitChar;
				
				if (num != 10) suitChar = input.charAt(1);
				else suitChar = input.charAt(2);
				
				if (suitChar == 'H') suit = Suit.HEART;
				else if (suitChar == 'D') suit = Suit.DIAMOND;
				else if (suitChar == 'C') suit = Suit.CLUB;
				else if (suitChar == 'S') suit = Suit.SPADE;
				else error = true;
			}
			
			if (!error) 
			{
				Card newCard = new Card(num,suit);
				
				if (thisHand.alreadyHasCard(newCard)) error = true;
				else 
				{
				thisHand.add(newCard);
				added++;
				}
			}
			
			if (error) System.out.println("Error, input not understood");
		}
		
		if (quit) System.out.println("Program quit. Goodbye.");
		else thisHand.printBestHand();

	}
	
	
}

class Hand{
	Card[] hand = new Card[5];
	int num=0;
	
	public void printBestHand()
	{
		String bestHand="";
		
		if (isStraight() && isFlush()) bestHand="Straight Flush";
		else if (howManyOfAKind(4) == 1) bestHand ="4 of a kind";
		else if (howManyOfAKind(3) == 1 && howManyOfAKind(4) == 1) bestHand="Full House";
		else if (isFlush()) bestHand = "Flush";
		else if (isStraight()) bestHand = "Straight";
		else if (howManyOfAKind(3) == 1) bestHand = "Three of a kind";
		else if (howManyOfAKind(2) == 2) bestHand = "Two pairs";
		else if (howManyOfAKind(2) == 1) bestHand = "Pair";
		else bestHand = "Nothing";
		
		System.out.println("Your best hand is: " + bestHand);
		
	}
	
	public Boolean isFlush()
	{
		Suit suit = hand[0].suit;
		for (Card card : hand)
		{
			if (card.suit != suit) return false;
		}
		return true;
	}
	
	public Boolean isStraight()
	{
		int numEnds = 0;
		
		for (Card card : hand)
		{
			int num = card.number;
			int sameNums = 0, nextNums = 0;
			
			for (Card checkCard : hand)
			{
				if (checkCard.number == num) sameNums++;
				if (Math.abs(checkCard.number - num) == 1 || (Math.abs(num - checkCard.number) == 12)) nextNums++; //the ace and the king have an absolute value difference of 12 but are next to eachother, hence this check 
			}
			
			if (num==1 && nextNums != 1) return false; //Ace can only connect to high or lows and therefore must be connected to only one other card
			if (sameNums != 1) return false; //For a straight, each number can only appear once

			if (nextNums == 1) numEnds++; // If it appears at an end, hence only being connected to one other card, record this
			else if (nextNums != 2) return false;
		}
		
		if (numEnds != 2) return false;
		else return true;
		
	}
	
	public int howManyOfAKind(int checkThisKind)
	{
		int count = 0;
		
		for (Card card : hand)
		{
			int checkNum = card.number;
			int matched = 0;

			for (Card checkCard : hand)
			{
				if (checkCard.number == checkNum) matched++;
			}
			
			if (matched == checkThisKind) count++;
		}
		
		return count / checkThisKind;
	}
	
	public boolean alreadyHasCard(Card input)
	{
		for (Card card : hand)
		{
			if ( card != null && card.equals(input)) return true;
		}
		
		return false;
	}
	
	
	public void add (Card input)
	{
		hand[num] = input;
		num++;
	}
	
}

class Card{
	
	public int number;
	public Suit suit;
	
	public Card(int num, Suit suit)
	{
		number = num;
		this.suit = suit; 
	}
	
	public Boolean equals (Card input)
	{
		if (number == input.number && suit == input.suit) return true;
		else return false;
	}
	
}

enum Suit{
	HEART, DIAMOND, CLUB, SPADE
}
