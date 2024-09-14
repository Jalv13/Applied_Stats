//If your IDE produces any comments or code, delete All of IT (minus class construction)

import java.util.ArrayList;

public class MeanProgram {
	public double computeMean(ArrayList<Integer> listOfNumbers) {
		int sum = 0;
		for(int singleNumber : listOfNumbers) {
			sum = sum + singleNumber;
		}
		return sum/(double) listOfNumbers.size();
	}
}


//mean
//median
//mode
//standardDeviation(someList)
//this and other programming library due in 7 weeks from 9/9/2024