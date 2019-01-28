package com.company;

public class SandwichMaker {

    public static void main(String[] args) {

        Sandwich sandwichOrder = new Sandwich();

        sandwichOrder.describeSandwich();

        Sandwich sandwich = new Sandwich("turkey", "swiss", true);
        sandwich.describeSandwich();

        Sandwich lunch = new Sandwich("turkey", "cheddar", false);
        lunch.describeSandwich();
        }


    }

