import java.util.ArrayList;

public class Union {

    public ArrayList<Integer> union(ArrayList<Integer> listOfNumbers, ArrayList<Integer> listOfNumbers2) {
        ArrayList<Integer> union = new ArrayList<>();
        
        // Add all elements from listOfNumbers
        for (int number : listOfNumbers) {
            addIfNotPresent(union, number);
        }
        
        // Add elements from listOfNumbers2 that are not already in union
        for (int number : listOfNumbers2) {
            addIfNotPresent(union, number);
        }
        
        return union;
    }

    private void addIfNotPresent(ArrayList<Integer> list, int number) {
        boolean isPresent = false;
        for (int item : list) {
            if (item == number) {
                isPresent = true;
                break;
            }
        }
        if (!isPresent) {
            list.add(number);
        }
    }
}