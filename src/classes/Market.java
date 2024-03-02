package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.iActorBehavior;
import interfaces.iMarketBehavior;
import interfaces.iQueueBehavior;
import interfaces.iReturnOrder;
/**
 * Класс описывает поведения клиента в мазазине
 */
public class Market implements iMarketBehavior, iQueueBehavior,iReturnOrder {
    private List<iActorBehavior> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehavior>();
    }
    /**
     * @apiNote метод оповещает о новом клиенты пришедшем в магазин и вызывает метод для добавленние его в очередь
     */
    @Override
    public void acceptToMarket(iActorBehavior actor) {
        System.out.println(actor.getActor().getName() + " ,клиент пришел в магазин ");
        takeInQueue(actor);

    }
    /**
     * @apiNote метод оповещает что клиент покинул магазин и удаляет из очереди
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " ,клиент ушел из магазина ");
            queue.remove(actor);
        }
    }
    /**
     * @apiNote метод информирует о действиях клиента и обновляет их
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
        requestForRefund();
        returnOfTheProduct();
    }
    /**
     * @apiNote метод проверяет был ли сделан заказ клиентом, если да то выдаёт заказ
     */
    @Override
    public void giveOrder() {
        for (iActorBehavior actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " ,клиент получил свой заказ ");
            }
        }
    }
    /**
     * @apiNote метод проверяет забрал ли клиент заказ и оповещает об его уходе из очереди сохраняя его в List
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehavior actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " ,клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }
    /**
     * @apiNote метод добавляет клиента в очередь
     */
    @Override
    public void takeInQueue(iActorBehavior actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " ,клиент добавлен в очередь ");
    }
    /**
     * @apiNote метод проверяет был ли сделан заказ клиентом, если нет то тогда оформляет заказ
     */
    @Override
    public void takeOrder() {
        for(iActorBehavior actor : queue) {
            if (!actor.isMakeOrder()) {
            actor.setMakeOrder(true);
            System.out.println(actor.getActor().getName() + " ,клиент сделал заказ ");
            
            }
        }
    }
    /**
     * @apiNote метод оповещает о заявке на возврат и проверяет наличия товара
     */
    @Override
    public void requestForRefund(){
        for (iActorBehavior actor : queue) {
            if (!actor.isGaveTheOrder()) {
                actor.setgaveTheOrder(true);
                System.out.println(actor.getActor().getName() + " , клиент вернулся и сделал возврат");
            }
        }
    }
    /**
     * @apiNote метод оповещает о том что возврат принят
     */
    @Override
    public void returnOfTheProduct() {
        for (iActorBehavior actor : queue) {
            if(actor.isGaveTheOrder()){
                System.out.println(actor.getActor().getName() + " , возврат принят");
            }
        }
    }
    
    
    

}
