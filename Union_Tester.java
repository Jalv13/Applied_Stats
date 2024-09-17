import java.util.ArrayList;

public class Union_Tester {
    public static void main(String[] args) {
        Union tester = new Union();

        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            listOfNumbers.add(i);
            i++; // Add every second number
        }

        ArrayList<Integer> listOfNumbers2 = new ArrayList<>();
        for (int i = 2; i < 100; i++) {
            listOfNumbers2.add(i);
            i++; // Add every second number
        }

        //union of two lists
        ArrayList<Integer> unionList = tester.union(listOfNumbers, listOfNumbers2);
        System.out.println("Union: " + unionList);

        //bubble sort on the union list and print the sorted result
        ArrayList<Integer> sortedList = BubbleSort.bubbleSort(unionList);
        System.out.println("Sorted Union: " + sortedList);
    }
}
