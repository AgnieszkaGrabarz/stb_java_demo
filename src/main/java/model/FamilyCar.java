package model;

public class FamilyCar extends Car {

    private String carType;

    public FamilyCar(String name, String color, String engineSize, String carType) {
        super(name, color, engineSize);
        this.carType = carType;
    }

    public void describeCar() {
        System.out.println("Car name: " + name + " color: " + color + " engine size: " + engineSize + " car type: " + carType);
    }
}
