package seminars.lesson2;


import homework.hw2.Actor;
import homework.hw2.MarketBehaviour;
import homework.hw2.QueueBehaviour;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {
    private List<homework.hw2.Actor> actorList = new ArrayList<>();
    @Override
    public void acceptToMarket(homework.hw2.Actor actor) {
        System.out.println(actor.getName() + " Зашел(шла) в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<homework.hw2.Actor> actors) {
        for (homework.hw2.Actor actor : actors){
            System.out.println(actor.getName() + " Вышел(шла) из магазина");
            actorList.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(homework.hw2.Actor actor) {
        System.out.println(actor.getName() + " Встал(а) в очередь");
        actorList.add(actor);
    }

    @Override
    public void takeOrders() {
        for (homework.hw2.Actor actor : actorList){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " Сделал(а) заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (homework.hw2.Actor actor : actorList){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " Получил(а) заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<homework.hw2.Actor> releasedActors = new ArrayList<>();
        for (Actor actor : actorList){
            if(actor.isTakeOrder()){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " Вышел(ла) из очереди");
            }
        }
        releaseFromMarket(releasedActors);
    }
}