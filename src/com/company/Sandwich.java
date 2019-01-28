package com.company;

public class Sandwich {

    private String breadType;
    private String proteinType;
    private String cheeseType;
    private boolean veggies;

    public Sandwich() {
        breadType = "wheat";
        proteinType = "turkey";
        cheeseType = "cheddar";
        veggies = true;
    }

    public Sandwich(String breadName, String proteinName, String cheeseName, boolean hasVeggies){
        breadType = breadName;
        proteinType = proteinName;
        cheeseType = cheeseName;
        veggies = hasVeggies;
    }

    public Sandwich(String proteinType, String cheeseType, boolean veggies){
        breadType = "Whole Grain";
        this.proteinType = proteinType;
        this.cheeseType = cheeseType;
        this.veggies = veggies;
    }
    public void setBreadType(String breadName) {
        breadType = breadName;
    }

    public String getBreadType() {
        return breadType;

    }

    public void setProteinType(String proteinName) {
        proteinType = proteinName;
    }

    public String getProteinType() {
        return proteinType;
    }

    public void setCheeseType(String cheeseName) {
        cheeseType = cheeseName;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public void setVeggies(boolean hasVeggies) {
        veggies = hasVeggies;
    }

    public boolean getVeggies() {
        return veggies;
    }

    public String printVeggies(){
        if(veggies == true){
            return "has veggies";
        }else{
            return "no veggies";
        }
    }
    public void describeSandwich() {
        System.out.println("Your sandwich will include:" + getBreadType() + ", " + getProteinType() + ", " + getCheeseType() + ", " + printVeggies());
    }
}
