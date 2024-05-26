package org.example;

import java.util.Scanner;
import java.util.Random;

import org.example.gameInstance;

import java.lang.Math;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static Random r = new Random();

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        //the main menu method
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Welcome to City Textlines!");
        System.out.println("Inputting q will return you to the previous menu.");
        System.out.println("1: New Game");
        System.out.println("2: Load Game");
        System.out.println("3: Options");
        System.out.println("4: Credits");
        System.out.println("q: Exit Game");
        String menuChoice = sc.next();
        switch (menuChoice) {
            case "1":
                newGameMenu();
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "q":
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("bye bye");
                System.exit(0);
                break;
        }
    }

    public static void newGameMenu() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("New Game");
        System.out.println("1: Choose custom year");
        System.out.println("2: Random year");
        System.out.println("q: Exit");
        String newGameInput = sc.next();
        switch (newGameInput) {
            case "1":
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("New Game");
                System.out.println("Input Year");
                int yearInput = sc.nextInt();
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("New Game");
                System.out.println("Input City Name");
                String test = sc.nextLine();
                String cityNameInput = sc.nextLine();
                System.out.println("Is this correct?");
                System.out.println("Year: " + yearInput);
                System.out.println("City Name:" + cityNameInput);
                System.out.println("1: Yes (start game)");
                System.out.println("2: No");
                int confirmation = sc.nextInt();
                if (confirmation == 1) {
                    gameInstance game = new gameInstance(yearInput, cityNameInput);
                    // put method to start game loop
                } else {
                    newGameMenu();
                }
                break;
            case "2":
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("New Game");
                System.out.println("Input City Name");
                String test2 = sc.nextLine();
                String cityNameInput2 = sc.nextLine();
                System.out.println("Is this correct?");
                System.out.println("City Name:" + cityNameInput2);
                System.out.println("1: Yes (start game)");
                System.out.println("2: No");
                int confirmation2 = sc.nextInt();
                if (confirmation2 == 1) {
                    gameInstance game = new gameInstance(r.nextInt(1900, 2077), cityNameInput2);
                    // put method to start game loop
                } else {
                    newGameMenu();
                }
                break;
            case "q":
                mainMenu();
                break;
            default:
                newGameMenu();
                break;


        }

    }

public static void gameLoop(){
//loopity loop stuff make game work






}

}