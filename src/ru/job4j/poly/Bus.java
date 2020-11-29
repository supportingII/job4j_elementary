package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Bus drive.");
    }

    @Override
    public void getPassangers(int amountPassangers) {
        System.out.println(amountPassangers + " sat down in bus.");
    }

    @Override
    public double fillUp(int litres) {
        double price = 47.56;
        return litres * price;
    }
}
