package problems.Apply_Coupon;

/*
* Given Shopping cart with products and coupons
* and calculate the net price after applying coupons on products.
* Coupons can be of different types with certain conditions.
* 1. N% off that is 10% off for all the individual
* 2. P% off on next item
* 3. D% off on Nth item of Type T
* sequentially wants to apply all the coupons on the cart and get the Total amount
*
*
* //TODO
* Objects are Shopping cart, Product and Coupon
* It looks like we should use Decorator pattern to decorate each product
* */
public class Main {
    public static void main(String[] args) {
        Product item1 = new Item1("FAN",1000,ProductType.ELECTRONICS_GOODS);
        Product item2 = new Item2("SOFA",2000,ProductType.FURNITURE_GOODS);

        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(item1);
        cart.addToCart(item2);

        System.out.println("Total price after discount: " +cart.getTotalPrice());
    }
}
