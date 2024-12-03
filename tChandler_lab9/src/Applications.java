/*
 * Treasure Chandler
 * CS 16000-01 02/03, Fall Semester 2024
 * Lab 9
 * 
 * This class displays the results when it comes to experimenting
 * with different array manipulation methods.
 */

public class Applications {
    /**
     * Helps this project folder (and all of the classes in it) run
     * @param args      Entered values
     */
    public static void main(String[] args){
        // Variables declaration
        // Problem 7-1 -- 7-2:
        ArrayPractice boxArrays = new ArrayPractice();
        String[] list = {"Olivia", "Ethan", "Ava", "Liam",
                            "Sophia", "Mason", "Isabella",
                            "Noah", "Mia", "Lucas"};

        // Populates the arrays
        boxArrays.loadNumbers();
        boxArrays.loadBoxes();

        // Calling the display methods
        boxArrays.displayNumbers();
        boxArrays.displayBoxes();
        boxArrays.displayList();

        // Problem 7-3:
        ArrayPractice secondBoxArrays = new ArrayPractice(50, 6, list);

        // Calling the display methods with the updated methods
        secondBoxArrays.displayNumbers();
        secondBoxArrays.displayBoxes();
        secondBoxArrays.displayList();
    } // End of main()
} // End of Applications

/*
 * Problem 7-1 feedback:
 * The displayNumbers() and displayBoxes() methods provide
 * expected outputs. The displayList() method provides null
 * values because the array for the list of names has not
 * been populated yet.
 * 
 * Problem 7-4 feedback:
 * The displayNumbers() and displayBoxes() methods still provide
 * the expected outputs. The displayList() method no longer provides
 * null values because the array is now populated with names.
 * (Technically, the names are already populated, but now, an
 * ArrayPractice constructor with parameters is called, so now the
 * names can actually be passed to a value)
 */