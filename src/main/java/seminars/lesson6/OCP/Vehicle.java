package seminars.lesson6.OCP;

public class Vehicle {

    private int maxSpeed;
    private String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public double calculateMaxSpeed(){

        return maxSpeed;
    }

    public String getType() {
        return type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setType(String type) {
        this.type = type;
    }
}
