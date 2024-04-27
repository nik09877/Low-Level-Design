package problems.Apply_Coupon;

import java.util.ArrayList;
import java.util.List;

public class TypeCouponDecorator extends CouponDecorator{

    Product product;
    int discountPercentage;
    ProductType type;
    static List<ProductType>eligibleTypes = new ArrayList<>();
    static{
        eligibleTypes.add(ProductType.FURNITURE_GOODS);
        eligibleTypes.add(ProductType.ELECTRONICS_GOODS);
    }

    public TypeCouponDecorator(Product product, int discountPercentage, ProductType type) {
        this.product = product;
        this.discountPercentage = discountPercentage;
        this.type = type;
    }

    @Override
    public double getPrice() {
        double price = product.getPrice();
        if(eligibleTypes.contains(type)){
            return price - (price * discountPercentage)/100;
        }
        return price;
    }
}
