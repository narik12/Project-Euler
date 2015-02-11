
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumOfEven = 0;
		int sum = 0;
		int first = 1;
		int second = 2;
		while(sum<4000001)
		{
			sum = first + second;
			first = second;
			second = sum;
			if(first % 2 == 0)
				sumOfEven += first;  //remember to do +=, -=, /=, *=
		}
		System.out.println(sumOfEven);
	}

}
