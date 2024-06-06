import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      ArrayList<String> names = new ArrayList<String>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");


        System.out.println("Using for-each loop:");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\nUsing while loop:");
        int i = 0;
        while (i < names.size()) {
            System.out.println(names.get(i));
            i++;
        }

        String[] nameArray = new String[names.size()];
        names.toArray(nameArray);
        System.out.println("\nArray created from ArrayList:");
        for (String name : nameArray) {
            System.out.println(name);
        }

        String sampleString = "Hello, World!";
        System.out.println("\nString methods:");
        System.out.println("Length of the string: " + sampleString.length());
        System.out.println("Uppercase: " + sampleString.toUpperCase());
        System.out.println("Lowercase: " + sampleString.toLowerCase());
        System.out.println("Substring: " + sampleString.substring(7));


}
}
