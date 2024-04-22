import javax.swing.*;
public class Cart {
    private int customerId ;
    private int nProducts=0 ;
    private int n ;
    private Product[] products =new Product[n];

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
            this.customerId = Math.abs(customerId);
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
            this.nProducts = Math.abs(nProducts);
    }
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int addProduct(Product product){
        if(nProducts< products.length){
            products[nProducts]= product ;
            JOptionPane.showMessageDialog(null,"Product is add to the cart");
            return nProducts++;
        }
        else {
            JOptionPane.showMessageDialog(null,"Can't add the product , because the cart is full ");
            return nProducts ;
        }
    }

    public void removeProduct(Product product){
        for (int i=0 ;i<products.length ; i++){
            if(products[i]==product){
                products[i] = null;
                this.nProducts--;
                break;
            }

        }
    }
    public float calculatePrice(Product[] products){
        float sum =0 ;
        for (int i=0 ; i<nProducts ; i++){
            if ( products != null) {
                sum += products[i].getPrice();
            }
        }
        return sum ;
    }
    public void placeOrder(){
        if (nProducts ==0){
            JOptionPane.showMessageDialog(null,"Can't place order ,because  th cart is empty");
        }
        for (int i=0 ; i<n ; i++) {
            JOptionPane.showMessageDialog(null,"Product ID : "+products[i].getProductId()+"\n"
                    +"Product Name : "+products[i].getName()+"\n"
                    +"Product Price : "+products[i].getPrice()+"\n"
                    +"Total Pricce : "+calculatePrice(products)+"\n\n");
        }

    }
}