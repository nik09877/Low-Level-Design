package problems.Apply_Coupon;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product>cart;

    public ShoppingCart(){
        cart = new ArrayList<>();
    }
    public ShoppingCart(List<Product> cart) {
        this.cart = cart;
    }

    public void addToCart(Product product){
        Product productWithEligibleDiscount = new TypeCouponDecorator(new PercentageCouponDecorator(product,10),3,product.getType());
        cart.add(productWithEligibleDiscount);
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for(Product prod:cart){
           totalPrice+= prod.getPrice();
        }
        return totalPrice;
    }

}
