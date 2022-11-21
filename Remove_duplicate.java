import java.util.*;

class remove_duplicates {

	public void removeDuplicate(char A[], int length) {

		int index = 0;
		for (int i = 0; i < length; i++)
		{

			int j;
			for (j = 0; j < i; j++)
			{
				if (A[i] == A[j]) 
				{
					break;
				}
			}

			if (j == i) {
				A[index++] = A[i];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(A, index)));
	}

	public static void main(String[] args) {
		String a = "Thermometre";

		char A[] = a.toCharArray();

		int len = A.length;
		remove_duplicates  rd= new remove_duplicates ();
		rd.removeDuplicate(A, len);

	}
}


