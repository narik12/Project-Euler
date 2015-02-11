
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int count = 0;
		while(count < 1000)
		{
				if(count % 3 == 0 || count % 5 == 0)
					sum += count;
				count++;
		}
		System.out.println(sum);
	}

}
