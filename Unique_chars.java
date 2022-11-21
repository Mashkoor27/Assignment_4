import java.util.Scanner;

public class unique_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String A=sc.nextLine();
		
		int count=0;
		
		
		for(int i=0;i<A.length();i++)
		{
			for(int j=i+1;j<A.length();j++)
			{
				if(A.charAt(i)==A.charAt(j))
				{
					count++;
					break;
					
				}
			}
		}
		
		System.out.println(count);
		
		if(count>0)
		{
			System.out.println("The String doesn't contain unique characters");
		}
		else
		{
			System.out.println("The String contain unique characters");
		}

	}

}

