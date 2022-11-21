import java.util.Scanner;

public class vowels_conso_spchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		int conso_count=0;
		int vow_count=0;
		int sp_count=0;
		
		for(int i=0;i<s.length();i++)
		{
			char a=s.charAt(i);
			if(a=='a'|| a=='e' || a=='i' || a=='o' || a=='u'|| a=='A'|| a=='E' || a=='I' || a=='O' || a=='U')
			{
			    vow_count++;
			}
			
			else if(a>='a' && a<='z'|| a>='A' && a<='Z')
			{
				 conso_count++;
			}
			
			else
			{
				sp_count++;
			}
		
		}
		System.out.println("no of consonents present in the string are "+ conso_count);
		System.out.println("no of vowels present in the string are "+ vow_count);
		System.out.println("no ofspecial characters in the string are "+ sp_count);

	}

}

