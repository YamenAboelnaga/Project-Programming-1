import javax.swing.*;
public class EcommerceSystem {
    public static void main(String[] args) {
        ElectronicProduct smartPhone = new ElectronicProduct(1,"Smart Phone",599.9,"Samsung",1);
        ClothingProduct T_shirt = new ClothingProduct(2,"T_shirt",19.99,"Medium","Cotton");
        BookProduct oop = new BookProduct(3,"OOP",39.99,"O'Reilly","X Publication");
        Customer c1 = new Customer();
        Cart cart1 =new Cart();
        Order o1 =new Order();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Welcome to the E_Commerce System ! \n  Enter Your ID : "));
        c1.setCustomerId(id);
        cart1.setCustomerId(id);
        String cuustumer_name =JOptionPane.showInputDialog("Enter Your Name : ");
        c1.setName(cuustumer_name);
        String cuustumer_address =JOptionPane.showInputDialog(" Enter Your Address : ");
        c1.setAddress(cuustumer_address);
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("How many products you want to add to your cart ? "));
        cart1.setN(num1);
        Product[] products = new Product[cart1.getN()];
        cart1.setProducts(products);
        for (int i=1 ; i<=cart1.getN(); i++) {
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Which product you want to add ? \n 1- Smart Phone   2- T_shirt   3- OPP"+"\n Enter your choise :"));
            switch (num2) {
                case 1:cart1.addProduct(smartPhone);
                    break;
                case 2:cart1.addProduct(T_shirt);
                    break;
                case 3:cart1.addProduct(oop);
                    break;
            }
        }
        JOptionPane.showMessageDialog(null,"Your Total Price is "+cart1.calculatePrice(cart1.getProducts()));
        int num3 =Integer.parseInt(JOptionPane.showInputDialog("Would you want to place order? \n 1- Yes  2- No"+"\n Enter your choise : "));
        switch (num3){
            case 1: o1.printOrderInfo(cart1);
        }
    }
}