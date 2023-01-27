package Model;

public class Category extends MainCategory{

//    String Vegetarian;
//
//    String NonVegetarian;
//
//    String Vegan;
//
//    String SodaDrinks;
//
//    String AlcoholicDrinks;

    public String getCategory_type() {
        return Category_type;
    }

    public void setCategory_type(String category_type) {
        Category_type = category_type;
    }

    public Category(String name, String category_type) {
        super(name);
        Category_type = category_type;
    }

    String Category_type;

    public Category(String name) {
        super(name);
    }
}
