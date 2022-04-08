package com.skilldistillery.blackjack.app;

public class BlackJackApp {
	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.run();
	}
	
	public void run() {
		
	}
}

//Grading
//This is a graded project. You are expected to have your project completed by the start of class on Monday morning.
//You will be given either a pass or fail based on whether your code works given all of the following test conditions:
//Your program must NOT be contained in one procedural main(). You MUST design a OO class structure.
//When the game begins both the player and dealer are dealt two cards.
//If a player or dealer is dealt 21 the game is over. Otherwise the player can choose to 
//hit as many times as they wish until they choose to stay.
//Once the player has completed their turn the dealer will begin their turn, automatically
//hitting or staying according to the Blackjack rules.
//The game is immediately over if either player gets above 21.
//The winner is displayed.

//	User Story #1
//	Create a class structure that mimics a deck of cards. Remember decks as well 
//	as hands are made up of cards. Feel free to create the structure in any way you see fit.
//	Your card and deck implementations should NOT be coupled to Blackjack; you should
//	be able to reuse them to implement a poker or bridge game application.
//	
//	User Story #2
//	Add methods and fields to your classes that mimic the functionality of shuffling 
//	and dealing a deck of cards. Remember that when a card is dealt you have to remove 
//	it from the current deck. You should be able to print out a shuffled deck to the terminal.
//	
//	User Story #3
//	Deal two hands of cards - one to a Dealer and another to a Player. Allow the players 
//	to Hit (add cards to their hand) or Stay (not add cards to their hand) in accordance 
//	to the rules of blackjack shown in the wiki.
//	Do not worry about the multiple values for Ace until your basic game logic is working.
//	Assume they are either 1 or 11 to start.
//	
//	User Story #4
//	The Dealer's decisions are based on game logic in the program.
//	The Dealer must decide to Hit or Stay based on the rules of Blackjack: if the Dealer's
//	hand total is below 17, the Dealer must Hit; if the hand total is 17 or above, the Dealer must Stay.
//	
//	User Story #5
//	Determine the winner of each round by implementing the remaining rules of Blackjack 
//	(such as going over 21) and comparing hand values.