package homework.hw2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human vitalii = new Human("Виталий");
        Human anastasia = new Human("Анастасия");
        market.acceptToMarket(anastasia);
        market.update();
    }
}
