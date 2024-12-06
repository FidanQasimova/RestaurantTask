public class Menyu {
    public static void addMeal(Product product) {
        int faiz = (Stock.productsCount / Stock.products.length) * 100;
        if (faiz >= 80) {
            Product[] product1 = new Product[Stock.products.length * 2];
            for (int i = 0; i < Stock.productsCount; i++) {
                product1[i] = Stock.products[i];
            }
            Stock.products = product1;
        }
        Stock.products[Stock.productsCount++] = product;
    }

    public static void printAllMeals() {
        for (int i = 0; i < Stock.productsCount; i++) {
            Product product = Stock.products[i];
            System.out.println(product.getName());
        }
    }

    public static void removeMeal(String name) {
        for (int i = 0; i < Stock.productsCount; i++) {
            Product product = Stock.products[i];
            if (product.getName().equals(name)) {
                Stock.products[i] = null;
                Stock.productsCount--;
            }
        }
    }
    private static void foo(Product[] products,int k){
        for (int i=0;i<Stock.productsCount;i++){
            products[k+i]=products[k+i+1];
            products[k+i+1]=null;
        }
    }
}
