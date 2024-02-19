package homework.hw2;

import java.util.List;
import java.util.ArrayList;

public class Market implements MarketBehaviour,QueueBehaviour{
    private List<Actor> actorList = new ArrayList<>();
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " Зашел(шла) в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors){
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
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " Встал(а) в очередь");
        actorList.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : actorList){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " Сделал(а) заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : actorList){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " Получил(а) заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor : actorList){
            if(actor.isTakeOrder()){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " Вышел(ла) из очереди");
            }
        }
        releaseFromMarket(releasedActors);
    }
}