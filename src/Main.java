import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Admin \n" + "2. Customer");
            int a = scanner.nextInt();
            scanner.nextLine();
//            while (true) {
                switch (a) {
                    case 1 -> {
                        System.out.println("enter the password : ");
                        String password = scanner.nextLine();
                        if (password.equals(Account.admin)) {

                            while (true){
                                String adminMenu = "1. Yemek elave etmek \n" +
                                        "2. Yemek silmek \n" +
                                        "3. Menyunu gostermek \n" +
                                        "4. Cixish";
                                System.out.println(adminMenu);
                                System.out.println("reqemi sechin : ");
                                int reqem = scanner.nextInt();
                                if(reqem==4){
                                    break;}
                                switch (reqem) {
                                    case 1 -> {
                                        System.out.print("Yeməyin adı: ");
                                        String name = scanner.nextLine();
                                        scanner.nextLine();
                                        System.out.print("Qiymət: ");
                                        Double price = scanner.nextDouble();
                                        scanner.nextLine();
                                        System.out.print("Kateqoriya: ");
                                        String category = scanner.nextLine();
                                        Menyu.addMeal(name,price,category);
                                    }
                                    case 2 -> {
                                        System.out.print("Silinəcək yeməyin adı: ");
                                        String newname = scanner.nextLine();
                                        Menyu.removeMeal(newname);
                                    }
                                    case 3 -> {
                                        Menyu.printAllMeals();
                                    }
                                }
                                break;
                            }
                        }

                        else {
                            System.out.println("Shifre yanlishdir !");

                        }

                    }
                    // while (true){
                    case 2 -> {
                        System.out.println("1. Sifarish etmek \n" +
                                "2. Yemeyi levg etmek \n" +
                                "3. Menyunu gostermek \n" +
                                "4. Cixish");
                        System.out.println("reqemi sechin : ");
                        int reqem = scanner.nextInt();
                        scanner.nextLine();
                        switch (reqem) {
                            case 1 -> {
                                System.out.print("Müştəri adı: ");
                                String customerName = scanner.nextLine();
                                System.out.println("1. Kateqoriyaya görə axtarış \n" +
                                        "2. Qiymət aralığına görə axtarış \n" +
                                        "3. Ada görə axtarış \n");
                                System.out.print("reqemi daxil edin : ");
                                int reqem2 = scanner.nextInt();
                                scanner.nextLine();
                                switch (reqem2) {
                                    case 1:
                                        System.out.print("Kateqoriya: ");
                                        String searchCategory = scanner.nextLine();
                                        admin.searchCategory(searchCategory);

                                    case 2:
                                        System.out.print("Min qiymət: ");
                                        double minPrice = scanner.nextDouble();
                                        System.out.print("Max qiymət: ");
                                        double maxPrice = scanner.nextDouble();
                                        admin.searchPrice(minPrice, maxPrice);
                                    case 3:
                                        System.out.print("Ad: ");
                                        String searchName = scanner.nextLine();
                                        admin.searchName(searchName);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

