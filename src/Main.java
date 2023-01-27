import Model.Customer;
import Model.Order;
import Model.Items;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Items i1 = new Items("Snack", "Vegetarian","Panipuri");
        Items i2 = new Items("Drinks", "Soda","Coca-cola");

        Items i3 = new Items("Salad", "Non-vegetarian", "Chicken tikka salad");

        ArrayList<Items> Items1 = new ArrayList<>();
        Items1.add(i1);
        Items1.add(i2);

        ArrayList<Items> Items2 = new ArrayList<>();
        Items2.add(i3);


        Order o1 = new Order("Unknown1", Items1);
        Order o2 = new Order("Unknown2",  Items2);

        ArrayList<Order> customer98order = new ArrayList<>();
        customer98order.add(o1);

        ArrayList<Order> customer200order = new ArrayList<>();
        customer200order.add(o2);

        Customer c1 = new Customer(10966, customer98order, 500);
        Customer c2 = new Customer(17283, customer200order, 780);

        i1.getItemList();
        c1.getBill(1567);

    }
}