package interfaces;

import java.util.List;

import classes.Actor;

/**
 * интерфейс отвечающий за отслеживание приходящих и уходячищ клиентов
 */
public interface iMarketBehavior {
    /**
     * @apiNote метод оповещает о новом клиенты пришедшем в магазин
     * @param actor
     */
    public void acceptToMarket(iActorBehavior actor);
    /**
     * @apiNote метод оповещает что клиент покинул магазин
     * @param actors
     */
    public void releaseFromMarket(List<Actor> actors);
    /**
     * @apiNote метод информирует о действиях клиента и обновляет их
     */
    public void update();
}
