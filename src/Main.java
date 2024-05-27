import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercise 1 & 2 -----------------------------------------------\n");

        Person person1 = new Person("Peter", 8, false);
        Person person2 = new Person("John", 45, true);
        Person person3 = new Person("Chloe", 21, false);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println("\nExercise 3 ---------------------------------------------------\n");

        Product sugar = new Product("Sugar", 5, 20, "Food");
        Product milk = new Product("Milk", 10, 45, "Food");
        Product book = new Product("Book", 23, 0, "Study");

        System.out.println(sugar);
        System.out.println(milk);
        System.out.println(book);

        String sugarStock = sugar.hasStock() ? "In stock" : "Not available";
        System.out.println(sugarStock);

        String bookStock = book.hasStock() ? "In Stock" : "Not available";
        System.out.println(bookStock);

        System.out.println(sugar.isCategory());

        System.out.println("\nExercise 4 ---------------------------------------------------\n");


        Bottle myBottle = new Bottle(1500, 789, false);
        System.out.println(myBottle);

        String liquidTrue = myBottle.moreLiquid() ? "There is something in the bottle!" : "The bottle is emty!";
        System.out.println(liquidTrue);

        System.out.println("Available liquid: " + myBottle.getLiquidAvailable() + " mililitres");

        System.out.println("You have " + myBottle.emptyCapacity() + " mililitres emtpy to fill");

        Scanner key = new Scanner(System.in);
        String response;
        if (!myBottle.getOpen()) {
            System.out.println("Your bootle is closed. Do you want to open the bootle? yes/no");
            response = key.next();
            if (response.equals("yes"))
                myBottle.openBootle();
        } else System.out.println("Your bottle is already opened");

        if (myBottle.getOpen()) {
            System.out.println("Do you want to drink? yes/no");
            response = key.next();
            int mili ;

            if (response.equals("no")) {
                System.out.println("Do you want to close or fill? close/fill");
                response = key.next();
                fillOrClose(response, myBottle);
            }

            if (response.equals("yes")) {
                do {
                    System.out.println("How much do you want to drink? enter quantity in mililitres");
                    mili = key.nextInt();
                    if (mili <= myBottle.getCapacity()) {
                        System.out.println("Drinking...");
                        myBottle.drinkSome(mili);
                        System.out.println("Liquid left: " + myBottle.getLiquidAvailable());
                    } else System.out.println("Not enough liquid.");
                    System.out.println("Do you want to drink more? yes/no");
                    response = key.next();
                } while (response.equals("yes") || myBottle.getLiquidAvailable() <= 0);
            }

            if (myBottle.getLiquidAvailable() <= 0) {
                System.out.println("No more liquid. Do you want to close or fill? close/fill");
                response = key.next();
                fillOrClose(response, myBottle);
            }
            if (response.equals("no")) {
                System.out.println("Do you want to close or fill? close/fill");
                response = key.next();
                fillOrClose(response, myBottle);
            }
        }


    }

    private static void fillOrClose(String response, Bottle myBottle) {
        switch (response) {
            case "close" -> {
                System.out.println("Closing bottle...");
                myBottle.closeBootle();
            }
            case "fill" -> {
                System.out.println("Filling bottle...");
                myBottle.fillBottle();
            }
            default -> System.out.println("Invalid command");

        }
    }
}
