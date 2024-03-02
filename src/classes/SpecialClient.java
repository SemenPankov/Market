package classes;
/**
 * Класс создаёт специального клиента с vip номером
 */
public class SpecialClient extends Actor {
    private int idVip;
    public SpecialClient(String name, int idVip) {
        super(name);
        this.idVip = idVip;
    }
    public boolean isMakeOrder(){
        return super.isMakeOrder; 
    }
    public boolean isTakeOrder(){
        return super.isTakeOrder;
    }
    public void setMakeOrder(boolean isCreated){
        super.isMakeOrder = isCreated;
    }
    public void setTakeOrder(boolean isCreated){
        super.isTakeOrder = isCreated;
    }
    public Actor getActor(){
        return this;
    }
    @Override
    String getName() {
        return super.name;
    }
    @Override
    void setName(String name) {
        super.name = name;
    }
    @Override
    public boolean isGaveTheOrder() {
        return super.isGaveTheOrder;
    }
    @Override
    public void setgaveTheOrder(boolean isreturn) {
        super.isGaveTheOrder = isreturn;
    }
}
