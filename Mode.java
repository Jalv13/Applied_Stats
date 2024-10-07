import java.util.ArrayList;

public class Mode {
    boolean modeFound = false;
    int mode;
    int highest_count;
    int num_count;
    

public int computeMode(ArrayList<Integer> listOfNumbers){
   
   for(int singleNumber: listOfNumbers){
    num_count = 0;
    for(int i = 0; i < listOfNumbers.size(); i++){
        if (listOfNumbers.get(singleNumber) == listOfNumbers.get(i)){
            num_count++;
        }
    }
    if(num_count > highest_count){
        highest_count = num_count;
        mode = singleNumber;
        modeFound = true;
    }else{
        num_count = 0;
        modeFound = false;
    }
   }
   return mode;
}
}
