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
        Product book = new Product("Book", 23,11,"Study");

        System.out.println(sugar.toString());
        System.out.println(milk.toString());
        System.out.println(book.toString());

    }
}