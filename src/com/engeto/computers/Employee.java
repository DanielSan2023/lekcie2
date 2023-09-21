package com.engeto.computers;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate birthdate;
    private Computer computer;

    public Employee(String name, LocalDate birthdate, Computer computer) {
        this.name = name;
        this.birthdate = birthdate;
        this.computer = computer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
