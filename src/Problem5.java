
public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean notDone = true;
		int answer = 10;
		while(notDone)
		{
			for(int i = 2; i < 21; i++)
				if(answer%i == 0)
					if(i==20)
						System.out.println(answer);
				else
					break;
			answer++;
		}
	}
	//didn't work, infinite loop and I did it by hand.

}
