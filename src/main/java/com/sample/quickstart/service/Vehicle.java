package com.sample.quickstart.service;

abstract class Vehicle {

    abstract void accelerate();
    abstract void brake();

    void startEngine(){
        System.out.println("Engine Started");
    }

    class Car extends Vehicle {
        @Override
        void accelerate() {
            System.out.println("Car Accelerates");
        }

        @Override
        void brake() {
            System.out.println("Car Brakes");
        }
    }

    void CarActivity(){
        Vehicle sampleCar = new Car();
        sampleCar.accelerate();
        sampleCar.brake();
    }
}
