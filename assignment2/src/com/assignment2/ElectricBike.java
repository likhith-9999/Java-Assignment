package com.assignment2;

public class ElectricBike extends ElectricVehicle {
    private int totalSeats = 4;
    private int topSpeed;

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
        System.out.println(totalSeats+"seats");
    }

    @Override
    public void wheels() {
        System.out.println("4wheels");
    }

    @Override
    public void power() {
        System.out.println("300HP");
    }

    @Override
    public void model() {
        System.out.println("Electric bike");
    }

    @Override
    public void maxSpeed() {
        System.out.println(topSpeed);
    }
}
