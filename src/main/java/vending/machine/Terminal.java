package vending.machine;

import java.util.ArrayList;
import java.util.Scanner;

public class Terminal {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Card> userCards;
    Card User1;
    Card User2;
    Card User3;
    Card User4;
    Card User5;

    public Terminal(){
        userCards = new ArrayList<>();
        userCards.add(new Card(600));
        userCards.add(new Card(800));
        userCards.add(new Card(400));
        userCards.add(new Card(100));
        userCards.add(new Card(100));

        User1 = userCards.get(0);
        User2 = userCards.get(1);
        User3 = userCards.get(2);
        User4 = userCards.get(3);
        User5 = userCards.get(4);
    }


    public void addBalance() {
        Card currentCard = null;
        System.out.println("Which card would you like to use?");
        System.out.println("Pick a card from 1-5");

        int select = scanner.nextInt();
        currentCard = userCards.get(select-1);
        System.out.println("Card for user " + select + " was selected.");

        int cardBalance = currentCard.getBalance();
        System.out.println("Current balance of card is " + cardBalance);
        System.out.println("Please enter an amount in Dollars:");
        int amount = scanner.nextInt();
        currentCard.setBalance(cardBalance + (amount * 2));
        System.out.println("Your new current balance is " + currentCard.getBalance() + " credits.");
    }

    public void transferBalance(){
            Card currentCard = null;
            Card destinationCard = null;
            System.out.println("Which card would you like to transfer the balance from? 1-5");
            int input = scanner.nextInt();
            currentCard = userCards.get(input-1);
            System.out.println("And which card would you like to transfer the balance to? 1-5");
            int input2 = scanner.nextInt();
            destinationCard = userCards.get(input2-1);

            System.out.println("How many credits would you like to transfer?");
            int amount = scanner.nextInt();
            currentCard.setBalance(currentCard.getBalance() - amount);
            destinationCard.setBalance(destinationCard.getBalance() + amount);
            System.out.println("Task complete: The balance of Card" + input2 + " is now " + destinationCard.getBalance());
            System.out.println("The balance of Card " + input + " is now " + currentCard.getBalance());
        }


    public void checkBalance() {
        Card currentCard = null;
        System.out.println("Which card would you like to use?");
        System.out.println("Pick a card from 1-5");

        int select = scanner.nextInt();
        currentCard = userCards.get(select-1);
        System.out.println("Card for user" + select + "was selected.");
        
        int cardBalance = currentCard.getBalance();
        String currentBalance = "Your current card for user" + select + " is: " + cardBalance + " credits.";
        System.out.println(currentBalance);
        }


    public void buySnacks(){
        Card currentCard = null;
        System.out.println("Which card would you like to use?");
        System.out.println("Pick a card from 1-5");

        int select = scanner.nextInt();
        currentCard = userCards.get(select-1);
        System.out.println("Card for user " + select + " was selected.");

        System.out.println("Select the snack you would like to purchase.");
        System.out.println("For Chips(2 credits) Press 1.");
        System.out.println("For Cookies(2 credits) Press 2.");
        System.out.println("For Juice(4 credits) Press 3.");
        System.out.println("For Water(4 credits) Press 4.");
        SnackInventory snacks = new SnackInventory();
        int choice = scanner.nextInt();
        if (choice == 1) {
            snacks.getQuantityOfChips();
            int currentCardBalance = currentCard.getBalance() - snacks.getPriceOfChips();
            System.out.println("Your current card balance is: " + currentCardBalance + " credits.");
            System.out.println("Enjoy your chips purchase.");
        }
        else if (choice == 2){
            snacks.getQuantityOfCookies();
            int currentCardBalance = currentCard.getBalance() - snacks.getPriceOfCookies();
            System.out.println("Your current card balance is: " + currentCardBalance + " credits.");
            System.out.println("Enjoy your cookies purchase.");
        }
        else if (choice == 3){
            snacks.getQuantityOfJuice();
            int currentCardBalance = currentCard.getBalance() - snacks.getPriceOfJuice();
            System.out.println("Your current card balance is: " + currentCardBalance + " credits.");
            System.out.println("Enjoy your juice purchase.");
        }
        else if (choice == 4){
            snacks.getQuantityOfWater();
            int currentCardBalance = currentCard.getBalance() - snacks.getPriceOfWater();
            System.out.println("Your current card balance is: " + currentCardBalance + " credits.");
            System.out.println("Enjoy your water purchase.");
        }
    }
}
