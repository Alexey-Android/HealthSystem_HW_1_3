package com.example.healthsystem;

public class Indicators {
    private double weight;
    private int steps;
    private String dateTime2;

    public Indicators(double weight, int steps, String dateTime2) {
        this.weight = weight;
        this.steps = steps;
        this.dateTime2 = dateTime2;
    }

    public Indicators() {

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public String getDateTime2() {
        return dateTime2;
    }

    public void setDateTime2(String dateTime2) {
        this.dateTime2 = dateTime2;
    }

    @Override
    public String toString() {
        return "Вес=" + weight +
                ", Количество шагов=" + steps +
                ", Дата и время записи показателей - " + dateTime2 + " ";
    }
}
