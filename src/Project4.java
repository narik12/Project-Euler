
public class Project4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int biggestPalindrome = 0;
		int num2 = 999;
		while(num2 > 100)
		{
			for(int num1 = 999; num1 > 100; num1--)
			{
				int palindrome = num1 * num2;
				String s = Integer.toString(palindrome);
				if(s.charAt(0)==s.charAt(s.length() - 1))
					if(s.charAt(1)==s.charAt(s.length() - 2))
						if(s.charAt(2)==s.charAt(s.length() - 3))
							if(biggestPalindrome < palindrome)
								biggestPalindrome = palindrome;
			}
			num2--;
		}
		System.out.println(biggestPalindrome);
	}

}
