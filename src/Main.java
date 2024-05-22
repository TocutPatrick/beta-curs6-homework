import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercise 1 & 2 -----------------------------------------------\n");

        Person person1 = new Person("Peter",8,false);
        Person person2 = new Person("John",45,true);
        Person person3 = new Person("Chloe",21,false);

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());

        System.out.println("\nExercise 3 ---------------------------------------------------\n");

        Product sugar = new Product("Sugar", 5,20,"Food");
        Product milk = new Product("Milk", 10,45,"Food");
        Product book = new Product("Book", 23,0,"Study");

        System.out.println(sugar.toString());
        System.out.println(milk.toString());
        System.out.println(book.toString());

        String sugarStock = sugar.hasStock() ? "In stock" : "Not available";
        System.out.println(sugarStock);

        String bookStock = book.hasStock() ? "In Stock" : "Not available";
        System.out.println(bookStock);

        System.out.println(sugar.isCategory());

        System.out.println("\nExercise 4 ---------------------------------------------------\n");


        Bottle myBottle = new Bottle(1500, 789, false);
        System.out.println(myBottle.toString());

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


            int mili = 0;

            if (response.equals("no")) {
                System.out.println("Do you want to close or fill? close/fill");
                response = key.next();


                if (response.equals("close")) {
                    System.out.println("Closing bottle...");
                    myBottle.closeBootle();
                }

                if (response.equals("fill")) {
                    System.out.println("Filling bottle...");
                    myBottle.fillBottle();
                }
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


                if (response.equals("close")) {
                    System.out.println("Closing bottle...");
                    myBottle.closeBootle();
                }

                if (response.equals("fill")) {
                    System.out.println("Filling bottle...");
                    myBottle.fillBottle();
                }

            }
            if (response.equals("no")) {

                System.out.println("Do you want to close or fill? close/fill");
                response = key.next();


                if (response.equals("close")) {
                    System.out.println("Closing bottle...");
                    myBottle.closeBootle();
                }

                if (response.equals("fill")) {
                    System.out.println("Filling bottle...");
                    myBottle.fillBottle();
                }
            }
        }


    }

    //Aici am incercat sa fac o functie dar nu am reusit pentru ca nu puteam folosi myBootle

//    private static void fillOrClose(String response) {
//
//        if (response.equals("close")) {
//            System.out.println("Closing bottle...");
//            myBottle.closeBootle();
//        }
//
//        if (response.equals("fill")) {
//            System.out.println("Filling bottle...");
//            myBottle.fillBottle();
//        }
}
