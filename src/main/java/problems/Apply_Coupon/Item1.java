package problems.Apply_Coupon;

public class Item1 extends Product{

    public Item1(String name, double originalPrice, ProductType type) {
        super(name, originalPrice, type);
    }

    @Override
    public double getPrice() {
        return this.originalPrice;
    }
}
