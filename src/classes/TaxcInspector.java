package classes;

import interfaces.iActorBehavior;

public class TaxcInspector implements iActorBehavior {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    private boolean isGaveTheOrder;

    public TaxcInspector() {
        this.name = "Налоговый испектор";
    }

    @Override
    public Actor getActor() {
        return new OrdinaruClient("Тайный клиент");
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean isCreated) {
        isMakeOrder = isCreated;
    }

    @Override
    public void setTakeOrder(boolean isCreated) {
        isTakeOrder = isCreated;
    }

    @Override
    public boolean isGaveTheOrder() {
        return isGaveTheOrder;
    }

    @Override
    public void setgaveTheOrder(boolean isreturn) {
        isGaveTheOrder = isreturn;
    }

}