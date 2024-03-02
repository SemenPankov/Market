package classes;

import interfaces.iActorBehavior;

public class PromotionalClient implements iActorBehavior {
    private String stock;
    private int id;
    private int numberOfParticipants;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    private boolean isGaveTheOrder;
    
    public PromotionalClient(String stock, int id, int numberOfParticipants) {
        this.stock = stock;
        this.id = id;
        this.numberOfParticipants = numberOfParticipants;
    }
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }
    @Override
    public void setTakeOrder(boolean isCreated) {
        isTakeOrder = isCreated;
    }
    @Override
    public void setMakeOrder(boolean isCreated) {
        isMakeOrder = isCreated;
    }
    @Override
    public Actor getActor() {
        return new OrdinaruClient("Аукционный клиент");
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
