import classes.Actor;
import classes.Market;
import classes.OrdinaruClient;
import classes.PromotionalClient;
import classes.SpecialClient;
import classes.TaxcInspector;

public class App {
    public static void main(String[] args) throws Exception {
       Market magnit = new Market();
       Actor client1 = new OrdinaruClient("Толик"); 
       Actor client2 = new OrdinaruClient("Надя"); 
       Actor client3 = new SpecialClient("Губернатор", 1);
       TaxcInspector client4 = new TaxcInspector();
       PromotionalClient client5 = new PromotionalClient("акция 3 + 1", 5, 20);

       magnit.acceptToMarket(client1);
       magnit.acceptToMarket(client2);
       magnit.acceptToMarket(client3);
       magnit.acceptToMarket(client4);
       magnit.acceptToMarket(client5);
       magnit.update();
    }
}
