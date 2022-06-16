import java.sql.SQLOutput;

public class Vehicle {
    private boolean hasGasEngine = true;
    private int numOfDoors;
    private String color;
    private int maxSpeed;

    public void Vehicle(int doors, String color, int maxSpeed) {
        this.numOfDoors = doors;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void Drive(int speed) {
        System.out.println("Vehicle is driving at " + speed + "mph.");
    }

    public void Turn(String direction) {
        System.out.println("Vehicle is turning " + direction + ".");
    }
}
