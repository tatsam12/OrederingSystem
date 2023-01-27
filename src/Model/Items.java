package Model;

public class Items extends Category {


    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public Items(String name, String category_type, String item_name) {
        super(name, category_type);
        this.item_name = item_name;
    }

    String item_name;

    public Items(String name, String category_type) {
        super(name, category_type);
    }

    public void getItemList () {
        System.out.println(" ITEMS");
        System.out.println("Main Category: " +this.getName());
        System.out.println("Category: " + this.getCategory_type());
        System.out.println("Item: " + this.getItem_name());
    }
}

