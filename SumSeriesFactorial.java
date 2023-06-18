package MyPkg;

public class SumSeriesFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0,fact=1,n=5;
		for(int i=1;i<=n; i++)
		{
			fact = fact * i;
			sum = sum + ((double)i/fact);
		}
		System.out.println("Sum="+sum);
	}

}
