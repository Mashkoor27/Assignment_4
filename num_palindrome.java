public class num_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=2532352;
		int r,sum = 0;
		int temp=n;
        
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		
		if(sum==temp)
		{
			System.out.println(sum+" is a palindrome");
		}
		else
		{
			System.out.println(sum+" is not a palindrome");
		}
	}

}


