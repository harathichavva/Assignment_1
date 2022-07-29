package assingment_1;

public class Q5 {
	public static void main(String [] args)
	{
		int n=15,i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==0||j==0||i==n-1||(i<=(n-1)/2-j)||(i>=(n-1)/2+j))
					System.out.print("*");
				else
					System.out.print(" ");		
			}
			System.out.println();
		}
	}
}
