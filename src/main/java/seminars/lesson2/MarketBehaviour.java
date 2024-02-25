package seminars.lesson2;


import java.util.List;

public interface MarketBehaviour {

    void acceptToMarket(homework.hw2.Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();

}
