package org.example;

import java.util.Scanner;
import java.util.Random;

import org.example.gameInstance;

import java.lang.Math;
import java.util.function.DoubleToIntFunction;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static Random r = new Random();
    static gameInstance game;
    public String actionID;
    public String actionID2;
    public int actions = 0;
    public static void main(String[] args) {
        Main main = new Main();
        main.mainMenu();
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
            //not implemented im just yapping


            gameMainMenu();
        }
    }

    public void gameMainMenu() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(game.cityName);
        game.printDate();
        System.out.println("Actions made: "+ actions);
        System.out.println("Money: " + game.money);
        System.out.println("Income: "+ game.income);
        System.out.println("Expenses: "+ game.expenses);
        System.out.println("Population: " +game.population);
        System.out.println("Population capacity:"+game.populationCapacity);
        System.out.println("____________________________________________________________");
        System.out.println("1: build/demolish");
        System.out.println("2: decisions");
        System.out.println("i: Information");
        System.out.println("n: Next Turn");
        System.out.println("q: quit");
        String choice = sc.nextLine();
        switch (choice) {
            //i have no idea how tf to do this :sob:
            case "1":
                buildMenu();
            break;
            case "n":
                game.nextStep(actionID, actionID2);
                actions = 0;
                break;
            case "q":
                mainMenu();
                break;
            case "i":
                System.out.println("Water Provided: "+game.waterProvided);
                System.out.println("Water Needed: "+ game.waterNeeded);
                System.out.println("Electricity Produced:"+game.electricityProvided);
                System.out.println("Electricity Needed:" + game.electricityNeeded);
                System.out.println("Usable Residential Areas: "+game.maxResArea);
                System.out.println("Residential Areas: " + game.resArea);
                System.out.println("Commercial Areas: "+game.comArea);
                System.out.println("Industrial Areas: "+game.indArea);
                sc.nextLine();
                gameMainMenu();
                break;
        }
    }

    public void buildMenu(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("1: Build");
        System.out.println("2: demolish");
        System.out.println("q: quit");
        String choice = sc.nextLine();
        switch(choice){
            case "1" -> buildChoices();
            case "2" -> demolishChoices();
            case"q" -> gameMainMenu();

        }

    }
    public void buildChoices(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("1: Residential area");
        System.out.println("2: Commercial area");
        System.out.println("3: Industrial area");
        String choice = sc.nextLine();
        switch(choice){
            case "1":
                if(actions==0){
                    actionID = "resArea";
                    actions++;
                    game.money = game.money-100;
                }else if(actions==1){
                    actionID2 = "resArea";
                    actions++;
                    game.money = game.money-100;
                }else {
                    System.out.println("You have already made 2 actions!");
                    gameMainMenu();
                }
                break;
            case "2":
                if(actions==0){
                    actionID = "comArea";
                    actions++;
                    game.money = game.money-100;
                }else if(actions==1){
                    actionID2 = "comArea";
                    actions++;
                    game.money = game.money-100;
                }else {
                    System.out.println("You have already made 2 actions!");
                    gameMainMenu();
                }
                break;
            case "3":
                if(actions==0){
                    actionID = "indArea";
                    actions++;
                    game.money = game.money-100;
                }else if(actions==1){
                    actionID2 = "indArea";
                    actions++;
                    game.money = game.money-100;
                }else {
                    System.out.println("You have already made 2 actions!");
                    gameMainMenu();
                }
                break;

        }
    }
    public void demolishChoices(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("What would you like to demolish?");
        System.out.println("1: Residential Area");
        System.out.println("2: Commercial area");
        System.out.println("3: Industrial area");
        System.out.println("q: quit");
        String choice = sc.nextLine();

        switch(choice){
            case "1":
                if(game.buildings.contains("resArea")){
                    for (int i = 0; i<game.buildings.size(); i++){
                        if(game.buildings.get(i)=="resArea"){
                            game.buildings.remove(i);
                            System.out.println("You have demolished a Residential area");
                            break;
                        }
                    }
                }else {
                    demolishChoices();
                    System.out.println("You have no Residential Areas.");
                }



                break;
            case "2":
                if(game.buildings.contains("comArea")){
                    for (int i = 0; i<game.buildings.size(); i++){
                        if(game.buildings.get(i)=="comArea"){
                            game.buildings.remove(i);
                            System.out.println("You have demolished a Commercial area");
                            break;
                        }
                    }
                }else {
                    demolishChoices();
                    System.out.println("You have no Commercial Areas.");
                }
                break;
            case "3":
                if(game.buildings.contains("indArea")){
                    for (int i = 0; i<game.buildings.size(); i++){
                        if(game.buildings.get(i)=="indArea"){
                            game.buildings.remove(i);
                            System.out.println("You have demolished a Industrial area");
                            break;
                        }
                    }
                }else {
                    demolishChoices();
                    System.out.println("You have no Commercial Areas.");
                }
                break;
        }
    }
}

