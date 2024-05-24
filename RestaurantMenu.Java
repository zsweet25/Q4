public class Main {
    public static void main(String[] args) {
        RestaurantMenu.menu();
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantMenu {

    public static void menu() {
        System.out.println("Welcome to my restaurant!");
        System.out.println("Pick what foods you'd like, when you're done, type 'done'");
        System.out.println("---------------------");
        System.out.println("Chips and salsa: $50");
        System.out.println("Cheeseburger: $12");
        System.out.println("Hotdog: $7");
        System.out.println("Pizza: $15");
        System.out.println("Nachos: $7");
        System.out.println("Wings: $13");
        System.out.println("Steak: $30");
        System.out.println("Quesadilla: $12");
        System.out.println("Burrito: $15");
        System.out.println("Chili: $10");
        System.out.println("---------------------");

        int price = 0;
        ArrayList<String> plate = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("What food would you like: ");
            String order = scanner.nextLine();

            switch (order) {
                case "Chips and salsa":
                    System.out.println("Great choice! CHIPS AND SALSA");
                    System.out.println("---------------------");
                    price += 50;
                    plate.add("Chips and salsa");
                    break;
                case "Cheeseburger":
                    System.out.println("Great choice! CHEESEBURGER");
                    System.out.println("---------------------");
                    price += 12;
                    plate.add("Cheeseburger");
                    break;
                case "Hotdog":
                    System.out.println("Great choice! HOTDOG");
                    System.out.println("---------------------");
                    price += 7;
                    plate.add("Hotdog");
                    break;
                case "Pizza":
                    System.out.println("Great choice! PIZZA");
                    System.out.println("---------------------");
                    price += 15;
                    plate.add("Pizza");
                    break;
                case "Nachos":
                    System.out.println("Great choice! NACHOS");
                    System.out.println("---------------------");
                    price += 7;
                    plate.add("Nachos");
                    break;
                case "Wings":
                    System.out.println("Great choice! WINGS");
                    System.out.println("---------------------");
                    price += 13;
                    plate.add("Wings");
                    break;
                case "Steak":
                    System.out.println("Great choice! STEAK");
                    System.out.println("---------------------");
                    price += 30;
                    plate.add("Steak");
                    break;
                case "Quesadilla":
                    System.out.println("Great choice! QUESADILLA");
                    System.out.println("---------------------");
                    price += 12;
                    plate.add("Quesadilla");
                    break;
                case "Burrito":
                    System.out.println("Great choice! BURRITO");
                    System.out.println("---------------------");
                    price += 15;
                    plate.add("Burrito");
                    break;
                case "Chili":
                    System.out.println("Great choice! CHILI");
                    System.out.println("---------------------");
                    price += 10;
                    plate.add("Chili");
                    break;
                case "done":
                    System.out.println("---------------------");
                    for (String item : plate) {
                        System.out.println("You ordered " + item);
                    }
                    System.out.println("You owe " + price);
                    return;
                default:
                    System.out.println("Not on the menu");
            }
        }
    }
}
