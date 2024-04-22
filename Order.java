import javax.swing.*;

public class Order extends Cart{
    private int orderId =1 ;
    private float totalPrice = calculatePrice(getProducts()) ;

    public int Order(){
        return orderId++;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId =Math.abs(orderId);
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice =Math.abs(totalPrice);
    }
    public void printOrderInfo(Cart cart){
        JOptionPane.showMessageDialog(null,"Order ID : "+getOrderId());
        cart.placeOrder();

    }
}