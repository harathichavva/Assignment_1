package assingment_1;

public class Q4 {
	public static void main(String [] args)
	{
		int n=6,i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<n*2;j++) {
				if(j<=i||j>=n*2-i)
					System.out.print("*");
				else
					System.out.print(" ");		
			}
			System.out.println();
		}
	}
} 
