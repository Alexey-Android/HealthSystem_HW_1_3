package com.example.healthsystem;

public class Pressure {
    private int sys;
    private int dia;
    private int pulse;
    private boolean tachycardia;
    private  String dateTime;

    public Pressure(int sys, int dia, int pulse, boolean tachycardia, String dateTime) {
        this.sys = sys;
        this.dia = dia;
        this.pulse = pulse;
        this.tachycardia = tachycardia;
        this.dateTime = dateTime;
    }

    public Pressure() {

    }

    public int getSys() {
        return sys;
    }

    public void setSys(int sys) {
        this.sys = sys;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public boolean isTachycardia() {
        return tachycardia;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public void setTachycardia(boolean tachycardia) {
        this.tachycardia = tachycardia;
    }

    @Override
    public String toString() {
        return  "SYS=" + sys +
                ", DIA=" + dia +
                ", Пульс=" + pulse +
                ", Дата и время записи давления- " + dateTime + " ";
    }
}
