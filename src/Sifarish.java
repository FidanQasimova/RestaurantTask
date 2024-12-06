public class Sifarish {
    private String customerName;
    private Product[] yemekler;
    private double totalPrice;

    public Sifarish(String customerName) {
        this.customerName = customerName;
        this.yemekler = new Product[0];
        this.totalPrice = 0.0;
    }
    public void addMeal(Product product) {
        Product[] newMeal = new Product[yemekler.length + 1];
        System.arraycopy(yemekler, 0, newMeal, 0, yemekler.length);
        newMeal[yemekler.length] = product;
        yemekler = newMeal;
        totalPrice += product.getPrice();
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public String getCustomerName() {
        return customerName;
    }
    public Product[] getDishes() {
        return yemekler;
    }
}




