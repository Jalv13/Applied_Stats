import java.util.ArrayList;



public class Intersection {

    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public ArrayList<Integer> intersection(ArrayList<Integer> listOfNumbers, ArrayList<Integer> listOfNumbers2) {
        ArrayList<Integer> intersection = new ArrayList<>();
        
        // Add all elements from listOfNumbers
        for (int number : listOfNumbers) {
            addIfPresent(intersection, number);
        }
        
        // Add elements from listOfNumbers2 that are not already in union
        for (int number : listOfNumbers2) {
            addIfPresent(intersection, number);
        }
        
        return intersection;
    }

    private void addIfPresent(ArrayList<Integer> list, int number) {
        boolean isPresent = true;
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
    public static void printIntersection( ArrayList<Integer> intersectionList, ArrayList<Integer> list, ArrayList<Integer> list2){
        System.out.print("Intersection: [");
        for(int i = 0; i < intersectionList.size(); i++){
            int number = intersectionList.get(i);
            if(list.contains(number) && list2.contains(number)){
                System.out.print(ANSI_BLUE + number + ", ");
            }else if(list.contains(number)){
                System.out.print(ANSI_PURPLE + number + ", ");
            }else if(list2.contains(number)){
                System.out.print(ANSI_GREEN + number + ", ");
            }
        }
    System.out.print(ANSI_RESET + "]");
}



    public static void printSortedUnion(ArrayList<Integer> intersection, ArrayList<Integer> list, ArrayList<Integer> list2){
        System.out.print("Sorted Union: [");
        for(int number: intersection){
            if(list.contains(number) && list2.contains(number)){
                System.out.print(ANSI_BLUE + number + ", ");
            }else if(list.contains(number)){
                System.out.print(ANSI_PURPLE + number + ", ");
            }else if(list2.contains(number)){
                System.out.print(ANSI_GREEN + number + ", ");
            }
        }
    System.out.print(ANSI_RESET + "]");
}
}
