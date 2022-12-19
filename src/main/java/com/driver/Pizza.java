package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;
    private int toppingPrice;
    private int takeAwayPrice;


    private int extraCheesePrice;
    private int extraToppingPrice;
    //private int takeAwayPrice;

    boolean isCheeseAdded;
    boolean isToppingAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        this.cheesePrice = 80;
        this.takeAwayPrice = 20;

        if(isVeg==true){
            this.price = 300;
            this.toppingPrice = 70;
        }else{
            this.price = 400;
            this.toppingPrice = 120;
        }

        this.isCheeseAdded = false;
        this.isToppingAdded = false;
        this.isTakeAwayAdded = false;

        this.bill = "Base Of The Pizza: " + this.price + "\n";

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        if(isCheeseAdded == false){
            this.price = this.price + this.cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(isToppingAdded == false){
            this.price = this.price + this.toppingPrice;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        if(isTakeAwayAdded == false){
            this.price = this.price + this.takeAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        if(isBillGenerated == false){
            isBillGenerated = true;
            if(isCheeseAdded == true){
                this.bill = this.bill + "Extra Cheese Added: " + this.cheesePrice + "\n";
              }
            if(isToppingAdded == true){
                this.bill = this.bill + "Extra Topping Added: " + this.toppingPrice + "\n";
            }
            if(isTakeAwayAdded == true){
                this.bill = this.bill + "Paperbag Added: " + this.takeAwayPrice + "\n";
            }
            this.bill = this.bill + "Total Price: " + this.price + "\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
