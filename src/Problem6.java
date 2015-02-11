
public class Problem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumOfSquares = 0;
		for(int i = 0; i < 101; i++)
			sumOfSquares = i*i + sumOfSquares;
		int sums = 0;
		for(int i = 0; i < 101; i++)
			sums = sums + i;
		int squareOfSums = sums*sums;
		int answer = squareOfSums - sumOfSquares;
		System.out.println(answer);
	}

}
