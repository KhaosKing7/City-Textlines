package org.example;

public class gameInstance {

    public int year;
    public int month = 1;
    public int day = 1;
    public int population;
    public int waterNeeded;
    public int waterProvided;
    public int electricityNeeded;
    public int electricityProvided;
    public String monthString;
public String cityName;
    public gameInstance(int yearInput, String cityNameInput) {
year = yearInput;
cityName = cityNameInput;
    }

    public void nextStep() {

        switch (month) {
            case 1:
                if (day < 15) {
                    day = 15;
                } else {
                    day = 1;
                    month = 2;
                }
                break;
            case 2:
                if (day < 14) {
                    day = 14;
                } else {
                    day = 1;
                    month = 3;
                }
                break;
            case 3:
                if (day < 15) {
                    day = 15;
                } else {
                    day = 1;
                    month = 4;
                }
                break;
            case 4:
                if (day < 15) {
                    day = 15;
                } else {
                    day = 1;
                    month = 5;
                }
                break;
            case 5:
                if (day < 15) {
                    day = 15;
                } else {
                    day = 1;
                    month = 6;
                }
                break;
            case 6:
                if (day < 15) {
                    day = 15;
                } else {
                    day = 1;
                    month = 7;
                }
                break;
            case 7:
                if (day < 15) {
                    day = 15;
                } else {
                    day = 1;
                    month = 8;
                }
                break;
            case 8:
                if (day < 15) {
                    day = 15;
                } else {
                    day = 1;
                    month = 9;
                }
                break;
            case 9:
                if (day < 15) {
                    day = 15;
                } else {
                    day = 1;
                    month = 10;
                }
                break;
            case 10:
                if (day < 15) {
                    day = 15;
                } else {
                    day = 1;
                    month = 11;
                }
                break;
            case 11:
                if (day < 15) {
                    day = 15;
                } else {
                    day = 1;
                    month = 12;
                }
                break;
            case 12:
                if (day < 15) {
                    day = 15;
                } else {
                    day = 1;
                    month = 1;
                    year++;
                }
                break;
            default:
                break;


        }


    }

    public void printDate() {
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "Febuary";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "BROKEN";
                break;
        }
        System.out.println(monthString + " " + day + ", " + year);

    }
}
