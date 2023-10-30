import java.util.ArrayList;
import java.util.Date;

public class Order implements IList {
    //ruft das Interface IList auf - laut Diagramm "uses" - ist "implements" hier korrekt?
    // attributes
    public static int countOrder;
    public Date dateReceived;
    public Boolean isPrepaid;
    public Integer number;
    public Double price;
    public Customer customer;

    public ArrayList<OrderLine> lineItems;
    public Order(Customer customer,ArrayList<OrderLine> lineItems){
    //jede Order benötigt zwingend einen Kunden und eine Liste der OrderLines (auch wenn diese zu Beginn leer sein kann)
        this.customer = customer;
        this.lineItems = lineItems;
        this.number =countOrder;
        countOrder ++;
    }

    //functions
    public void dispatch(){
    }
    public void close(){
    }
}
