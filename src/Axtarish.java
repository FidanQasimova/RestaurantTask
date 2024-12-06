public class Axtarish {
    public static Product searchMealName(String name) {
        for (int i = 0; i < Stock.productsCount; i++) {
            Product product = Stock.products[i];
            if (product.name.equals(name)) {
                return product;
            }
        }
        return null;
    }
    public static Product searchMealCategory(String category) {
        for (int i = 0; i < Stock.productsCount; i++) {
            Product product = Stock.products[i];
            if (product.category.equals(category)) {
                return product;
            }
        }
        return null;
    }
    public static Product searchMealMaxPrice(double price) {
        for (int i = 0; i < Stock.productsCount; i++) {
            Product product = Stock.products[i];
            if (product.price<=price) {
                return product;
            }
        }
        return null;
    }

}

