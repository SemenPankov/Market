package interfaces;

import classes.Actor;
/**
 * Интерфейс отвечающий за поведение новых клиентов
 */
public interface iActorBehavior {
    /**
     * @apiNote метод проверяет сделан ли заказ клиентом
     */
    public boolean isTakeOrder();
    /**
     * @apiNote метод проверяет забрал ли клиент заказ
     */
    public boolean isMakeOrder();
    public void setTakeOrder(boolean isCreated);
    public void setMakeOrder(boolean isCreated);
    public Actor getActor();
    public boolean isGaveTheOrder();
    public void setgaveTheOrder(boolean isreturn);
}
