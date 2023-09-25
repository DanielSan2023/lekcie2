package com.engeto.computers;

public class Computer {
    private String model;                   // encapsulation hodnota pristupna len z tejto triedy
    private double weight;
    private double diagonalOfMonitor;
    private boolean isCompanyComputer;
    private boolean isLaptop;
    private boolean isDesktopComputer;


    //region konstruktory

    public Computer(String model, double weight) {
        //this(model, weight,15.6,true,true);
        this.model = model;
        this.weight = weight;
        this.diagonalOfMonitor = 15.6;
        this.isCompanyComputer =true;
        this.isLaptop = true;

    }



    public Computer(String model, double weight, double diagonalOfMonitor, boolean isCompanyComputer, boolean isNotebook) {
        this.model = model;
        this.weight = weight;
        this.diagonalOfMonitor = diagonalOfMonitor;
        this.isCompanyComputer = isCompanyComputer;
        this.isLaptop = isNotebook;





    }


    //endregion
    //region  Pristupove metody  Get a Set


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDiagonalOfMonitor() {
        return diagonalOfMonitor;
    }

    public void setDiagonalOfMonitor(double diagonalOfMonitor) {
        this.diagonalOfMonitor = diagonalOfMonitor;
    }

    public boolean isCompanyComputer() {
        return isCompanyComputer;
    }

    public void setCompanyComputer(boolean companyComputer) {
        isCompanyComputer = companyComputer;
    }

    public boolean isNotebook() {
        return isLaptop;
    }

    public void setNotebook(boolean notebook) {
        isLaptop = notebook;
    }
    //endregion

    public boolean shouldUseDockingStation(){
        return diagonalOfMonitor < 17;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", diagonalOfMonitor=" + diagonalOfMonitor +
                '}';
    }
}