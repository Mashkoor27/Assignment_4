public class print_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A= "Aeroplane";
		A=A.toLowerCase();
		
		int count=0;
		
		for(int i=0;i<A.length();i++)
		{
			for(int j=i+1;j<A.length();j++)
			{
				if(A.charAt(i)==A.charAt(j))
				{
					System.out.println(A.charAt(i)+" is repeated");
					count++;
					break;
					
				}
			}
		}
	//	System.out.println(count);

	}

}
