package vending.machine;

import java.util.Scanner;

public class Main {

        private Scanner scanner;
        private Card cardForUser1;
        private Card cardForUser2;
        SnackInventory snacks = new SnackInventory();

        public Main(){
            scanner = new Scanner(System.in);
            cardForUser1 = new Card(0);
            cardForUser2 = new Card(0);
        }

        public void addBalance() {
            Card currentCard = null;
            System.out.println("Press 1 to add money to card 1");
            System.out.println("Press 2 to add money to card 2");

                int select = scanner.nextInt();
                switch(select){
                    case 1:
                    System.out.println("Card for user 1 was selected");
                    currentCard = cardForUser1;
                    break;

                    case 2:
                    System.out.println("Card for user 2 was selected");
                    currentCard = cardForUser2;
                    break;

                    default:
                        System.out.println("Please enter a valid selection.");
                      return;
                    }

                int cardBalance = currentCard.getBalance();
                System.out.println("Current balance of card is " + cardBalance);
                System.out.println("Please enter an amount in Dollars:");
                int amount = scanner.nextInt();
                currentCard.setBalance(cardBalance + (amount * 2));
                System.out.println("Your new current balance is " + currentCard.getBalance() + " credits.");
            }

        public void transferBalance(){
        Card currentCard = null;
        System.out.println("Press 1 to use card 1");
        System.out.println("Press 2 to use card 2");
        int select = scanner.nextInt();
        if(select == 1){
            System.out.println("Card for user 1 was selected");
            currentCard = cardForUser1;
            int currentBalance = currentCard.getBalance();
            System.out.println("Your current balance is " + currentBalance + " credits.");

            System.out.println("How much would you like to transfer?");
            int creditsToTransfer = scanner.nextInt();
            if (creditsToTransfer < currentBalance) {
                currentCard.setBalance(currentBalance - creditsToTransfer);
                cardForUser2.setBalance(cardForUser2.getBalance() + creditsToTransfer);
                System.out.println("The new current balance for your card is: " + cardForUser1.getBalance() + " credits.");
                System.out.println("The current balance for user 2 card is: " + cardForUser2.getBalance() + " credits.");
            }
            else if (creditsToTransfer > currentBalance){
                    System.out.println("Choose a lower amount to transfer.");
                }
            }
            else{
            System.out.println("Card for user 2 was selected");
            currentCard = cardForUser2;
            int currentBalance = currentCard.getBalance();
            System.out.println("Your current balance is " + currentBalance + " credits.");
            System.out.println("How much would you like to transfer?");
            int creditsToTransfer = scanner.nextInt();
            if (creditsToTransfer < currentBalance) {
                currentCard.setBalance(currentBalance - creditsToTransfer);
                cardForUser1.setBalance(cardForUser1.getBalance() + creditsToTransfer);
                System.out.println("The new current balance for your card is: " + cardForUser2.getBalance() + " credits.");
                System.out.println("The current balance for user 1 card is: " + cardForUser1.getBalance() + " credits.");
            }
            else if (creditsToTransfer > currentBalance){
                System.out.println("Choose a lower amount to transfer.");
            }
            }
        }

        public void checkBalance() {
            Card currentCard = null;
            System.out.println("Press 1 to check the balance for card 1");
            System.out.println("Press 2 to check the balance for card 2");
            int select = scanner.nextInt();
            if (select == 1) {
                System.out.println("Card for user 1 was selected");
                currentCard = cardForUser1;
                int cardBalance = currentCard.getBalance();
                System.out.println("Your current card balance is: " + cardBalance + " credits.");
            } else {
                System.out.println("Card for user 2 was selected");
                currentCard = cardForUser2;
                int cardBalance = currentCard.getBalance();
                System.out.println("Your current card balance is: " + cardBalance + " credits.");
            }
        }

        public void buySnacks(){
            Card currentCard = null;
            System.out.println("Press 1 to use card 1");
            System.out.println("Press 2 to use card 2");
            int select = scanner.nextInt();
            if(select == 1){
                System.out.println("Card for user 1 was selected");
                currentCard = cardForUser1;
            }else {
                System.out.println("Card for user 2 was selected");
                currentCard = cardForUser2;
            }

                System.out.println("Select the snack you would like to purchase.");
                System.out.println("For Chips(2 credits) Press 1.");
                System.out.println("For Cookies(2 credits) Press 2.");
                System.out.println("For Juice(4 credits) Press 3.");
                System.out.println("For Water(4 credits) Press 4.");
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

        public void start(){
            boolean flag = true;
            while(flag) {

                System.out.println("-------------------------------------------------");
                System.out.println("WELCOME TO TERMINAL, PLEASE SELECT FROM OPTIONS: ");
                System.out.println("-------------------------------------------------");
                System.out.println("* Press 1 to add money to a card.");
                System.out.println("* Press 2 to transfer credits to another card.");
                System.out.println("* Press 3 to check the balance of a card.");
                System.out.println("* Press 4 to purchase great snacks. ");
                System.out.println("* Press 5 to exit. ");
                System.out.print(" What would you like to do?: " );

                int selection = scanner.nextInt();
                switch (selection) {
                    case 1:
                        addBalance();
                        break;
                    case 2:
                        transferBalance();
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        buySnacks();
                        break;
                    case 5:
                        flag = false;
                        break;
                    default:
                        System.out.println("You selected a unknown option.");

                }
            }

        }
        public static void main(String[] args) {
            Main main = new Main();
            main.start();

        }
    }
