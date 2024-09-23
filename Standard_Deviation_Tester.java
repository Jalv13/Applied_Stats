import java.util.ArrayList;
public class Standard_Deviation_Tester {
    public static void main(String[] args) {
		Standard_Deviation tester = new Standard_Deviation();
		
		ArrayList<Integer> listOfNumbers = new ArrayList();
		 
		for(int i = 0; i < 100; i++) {
		listOfNumbers.add(i);
		}
		
		tester.computeStandardDeviation(listOfNumbers);
		//System.out.println(tester.computeStandardDeviation(listOfNumbers));
	}
}
