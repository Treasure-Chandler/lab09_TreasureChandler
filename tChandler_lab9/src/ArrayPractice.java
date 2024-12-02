/*
 * Treasure Chandler
 * CS 16000-01 02/03, Fall Semester 2024
 * Lab 9
 * 
 * 
 */

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
    } // End of ArrayPractice

    // Problem 3:
    public ArrayPractice(int numbersLength, int boxesLength, String[] namesList) {
        /*
         * Instantiates "numbers" and "boxes" to the "numbersLength" and
         * "boxesLength" parameters
         */
        numbers = new int[numbersLength];
        boxes = new Rectangle[boxesLength];
        // Assigns "namesList" to the "listOfNames"
        namesList = this.listOfNames;
    } // End of ArrayPractice

    // Problem 4:
    
} // End of ArrayPractice
