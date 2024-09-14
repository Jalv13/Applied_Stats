import java.util.ArrayList;

public class MedianTester{
public static void main(String[] args) {
		Median tester = new Median();
		
		ArrayList<Integer> listOfNumbers = new ArrayList();
		
		for(int i = 0; i < 100; i++) {
		listOfNumbers.add(i);
		}
		
		tester.computeMedian(listOfNumbers);
		System.out.println(tester.computeMedian(listOfNumbers));
	}
}