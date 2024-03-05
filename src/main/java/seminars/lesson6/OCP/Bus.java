package seminars.lesson6.OCP;

public class Bus extends Vehicle{


    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    @Override
    public double calculateMaxSpeed() {
        return super.calculateMaxSpeed();
    }


}
