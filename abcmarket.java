import java.util.Scanner;

 class ABCMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalAmount = 0;
        boolean shopping = true;
        while (shopping) {
            System.out.println("Welcome to ABC Market");
            System.out.println("Available products are:");
            System.out.println("1. Rice");
            System.out.println("2. Drinks");
            System.out.println("3. Oil");
            System.out.println("4. Colgate");
            System.out.println("5. Cookies");
            System.out.print("Choose the product you want to purchase (1-5): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: 
                    System.out.print("Enter brand of rice: ");
                    scanner.nextLine(); 
                    String riceBrand = scanner.nextLine();
                    System.out.print("Enter type of rice: ");
                    String riceType = scanner.nextLine();
                    System.out.print("Enter the quantity of rice (as percentage of price): ");
                    double riceQuantity = scanner.nextDouble();
                    double ricePrice = 50; 
                    double riceTotal = ricePrice * (riceQuantity / 100);
                    totalAmount += riceTotal;
                    System.out.println("You purchased " + riceQuantity + "% of rice. Total: rupees" + riceTotal);
                    break;
                case 2:
                    System.out.print("Enter brand of drinks: ");
                    scanner.nextLine(); 
                    String drinkBrand = scanner.nextLine();
                    System.out.print("Enter type of drinks: ");
                    String drinkType = scanner.nextLine();
                    System.out.print("Enter the quantity of drinks (as percentage of price): ");
                    double drinkQuantity = scanner.nextDouble();
                    double drinkPrice = 20; 
                    double drinkTotal = drinkPrice * (drinkQuantity / 100);
                    totalAmount += drinkTotal;
                    System.out.println("You purchased " + drinkQuantity + "% of drinks. Total: rupees" + drinkTotal);
                    break;
                case 3:
                    System.out.print("Enter brand of oil: ");
                    scanner.nextLine(); 
                    String oilBrand = scanner.nextLine();
                    System.out.print("Enter type of oil: ");
                    String oilType = scanner.nextLine();
                    System.out.print("Enter the quantity of oil (as percentage of price): ");
                    double oilQuantity = scanner.nextDouble();
                    double oilPrice = 30; 
                    double oilTotal = oilPrice * (oilQuantity / 100);
                    totalAmount += oilTotal;
                    System.out.println("You purchased " + oilQuantity + "% of oil. Total: rupees" + oilTotal);
                    break;
                case 4: 
                    System.out.print("Enter brand of Colgate: ");
                    scanner.nextLine(); 
                    String colgateBrand = scanner.nextLine();
                    System.out.print("Enter type of Colgate: ");
                    String colgateType = scanner.nextLine();
                    System.out.print("Enter the quantity of Colgate (as percentage of price): ");
                    double colgateQuantity = scanner.nextDouble();
                    double colgatePrice = 5; 
                    double colgateTotal = colgatePrice * (colgateQuantity / 100);
                    totalAmount += colgateTotal;
                    System.out.println("You purchased " + colgateQuantity + "% of Colgate. Total: rupees" + colgateTotal);
                    break;
                case 5: 
                    System.out.print("Enter brand of cookies: ");
                    scanner.nextLine(); 
                    String cookiesBrand = scanner.nextLine();
                    System.out.print("Enter type of cookies: ");
                    String cookiesType = scanner.nextLine();
                    System.out.print("Enter the quantity of cookies (as percentage of price): ");
                    double cookiesQuantity = scanner.nextDouble();
                    double cookiesPrice = 10; 
                    double cookiesTotal = cookiesPrice * (cookiesQuantity / 100);
                    totalAmount += cookiesTotal;
                    System.out.println("You purchased " + cookiesQuantity + "% of cookies. Total: rupees" + cookiesTotal);
                    break;
                default:
                    System.out.println("Invalid choice, please select a valid product.");
                    continue;
            }
            System.out.print("Do you want to purchase any other products? (yes/no): ");
            String continueShopping = scanner.next();
            if (continueShopping.equalsIgnoreCase("no")) {
                shopping = false;
            }
          }
        System.out.print("Do you want to apply a discount? (yes/no): ");
        String applyDiscount = scanner.next();
        if (applyDiscount.equalsIgnoreCase("yes")) {
            double discount = 0.10; 
            double discountAmount = totalAmount * discount;
            totalAmount -= discountAmount;
            System.out.println("Discount given: rupees" + discountAmount);
        }
        System.out.println("Your total bill is: rupees" + totalAmount);
        System.out.println("Thank you for visiting ABC Market!");
        scanner.close();
    }
}
