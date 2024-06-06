package org.example;

public class gameInstance {
    public int year;
    public int month = 1;
    public int day = 1;
    public int population;
    public int money = 10000;
    public int income;
    public int waterNeeded;
    public int waterProvided;
    public int electricityNeeded;
    public int electricityProvided;
    public String monthString;
    public String cityName;

    public gameInstance(int year, String city) {
        this.year = year;
        this.cityName = city;
    }


    public void nextStep(String actionID, String actionID2) {
//changes date to the next possible date
        //usually at the middle or beginning of a month
        if (month < 12 && day < 15) {
            day = 15;
        } else if (month < 12 && day == 15) {
            day = 1;
            month++;
        } else if (month == 12 && day == 1) {

            day = 15;
        } else {
            day = 1;
            month = 1;
        }

//deals with income, actions, building


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




