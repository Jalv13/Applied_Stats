import java.util.ArrayList;

public class Intersection_Tester {

    //ANSI Colors
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Intersection tester = new Intersection();

        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            listOfNumbers.add(i);
            listOfNumbers.add(2);
            i++; // Array of odd number
        }

        ArrayList<Integer> listOfNumbers2 = new ArrayList<>();
        for (int i = 2; i < 100; i++) {
            listOfNumbers2.add(i);
            i++; // Array of even number
        }

        System.out.println("\nArray 1: " + ANSI_PURPLE + listOfNumbers + ANSI_RESET);

        System.out.println("\nArray 2: " + ANSI_GREEN + listOfNumbers2 + ANSI_RESET + "\n");

        //intersection of two lists
        ArrayList<Integer> intersectionList = tester.intersection(listOfNumbers, listOfNumbers2);
       // System.out.println( "\n Union: " + unionList);
        Union.printUnion(intersectionList, listOfNumbers, listOfNumbers2);


        //bubble sort on the union list and print the sorted result
        ArrayList<Integer> sortedList = BubbleSort.bubbleSort(intersectionList);
        System.out.println( "\n");

        Union.printSortedUnion(sortedList, listOfNumbers, listOfNumbers2);
    }
}
