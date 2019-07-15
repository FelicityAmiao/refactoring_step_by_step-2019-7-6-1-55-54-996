package com.tws.refactoring;

public class Driver {
    private int age;

    public Driver(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLegalDriver() {
        return this.age >= 18;
    }
}
