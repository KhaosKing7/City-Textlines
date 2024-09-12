package org.example;

import java.util.ArrayList;
import java.util.Random;
public class gameInstance {
    public int year;
    public int month = 1;
    public int day = 1;
    public int population;
    public int populationCapacity;
    public int money = 10000;
    public int income;
    public int waterNeeded;
    public int waterProvided;
    public int electricityNeeded;
    public int electricityProvided;
    public String monthString;
    public String cityName;
    public int resArea = 1;
    public int comArea = 1;
    public int indArea = 1;
    public int maxResArea;
    public int expenses;
    ArrayList<String> buildings = new ArrayList<String>();
    Random r = new Random();
    public gameInstance(int year, String city) {
        this.year = year;
        this.cityName = city;
    }

    public void nextStep(String actionID, String actionID2) {
        //changes date to the next possible date
        //usually at the middle or beginning of a month
        int halfWayPoint = month == 2 ? 14 : 15;
        if (day >= halfWayPoint) {
            month = (month % 12) + 1;
            day = 1;
        } else {
            day = halfWayPoint;
        }

//deals with income, actions, building
       if(actionID=="resArea" || actionID=="comArea" || actionID == "indArea"){
           buildings.add(actionID);
       }
        if(actionID2=="resArea" || actionID2=="comArea" || actionID2 == "indArea"){
            buildings.add(actionID2);
        }
       //counting how much of each area the player has and calculating stats based on that, adding money, population, electricity production ect ect.

        if(buildings.contains("resArea")){
            for (int i = 0; i<buildings.size(); i++){
                if(buildings.get(i)=="resArea"){
                   resArea++;
                }
            }
        }
        if(buildings.contains("comArea")){
            for (int i = 0; i<buildings.size(); i++){
                if(buildings.get(i)=="comArea"){
                    comArea++;
                }
            }
        }
        if(buildings.contains("indArea")){
            for (int i = 0; i<buildings.size(); i++){
                if(buildings.get(i)=="indArea"){
                    indArea++;
                }
            }
        }
        electricityProvided = indArea*10;
        waterProvided = indArea*5;
maxResArea = indArea*5;
      if(resArea<=maxResArea){
          populationCapacity = resArea*1000;
        }else {
          populationCapacity = maxResArea*1000;
      }
income = (population/10)*comArea;
electricityNeeded = resArea;
waterNeeded = resArea*2;
expenses = resArea*50+indArea*100;
money = money+income-expenses;

//add a random amount of people to the city
        int popAdd = r.nextInt(1,100);
        if((popAdd+population)<populationCapacity){
            population = popAdd+population;
        }
    }

    public void printDate() {
        monthString = switch (month) {
            case 1 -> "january";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "INVALID MONTH: BROKEN";
        };

        System.out.println(monthString + " " + day + ", " + year);

    }
}










