public class Birthday {  
	import java.util.*; // to use Scanner

	public static void main(String[] args) {
		System.out.print( countFactors(24) );

	}
	public static int countFactors(int baseNumber) {

		int totalFactors = 0;  //cumulative sum
		for (int i = 1; i <= baseNumber; i++) {

			if (baseNumber % i == 0) {
				totalFactors += 1;	// totalFactors = totalFactors + 1
			}
			else  {

			}

		}
		return totalFactors; 


		
	}
}