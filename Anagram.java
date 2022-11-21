import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "Pawan";
	    String b= "wanpa";
	    
	    String A= a.toUpperCase();
	    String B= b.toUpperCase();
	    
	    char[] c=A.toCharArray();
	    char[] d=B.toCharArray();
	    
	    int count=0;
	    
	    
	    for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[j]<c[i])
				{
					char temp =c[i];
					c[i]=c[j];
					c[j]=temp;
					
				}
			}
		}
		System.out.println(c);
		
//---------------		
		 for(int i=0;i<d.length;i++)
			{
				for(int j=i+1;j<d.length;j++)
				{
					if(d[j]<d[i])
					{
						char temp =d[i];
						d[i]=d[j];
						d[j]=temp;
						
					}
				}
			}
			System.out.println(d);
	    
//---------------------   
			for(int i=0;i<c.length;i++)
			{
			   if(c[i]==d[i])
			   {
				   count++;
			   }
			}
			
			if(count == c.length && count== d.length)
			{
				System.out.println("its an anagaram");
			}
			else
			{
				System.out.println("its not an Anagram");
			}
			
	

	}

}

