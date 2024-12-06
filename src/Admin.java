import java.util.List;
//public class Admin {
//    private Product[] menu = new Product[0];
//    private Sifarish[] orders = new Sifarish[0];

//    public void addMeal(String name, double price, String category) {
//        Product newMeal = new Product(name, price, category);
//        Product[] newMenu = new Product[menu.length + 1];
//        newMenu[menu.length] = newMeal;
//        menu = newMenu;
//    }

   // public void removeMeal(String newname) {
//        boolean flag = false;
//        Product[] updatedMenu = new Product[menu.length - 1];
//        int index = 0;
//        for (Product product : menu) {
//            if (product.getName().equalsIgnoreCase(name)) {
//                flag = true;
//                continue;
//            }
//            if (index < menu.length) {
//                menu[index++] = product;
//            }
//        }
//
//        if (flag) {
//            menu = menu;
//            System.out.println("Yemək silindi: " + name);
//        } else {
//            System.out.println("Yemək menyuda yoxdur.");
//        }
//    }
//        boolean flag=false;
//        for (int i=0;i<Stock.productsCount;i++){
//            Product product=Stock.products[i];
//            if (product.name.equals(newname)){
//                Stock.products[i]=null;
//                flag=true;
//            }
//        }
//        if (flag){
//            System.out.println("Yemək uğurla silindi : "+newname);
//        }else {
//            System.out.println("Yemək tapılmadı ! ");
//        }
    //}


//    public void printMenu() {
////        if (menu.length==0) {
////            System.out.println("Menyu boşdur.");
////        } else {
////            for (Product product : menu) {
////                System.out.println(product);
////            }
////        }
//        System.out.println("------------------");
//        for (int i = 0; i < Stock.productsCount; i++) {
//            if (menu.length==0) {
//           System.out.println("Menyu boşdur.");}
//            else {
//            System.out.println(i + "-ci product : " + Stock.products[i].name);}
//        }
//        System.out.println("------------------");
//    }
//    public void addOrder(Sifarish sifarish) {
//        //orders.add;
//    }
//    public void Hesab() {
//        double totalIncome = 0.0;
//        for (Sifarish sifarish : orders) {
//            System.out.println(sifarish);
//            totalIncome += sifarish.getTotalPrice();
//        }
//        System.out.println("Ümumi qiymət: " + totalIncome);
//    }
//    public void searchCategory(String category) {
//        for (Product product : menu) {
//            if (product.getCategory().equalsIgnoreCase(category)) {
//                System.out.println(product);
//            }
//        }
//    }
//    public void searchPrice(double minPrice, double maxPrice) {
//        for (Product product : menu) {
//            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
//                System.out.println(product);
//            }
//        }
//    }
//    public void searchName(String name) {
//        for (Product product : menu) {
//            if (product.getName().equalsIgnoreCase(name)) {
//                System.out.println(product);
//            }
//        }
//    }
//}

