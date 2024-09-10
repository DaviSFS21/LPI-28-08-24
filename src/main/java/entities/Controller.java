package entities;

public class Controller {
    String brand, color, consoleName;

    public Controller(String brand, String color, String consoleName) {
        this.brand = brand;
        this.color = color;
        this.consoleName = consoleName;
    }

    public void turnOn() { System.out.println("The controller is now on!"); }
    public void changeBattery() { System.out.println("You've changed the battery!"); }
    public void pressStart() { System.out.println("Start button pressed!"); }
}
