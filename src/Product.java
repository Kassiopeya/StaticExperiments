public class Product {
    private static int count;
    private static int totalPrice;
    private String name;
    private int price;

    Product(String name, int price, int count){
        this.name = name;
        this.price = price;
        Product.count = Product.count + count;
        Product.totalPrice = Product.totalPrice + count * price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static int getCount() {
        return count;
    }

    public static double getAveragePrice() {
        return (double) totalPrice / count;
    }
}
