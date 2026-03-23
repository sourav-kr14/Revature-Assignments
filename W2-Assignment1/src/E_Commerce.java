import java.util.*;

class Product {
    int productId;
    String productName;
    String category;
    String brand;
    double price;
    int stock;
    double rating;
    double discountPercentage;
    boolean inStock;

    public Product(int productId, boolean inStock, double discountPercentage, double rating, int stock, double price, String category, String brand, String productName) {
        this.productId = productId;
        this.inStock = inStock;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.stock = stock;
        this.price = price;
        this.category = category;
        this.brand = brand;
        this.productName = productName;
    }

    public String toString() {
        return productName + " - " + category + " - " + price + " - " + rating + " - " + "stock " + " - " + discountPercentage + "%";
    }


}

public class E_Commerce {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, true, 8, 4.9, 10, 899000, "Electronics", "Apple", "MAC m2"));
        products.add(new Product(2, true, 5, 4.7, 8, 599000, "Electronics", "Apple", "Iphone 16"));
        products.add(new Product(3, false, 5, 4.2, 2, 9000, "Fashion", "Nike", "Shoes"));
        products.add(new Product(4, true, 2, 4.6, 21, 9800, "Fashion", "Adidas", "Tshirt"));

        products.forEach(p -> System.out.println(p));

        products.stream().filter(p -> p.price > 5000).forEach(System.out::println);

        products.stream().filter(p -> p.category.equalsIgnoreCase("Electronics")).forEach(System.out::println);

        products.stream().filter(p -> p.inStock).forEach(System.out::println);

        products.stream().sorted(Comparator.comparingDouble(p -> p.price)).forEach(System.out::println);

        System.out.println("Products sorted in Ascending order");
        products.sort((e1, e2) -> Double.compare(e1.price, e2.price));
        products.forEach(System.out::println);

        System.out.println("Products sorted in Descending order");
        products.sort((e1, e2) -> Double.compare(e2.price, e1.price));
        products.forEach(System.out::println);

        System.out.println("Products sorted according to rating from highest to lowest");
        products.sort((e1, e2) -> Double.compare(e2.rating, e1.rating));
        products.forEach(System.out::println);

        System.out.println("Products sorted according to names (alphabetically)");
        products.sort((e1, e2) -> CharSequence.compare(e2.productName, e1.productName));
        products.forEach(System.out::println);

        boolean more7k = products.stream().anyMatch(p -> p.price > 7000);
        System.out.println("Product greater than 7000   " + more7k);


        boolean rating = products.stream().allMatch(p -> p.rating > 3.5);
        System.out.println("Rating greater than 3.5   " + rating);

        boolean noMedical = products.stream().noneMatch(p -> p.category.equalsIgnoreCase("Medical"));
        System.out.println("No medical category " + noMedical);

        Optional<Product> max = products.stream().max(Comparator.comparingDouble(p -> p.price));
        System.out.println("Maximum price   " + max);


        Optional<Product> min = products.stream().min(Comparator.comparingDouble(p -> p.price));
        System.out.println("Maximum price   " + min);

        products.stream().filter(p -> p.category.equalsIgnoreCase("Electronics")).forEach(p -> p.price = p.price + p.price * 1.05);
        System.out.println("After increasing price of Electronic item by 15%");
        System.out.println(products);


        products.stream().filter(p -> p.category.equalsIgnoreCase("Fashion")).forEach(p -> p.discountPercentage = p.discountPercentage + 10);
        System.out.println("After increasing discount");
        System.out.println(products);


        products.stream().filter(p -> p.stock == 0).forEach(p -> p.inStock = false);

        int countFashion = Math.toIntExact(products.stream().filter(p -> p.category.equalsIgnoreCase("Fashion")).count());
        System.out.println("Number of fashion items " + countFashion);

        long ratingCount = products.stream().filter(p -> p.rating > 4.5).count();
        System.out.println("Produts with more than 4.5 rating   " + ratingCount);

        int outOfStock = Math.toIntExact(products.stream().filter(p -> !p.inStock).count());
        System.out.println("No of out of stock products     " + outOfStock);

    }
}