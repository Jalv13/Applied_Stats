import java.util.ArrayList;

public class BubbleSort {

    // Method to perform bubble sort on ArrayList<Integer>
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> numbers) {
        int listSize = numbers.size();
        boolean hasSwapped;
        
        // Traverse through all elements of the list
        for (int currentPass = 0; currentPass < listSize - 1; currentPass++) {
            hasSwapped = false; // Reset the swapped flag for each pass
            
            // Last 'currentPass' elements are already sorted
            for (int currentIndex = 0; currentIndex < listSize - currentPass - 1; currentIndex++) {
                // Compare adjacent elements
                if (numbers.get(currentIndex) > numbers.get(currentIndex + 1)) {
                    // Swap if elements are out of order
                    swapElements(numbers, currentIndex, currentIndex + 1);
                    hasSwapped = true; // Set swapped to true if a swap happens
                }
            }

            // If no swaps were made, the list is already sorted, so we can stop early
            if (!hasSwapped) {
                break;
            }
        }

        // Return the sorted list
        return numbers;
    }

    // Utility method to swap two elements in the ArrayList
    private static void swapElements(ArrayList<Integer> numbers, int firstIndex, int secondIndex) {
        int temp = numbers.get(firstIndex);
        numbers.set(firstIndex, numbers.get(secondIndex));
        numbers.set(secondIndex, temp);
    }
}
