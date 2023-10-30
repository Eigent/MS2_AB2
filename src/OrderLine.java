public class OrderLine {
    public Integer quantity;
    public Product product;
    public String id;
    //public Order content;
    OrderLine(Product product, Integer quantity){
    //Jede OrderLine braucht zwingend ein Produkt und eine Menge um erstellt werden zu können
        this.product = product;
        this.quantity = quantity;

    }
}
