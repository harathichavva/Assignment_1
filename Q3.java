package assingment_1;

public class Q3 {
	public static void main(String [] args)
	{
		int n=14,i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==0||j==0||i==n-1||j==n-1||(i<=(n-1)/2-j)||(j>=(n-1)/2+i))
					System.out.print("*");
				else
					System.out.print(" ");		
			}
			System.out.println();
		}
	}
}
