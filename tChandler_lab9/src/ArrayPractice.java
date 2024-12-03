/*
 * Treasure Chandler
 * CS 16000-01 02/03, Fall Semester 2024
 * Lab 9
 * 
 * 
 */

import java.util.*;     // Mainly needed for the Random class

public class ArrayPractice {
    // Problems 1(a-c):
    // Variables declaration
    private int[] numbers;
    private Rectangle[] boxes;
    private String[] listOfNames;
    private final int BASE_LENGTH = 10;

    // Problem 2:
    public ArrayPractice() {
        // Instantiates all of the array fields to 10, the base length
        numbers = new int[BASE_LENGTH];
        boxes = new Rectangle[BASE_LENGTH];
        listOfNames = new String[BASE_LENGTH];
    } // End of constructor ArrayPractice

    // Problem 3:
    public ArrayPractice(int numbersLength, int boxesLength,
                        String[] namesList) {
        /*
         * Instantiates "numbers" and "boxes" to the "numbersLength" and
         * "boxesLength" parameters
         */
        numbers = new int[numbersLength];
        boxes = new Rectangle[boxesLength];
        // Assigns "namesList" to the "listOfNames"
        namesList = this.listOfNames;
    } // End of constructor ArrayPractice

    // Problem 4:
    /**
     * Generates random numbers in the range -100 to 100
     * to populate the "numbers" array
     */
    public void loadNumbers() {
        // Variables declaration
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            // Cue random number generation
            numbers[i] = rand.nextInt(201) - 100;
        }
    } // End of loadNumbers()

    // Problem 5:
    /**
     * Populates the "boxes" array with Rectangle objects
     */
    public void loadBoxes() {
        // Variables declaration
        Random rand = new Random();
        for (int k = 0; k < boxes.length; k++) {
            /*
             * enerates a random double between 0 and 1
             * for the rectangle's length and width
             */
            double length = rand.nextDouble();
            double width = rand.nextDouble();
            boxes[k] = new Rectangle(length, width);
        }
    } // End of loadBoxes()

    // Problem 6:
    /**
     * Prints the array entries from "numbers", with each
     * entry being in a new line
     */
    public void displayNumbers() {
        System.out.println("Number values:");
        for (int number : numbers) {
            System.out.println(number);
        }
    } // End of displayNumbers

    /**
     * Prints the array entries from "boxes", with each
     * entry being in a new line. The "boxes" are printed
     * with the toString() method from the Rectangle class
     */
    public void displayBoxes() {
        System.out.println("Boxes values:");
        for (Rectangle box : boxes) {
            if (box != null) {
                System.out.println(box.toString());
            } else {
                System.out.println("This box does not exist.");
            }
        }
    } // End of displayBoxes

    /**
     * Prints the array entries from "listOfNames", with each
     * entry being in a new line
     */
    public void displayList() {
        System.out.println("List of names:");
        for (String name : listOfNames) {
            if (name != null) {
                System.out.println(name);
            } else {
                System.out.println("This name does not exist.");
            }
        }
    } // End of displayList
} // End of ArrayPractice
