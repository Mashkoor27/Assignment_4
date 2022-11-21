import java.util.Scanner;

public class max_occuring_char {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		String A;
		System.out.print("Enter the String");
		A = sc.nextLine();
		char maxChar = ' ';
		int max = -1;
		int[] charFreq = new int[256];
		
		for(int i = 0; i < A.length(); i++)
		{
			charFreq[A.charAt(i)]++;
		}
		for(int i = 0; i < A.length(); i++) 
		{
			char ch = A.charAt(i);
			if(max < charFreq[ch]) {
				max = charFreq[ch];
				maxChar = ch;
			}
		}
		System.out.println(maxChar+ " has appeared max no of times");
		System.out.format("'%c' Character Occurs %d Times ", maxChar, max);	

		
	}
}
