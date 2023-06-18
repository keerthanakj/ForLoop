//(ii)  +1/2-1/4+1/6-1/8+1/10-1/12+..................-1/20   
//1  - 2 + 3 
package MyPkg;

public class SumSerieaalternative{

	public static void main(String[] args) {
		int n=10;
		float sum=0;
	
		for(int i=1;i<=n;i++) {
			if(i%2==0) //even position
				sum = sum-((float)1/(i*2)); 
		else 
				sum = sum+((float)1/(i*2)); 
		
		}
		System.out.println("sum="+sum);
	}
}