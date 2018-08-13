package com.lkb.dagger2demo;

public class CoffeeApp {
    public static void main(String[] args) {
        ElectricHeater electricHeater = new ElectricHeater();
        CoffeeMaker coffeeMaker = new CoffeeMaker(electricHeater, new Thermosiphon(electricHeater));
        coffeeMaker.brew();
    }
}
