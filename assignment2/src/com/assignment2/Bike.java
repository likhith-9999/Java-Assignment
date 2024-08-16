package com.assignment2;

public class Bike implements Vehicle{
    private int totalSeats = 2;
    private int topSpeed = 120;

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public void seats() {
        System.out.println(totalSeats);
    }

    @Override
    public void wheels() {
        System.out.println("2wheels");
    }

    @Override
    public void power() {
        System.out.println("500HP");
    }

    @Override
    public void model() {
        System.out.println("bike");
    }

    @Override
    public void maxSpeed() {
        System.out.println(topSpeed);
    }

    @Override
    public void type() {
        System.out.println("fuel");
    }
}
