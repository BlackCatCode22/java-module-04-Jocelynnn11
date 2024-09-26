package jocelyn.zoo.com;

// jS 09/26/24
// App.java
//Driver file for the zoo midterm program



public class App {
    public static void main(String[] args) {

        System.out.println("\n Welcome to my Zoo Program!\n");


        jocelyn.zoo.com.Animal myanimal = new jocelyn.zoo.com.Animal();
        myanimal.setAnimalName("my first animal");
        System.out.println("\n The name of the new animal is: "+ myanimal.getAnimalName());

        jocelyn.zoo.com.Animal anotherAnimal = new jocelyn.zoo.com.Animal("Zig");
        System.out.println("\n The name of the second animal is: "+ anotherAnimal.getAnimalName());

        System.out.println("\n Number of animals is: " + jocelyn.zoo.com.Animal.numOfAnimals);

        // Create a Hyena with a name.
        jocelyn.zoo.com.Hyena aNewHyena = new jocelyn.zoo.com.Hyena("Kamari");
        System.out.println("\n The new hyena's name is: "+ aNewHyena.getAnimalName());

        System.out.println("\n Number of animals is: " + jocelyn.zoo.com.Animal.numOfAnimals);



    }
    }
