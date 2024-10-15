import java.util.ArrayList;

public class ModeTester {

public static void main(String[] args) {

//set mode here
int testNumber = 5;

    Mode tester = new Mode();
		
		ArrayList<Integer> listOfNumbers = new ArrayList();
		
		for(int i = 0; i < 100; i++) {
		listOfNumbers.add(i);
        listOfNumbers.add(testNumber);
		}
		//tester.computeMode(listOfNumbers);
		System.out.println(tester.computeMode(listOfNumbers) + "\n");
	}
}
