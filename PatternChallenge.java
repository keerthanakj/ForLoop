package MyPkg;

import java.util.Scanner;

public class PatternChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		for(int i=1; i<=n1;i++)
		{
			for(int b=1;b<=n1-i;b++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{	
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=n2;i++)
		{
			for(int b=1;b<=n2-i;b++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{	
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=n3;i++)
		{
			for(int b=1;b<=n3-i;b++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{	
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
