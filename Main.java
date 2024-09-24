// jS 092424
//
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n welcome to ArrayList Practice!\n");
    // Create an ArrayList of Strings
    ArrayList<String> myListOfStrings =
            new ArrayList<>();
    // Add a few elements to my ArrayList.
        myListOfStrings.add("first");
        myListOfStrings.add("second");
        myListOfStrings.add("third");

        //Output our ArrayList
        System.out.println("\n myListOfStrings is: " + myListOfStrings);

        // Remove and element.
        myListOfStrings.remove(0);

        // Output our ArrayList
        System.out.println("\n After removing...");
        System.out.println("\n myListOfStrings is: " + myListOfStrings);

        // Remove and element.
        myListOfStrings.remove("third");

        // Output our ArrayList
        System.out.println("\n After removing...");
        System.out.println("\n myListOfStrings is: " + myListOfStrings);

        // Use a for loop to add some things to our list
        String toAdd ="";
        for (int i=0; i<10; i++) {
            toAdd = toAdd + "adding.." + Integer.toString(i);
            myListOfStrings.add(toAdd);
        }

        // Output our ArrayList
        System.out.println("\n After adding a bunch of stuff...");
        System.out.println("\n myListOfStrings is: " + myListOfStrings);

        // Use a for loop to output each element for our Arraylist.
        for (int i=0; i<myListOfStrings.size(); i++){
            System.out.println("An element in my lis is :" + myListOfStrings.get(i));
        }

    }
    }
