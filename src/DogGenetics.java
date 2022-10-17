import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        // Declare String variable to hold the name of the user's dog, and the breeds
        String dogName;
        String breedName1 = "German Shepherd";
        String breedName2 = "Golden Retriever";
        String breedName3 = "German Poodle";
        String breedName4 = "Siberian Husky";
        String breedName5 = "Beagle";

        // Declare int variables to hold the percentage of each breed and initialize it with the value of 0
        int breedPercent1 = 0;
        int breedPercent2 = 0;
        int breedPercent3 = 0;
        int breedPercent4 = 0;
        int breedPercent5 = 0;
        int breedSum;

        // Declare and initialize the Scanner
        Scanner myDog = new Scanner(System.in);
        // Create random Dog's breed
        Random ranBreed = new Random();
        // Get input from the user
        System.out.println("What is your dog's name?");
        dogName = myDog.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");


        // Use do...while loop to continuously execute the statements contained in its block as long as the given condition is true
        do {
            breedPercent1 = ranBreed.nextInt(100);
            breedPercent2 = ranBreed.nextInt(100);
            breedPercent3 = ranBreed.nextInt(100);
            breedPercent4 = ranBreed.nextInt(100);
            breedPercent5 = ranBreed.nextInt(100);
            breedSum = (breedPercent1 + breedPercent2 + breedPercent3 + breedPercent4 + breedPercent5);
        } while (breedSum != 100);

        System.out.println(dogName + " is: \n");
        System.out.println((breedPercent1 + " % " + breedName1));
        System.out.println((breedPercent2 + " % " + breedName2));
        System.out.println((breedPercent3 + " % " + breedName3));
        System.out.println((breedPercent4 + " % " + breedName4));
        System.out.println((breedPercent5 + " % " + breedName5));
        System.out.println("Total: " + breedSum);

        System.out.println("Wow, that's QUITE the dog!");
    }

}
