import java.util.ArrayList;

public class Median {
	public double computeMedian(ArrayList<Integer> listOfNumbers) {
		int sum = 0;
		if(listOfNumbers.size() % 2 == 0) {
			sum = sum + listOfNumbers.get(listOfNumbers.size()/2 - 1);
			sum = sum + listOfNumbers.get(listOfNumbers.size()/2 + 1);
		}
		return sum / 2;
	}
}
