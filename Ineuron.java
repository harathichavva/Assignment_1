package assingment_1;

public class Ineuron {
	public static void main(String [] args)
	{
		int n=7,i,j;
		for (i=0;i<n;i++){
			//To print I
			for(j=0;j<n;j++){
				if(i==0||i==n-1||j==(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(j=0;j<1;j++) {
				System.out.print(" ");
			}
			//to print N		
			for(j=0;j<n;j++){
				if(j==0||j==n-1||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(j=0;j<1;j++) {
				System.out.print(" ");
			}
			//To print E		
			for(j=0;j<n;j++){
				if(i==0||i==(n-1)/2||i==n-1||j==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(j=0;j<1;j++) {
				System.out.print(" ");
			}
			//To print U 		
			for(j=0;j<n;j++){
				if((i==n-1&&j!=0&&j!=n-1)||j==0||j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(j=0;j<1;j++) {
				System.out.print(" ");
			}
			//To print R
			for(j=0;j<n;j++)
			{
				if(j==0||(i==0&&j!=0&&j!=n-1)||(i==(n-1)/2&&j<(n-1))||(j==n-1&&i!=0&&i<(n-1)/2)||(i>=(n-1)/2&&j==n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(j=0;j<1;j++) {
				System.out.print(" ");
			}
			//To print o 		
			for(j=0;j<n;j++){
				if((i==0&&j!=0&&j!=n-1)||(j==0&&i!=0&&i!=n-1||(i==n-1&&j!=0&&j!=n-1)||(j==n-1&&i!=0&&i!=n-1)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(j=0;j<1;j++) {
				System.out.print(" ");
			}
			//To print N		
			for(j=0;j<n;j++){
				if(j==0||j==n-1||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	}
