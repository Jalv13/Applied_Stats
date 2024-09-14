
import java.util.ArrayList;

public class Mean_Tester{
public static void main(String[] args) {
		Mean tester = new Mean();
		
		ArrayList<Integer> listOfNumbers = new ArrayList();
		
		for(int i = 0; i < 100; i++) {
		listOfNumbers.add(i);
		}
		
		tester.computeMean(listOfNumbers);
		System.out.println(tester.computeMean(listOfNumbers));
	}
}