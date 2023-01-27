package Model;

import java.util.ArrayList;
public class Order {

    String Customer;

   ArrayList<Items> Ordered_items;

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    public ArrayList<Items> getOrdered_items() {
        return Ordered_items;
    }

    public void setOrdered_items(ArrayList<Items> ordered_items) {
        Ordered_items = ordered_items;
    }

    public Order(String customer, ArrayList<Items> ordered_items) {
        Customer = customer;
        Ordered_items = ordered_items;
    }
}
