package assignments_reviews.reviews.week006;

public class Product {
    String title;
    double price;
    int rating;
    String Seller;

    public void display() {
        System.out.println("----------------");
        System.out.println("title " + title);
        System.out.println("price " + price);
        System.out.println("rating " + rating);
        System.out.println("seller " + Seller);
    }
}
