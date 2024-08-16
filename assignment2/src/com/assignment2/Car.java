package com.assignment2;

public class Car implements Vehicle{
    private int totalSeats = 4;
    private int topSpeed;

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    @Override
    public void maxSpeed() {
        System.out.println(topSpeed);
    }

    @Override
    public void type() {
        System.out.println("fuel");
    }

    @Override
    public void model() {
        System.out.println("Car");
    }

    @Override
    public void power() {
        System.out.println("1000HP");
    }

    @Override
    public void seats() {
        System.out.println(totalSeats+"seats");
    }

    @Override
    public void wheels() {
        System.out.println("4wheels");
    }

}
