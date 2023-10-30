import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //initiale Anlage zweier Produkte, eines Mitarbeiters und eines CorporateCustomers
        Product banane1 = new Product("Banane", "Obst", 1.0) {};
        Product stuhl1 = new Product("Stuhl", "Möbel", 50.0) {};
        Employee emp1 = new Employee("1234"){};
        CorporateCustomer obi = new CorporateCustomer(emp1){};
        Integer orderCreated;
        //Aufruf einer Funktion um eine Bestellung anzulegen
        createOrder(obi,banane1,5);
        Order lastOrderCreated = createOrder(obi,banane1,5);
        addToOrder(lastOrderCreated,stuhl1,20);

    }
    public static Order createOrder(Customer customer, Product product, Integer quantity){
        //Da Orders eine Liste von Orderlines beinhalten, muss auch zunächst eine Orderline angelegt werden
        OrderLine orderLine1 = new OrderLine(product, quantity);
        //Die OrderList mit OrderLines als Inhalt muss ebenfalls erstellt und anschließend an den Kontruktor der Order übergeben werden -> lineItems
        ArrayList <OrderLine> orderList = new ArrayList<>();
        orderList.add(orderLine1);
        Order order1 = new Order(customer, orderList){};

        System.out.println("Kunde: " + order1.customer.name);
        System.out.println("hat " + orderList.get(0).quantity);
        System.out.println("Mal " + orderList.get(0).product.name);
        System.out.println("der Kategorie: " + orderList.get(0).product.category + " bestellt.");
        return order1;

    }
    public static void addToOrder(Order orderToAdd, Product product, Integer quantity){
        Integer elementsInList = orderToAdd.lineItems.size()-1;
        OrderLine orderLine = new OrderLine(product,quantity);
        ArrayList <OrderLine> orderList = new ArrayList<>();

        orderToAdd.lineItems.add((orderToAdd.lineItems.size()),orderLine);
        System.out.println(orderToAdd.lineItems);
        System.out.println(orderToAdd.lineItems.get(1).product.name);
        System.out.println(orderToAdd.lineItems.get(1).product.category);
        System.out.println(orderToAdd.lineItems.get(1).quantity);
    }
}


