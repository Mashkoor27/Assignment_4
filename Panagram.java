import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Your String:");

		
		String A=sc.nextLine();

		A=A.toLowerCase();
		String s="";
		
		for(char i='a';i<='z';i++)
		{
			if(A.indexOf(i)!=-1)
			{

				s=s+i;
			}
		}
		
		
	
		if(s.length()==26)
		{
			System.out.println("Its a Pangram");
		}
		else
		{
			System.out.println("its not a Pangram");
		}
	


	}

}
