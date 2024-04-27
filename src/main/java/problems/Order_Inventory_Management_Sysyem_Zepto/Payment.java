package problems.Order_Inventory_Management_Sysyem_Zepto;

public class Payment {
    PaymentMode paymentMode;

    Payment(PaymentMode paymentMode){
        this.paymentMode = paymentMode;
    }

    public boolean makePayment(){
        return paymentMode.makePayment();
    }

}
