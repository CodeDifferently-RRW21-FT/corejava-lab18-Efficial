package vending.machine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.start();

    }
        public void start(){
            Scanner scanner = new Scanner(System.in);
            Terminal terminal = new Terminal();

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
                        terminal.addBalance();
                        break;
                    case 2:
                        terminal.transferBalance();
                        break;
                    case 3:
                        terminal.checkBalance();
                        break;
                    case 4:
                        terminal.buySnacks();
                        break;
                    case 5:
                        flag = false;
                        break;
                    default:
                        System.out.println("You selected a unknown option.");

                }
            }
        }
    }
