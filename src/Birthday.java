	import java.util.*; // to use Scanner
public class Birthday {  

	public static void main(String[] args) {
		System.out.print( countFactors(24) );
		// Birthday Fact Here

	}
	public static int countFactors(int baseNumber) { // Replace countFactors with a birthday int 

		int totalFactors = 0;  //cumulative sum
		for (int i = 1; i <= baseNumber; i++) { // baseNumber needs to be switched to another birthday int 

			if (baseNumber % i == 0) {
				totalFactors += 1;	// totalFactors = totalFactors + 1  
			}
			else  {

			}

		}
		return totalFactors; // Possibly reutnr another int 

		
	}
}