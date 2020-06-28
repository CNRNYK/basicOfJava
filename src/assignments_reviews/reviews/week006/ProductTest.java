package assignments_reviews.reviews.week006;

public class ProductTest {
    public static void main(String[] args) {

        Product productObj1 = new Product();
        Product productObj2 = new Product();

        productObj1.title = "Spoon";
        productObj1.price = 10.15;
        productObj1.rating = 5;
        productObj1.Seller = "Amazon";

        productObj1.display();
        productObj2.display();

    }
}
