//1/2+1/4+1/6+1/8+1/10+.............+1/20
package MyPkg;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		float sum = 0;
		
		for(int i=1;i<=n;i++) {
			sum = sum+((float)1/(i*2)); 
		}
		System.out.println("Sum="+sum);
	}

}
