package classes;

import interfaces.iActorBehavior;

/**
 * Абстрактный класс для реализации новых клиентов
 */
public abstract class Actor implements iActorBehavior{
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isGaveTheOrder;

    public Actor(String name) {
        this.name = name;
    }

    abstract String getName();
    abstract void setName(String name);
}
