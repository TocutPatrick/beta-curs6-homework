import java.util.Scanner;

public class Product {

    private String name;
    private Integer price;
    private Integer quantity;
    private String category;

    public Product(String name, Integer price, Integer quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public Boolean hasStock() {
        if (quantity > 0)
            return true;
        else return false;

    }

    public Boolean isCategory() {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter category: ");
        String categoryFinder = key.next();

        if (categoryFinder.equals(category))
            return true;
        else return false;

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                '}';
    }
}
