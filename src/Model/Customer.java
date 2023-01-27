package Model;
import java.util.ArrayList;
public class Customer {

        int customer_id;
        ArrayList<Order> orders;

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer(int customer_id, ArrayList<Order> orders, double price) {
        this.customer_id = customer_id;
        this.orders = orders;
        this.price = price;
    }

    double price;

    public void getBill(double no_of_items) {
        System.out.println("\n");
        System.out.println("Total amount is: " + (no_of_items * this.getPrice()));
    }



    }


