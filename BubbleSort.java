import java.util.ArrayList;

public class BubbleSort {

    // Method to perform bubble sort on ArrayList<Integer>
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        int n = list.size();
        boolean swapped;
        
        // Traverse through all list elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Reset the swapped flag
            
            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (list.get(j) > list.get(j + 1)) {
                    // Swap if elements are out of order
                    swap(list, j, j + 1);
                    swapped = true; // Set swapped to true if a swap happens
                }
            }

            // If no swaps were made, break out early (list is sorted)
            if (!swapped) {
                break;
            }
        }

        // Return the sorted list
        return list;
    }

    // Utility method to swap two elements in the ArrayList
    private static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
