package org.example;

import java.util.Scanner;
import java.util.Random;

import org.example.gameInstance;

import java.lang.Math;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static Random r = new Random();
    static gameInstance game;

    public static void main(String[] args) {
        Main Game = new Main();
        Game.mainMenu();
    }

    public void mainMenu() {
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

    public void newGameMenu() {
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
                    game = new gameInstance(r.nextInt(1900, 2300), cityNameInput);
                    gameLoop();
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
                    game = new gameInstance(r.nextInt(1900, 2300), cityNameInput2);
                    gameLoop();
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

    public void gameLoop() {
//loopity loop stuff make game work
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Welcome to your city, " + game.cityName);
        while (true) {
            //if actions = 2 it won't let you do anything else
            //basically you cant do 2 things (important things) like building stuff
            // however things like making a decision on an event doesn't count towards the action count
            int actions = 0;
            gameMainMenu();
        }
    }

    public void gameMainMenu() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(game.cityName);
        game.printDate();
        System.out.println("1: build/demolish");
        System.out.println("2: decisions");
        System.out.println("q: quit");
        String choice = sc.nextLine();
        switch (choice) {
            case "1":
                break;
            case "2":
                break;
            case "q":
                break;
            default:
                break;
        }
    }
}