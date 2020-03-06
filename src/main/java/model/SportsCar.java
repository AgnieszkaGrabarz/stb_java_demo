package model;

public class SportsCar extends Car {

    private String carType;

    public SportsCar(String name, String color, String engineSize, String carType) {
        super(name, color, engineSize);
        this.carType = carType;
    }
}
