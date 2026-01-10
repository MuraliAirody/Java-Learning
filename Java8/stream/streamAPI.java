package Java8.stream;

import java.util.ArrayList;

public class streamAPI {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();

        productList.add(new Product(0, "HP laptop", 50000));
        productList.add(new Product(1, "Dell laptop", 40000));
        productList.add(new Product(2, "Lenevo laptop", 55000));
        productList.add(new Product(3, "Sony laptop", 67000));
        productList.add(new Product(4, "Samsung laptop", 88000));
        productList.add(new Product(5, "Apple laptop", 90500));

        productList.stream()
                .filter((product) -> product.price > 50000)
                .forEach((product) -> System.out.println(product.name));

        double totalPrice = productList.stream().map((product) -> product.price)
                .reduce((double) 0, (sum, price) -> sum + price);
        System.out.println(totalPrice);
    }
}

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
