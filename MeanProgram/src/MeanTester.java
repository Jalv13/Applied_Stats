import java.util.ArrayList;

public class MeanTester extends MeanProgram {
	public static void main(String[] args) {
		MeanProgram tester = new MeanProgram();
		
		ArrayList<Integer> listOfNumbers = new ArrayList();
		
		for(int i = 0; i < 100; i++) {
		listOfNumbers.add(i);
		}
		
		tester.computeMean(listOfNumbers);
		System.out.println(tester.computeMean(listOfNumbers));
	}
}
