package com.lkb.dagger2demo;

public class CoffeeApp {
    public static void main(String[] args) {
        Heater heater = new ElectricHeater();
        Pump pump = new Thermosiphon(heater);
        CoffeeMaker coffeeMaker = new CoffeeMaker(heater, pump);
        coffeeMaker.brew();
    }
}
