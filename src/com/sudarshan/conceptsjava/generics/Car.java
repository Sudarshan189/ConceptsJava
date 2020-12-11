package com.sudarshan.conceptsjava.generics;

public class Car {
    private String company;
    private String model;
    private String fuel;

    public Car(String company, String model, String fuel) {
        this.company = company;
        this.model = model;
        this.fuel = fuel;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
