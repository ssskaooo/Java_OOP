package seminars.lesson2;

import homework.hw2.Human;
import homework.hw2.Market;

public class Main {

    public static void main(String[] args) {

        Market market = new Market();
        Human vitalii = new Human("Виталий");
        Human anastasia = new Human("Анастасия");
        market.acceptToMarket(anastasia);
        market.acceptToMarket(vitalii);

        market.update();


    }
}
