
public class Project3 {

	/**
	 * @param args
	 */
	/*
	 * To find the highest prime number that is a factor of the input, I would find all the factors
	 * Once I have all the factors, I check starting from highest to lowest to find a prime.
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int highestPrime = 0;
		double input = 600851475143.0;
		input = 6857;
		int arrayPlaceHolder = 0;
		int[] factors = new int[7];
		for(int i = 2; i < input; i++)
		{
			if(input % i == 0)
			{
				factors[arrayPlaceHolder] = i;
				arrayPlaceHolder++;
			}
		}
		for(int j = 0; j < 7; j++)
			System.out.println(factors[j] + " ");
	}
	//did factor tree with this program and by hand.

}
