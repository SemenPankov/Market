package interfaces;


/**
 * интерфейс описывает действия клиента в магазине
 */
public interface iQueueBehavior {
    /**
     * @apiNote метод добавляет клиента в очередь
     * @param actor
     */
    public void takeInQueue(iActorBehavior actor);
    /**
     * @apiNote метод проверяет забрал ли клиент заказ и оповещает об его уходе из очереди
     */
    public void releaseFromQueue();
    /**
     * @apiNote метод проверяет был ли сделан заказ клиентом, если нет то тогда оформляет заказ
     */
    public void takeOrder();
    /**
     * @apiNote метод проверяет был ли сделан заказ клиентом, если да то выдаёт заказ
     */
    public void giveOrder();
}
