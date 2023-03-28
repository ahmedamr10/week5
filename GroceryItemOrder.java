public class GroceryItemOrder {

    private String name;
    private int quantity = 0;
    private double price;

    public GroceryItemOrder(String name, double price) {
        this.name = name;
        this.price = price;
        quantity++;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost(){
        return quantity*price;
    }
}
