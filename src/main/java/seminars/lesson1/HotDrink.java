package seminars.lesson1;

public class HotDrink extends BottleOfWater{

    private Double temp;

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public HotDrink(String name, double cost, double volume, double temp) {
        super(name, cost, volume);
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name = '" + super.getName() + '\'' +
                ", cost = " + super.getCost() +
                ", volume = " + super.getVolume() +
                "temp=" + temp +
                '}';
    }
}
