import java.util.ArrayList;

public class Standard_Deviation {

public double computeStandardDeviation (ArrayList<Integer> listOfNumbers) {
    double answer =0;
    
    Mean meanFinder = new Mean();     //Use Mean.java to Find Step 1
    double mean = meanFinder.computeMean(listOfNumbers);
    double sumOfSquares = 0;
    double varience = 0;
    for(int number: listOfNumbers){
        double difference = number - mean;
        sumOfSquares += difference * difference;
    }
    varience = sumOfSquares/(listOfNumbers.size()-1);
    answer = Math.sqrt(varience);
    System.out.println("Varience:" + varience);
    System.out.print("Answer:" + answer);
return 0;
}
}
