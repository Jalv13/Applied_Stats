import java.util.ArrayList;

public class Union {

    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";


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

    public static void printUnion( ArrayList<Integer> unionList, ArrayList<Integer> list, ArrayList<Integer> list2){
        System.out.print("Union: [");
        for(int i = 0; i < unionList.size(); i++){
            int number = unionList.get(i);
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



    public static void printSortedUnion(ArrayList<Integer> union, ArrayList<Integer> list, ArrayList<Integer> list2){
        System.out.print("Sorted Union: [");
        for(int number: union){
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