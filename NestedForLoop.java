/* pattern programs

 * 
 * 1 1 1 1
 * 2 2 2 2
 * 3 3 3 3
 * 4 4 4 4
 * 
 * 1 2 3 4
 * 1 2 3 4
 * 1 2 3 4
 * 1 2 3 4
 * 
 * 4 4 4 4
 * 3 3 3 3
 * 2 2 2 2
 * 1 1 1 1
 * 
 * 4 3 2 1
 * 4 3 2 1
 * 4 3 2 1
 * 4 3 2 1
 * 
 * 1 
 * 2 3 
 * 4 5 6
 *
 *     1
 *   3 2
 * 6 5 4
 * 
 * 
 */






package MyPkg;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	for(int i=1;i<=4;i++)
		{                                                     
			for(int j=1;j<=4;j++)                              
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}  */
		
	/*	for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}  */
		

	/*	for(int i=4;i>=1;i--) //i=1  i=2
		{
			for(int j=4;j>=1;j--) {  //3
				System.out.print(i + " ");
			}
			System.out.println();
			}  */
		
	/*	for(int i=4;i>=1;i--) //i=1  i=2
		{
			for(int j=4;j>=1;j--) {  //3
				System.out.print(j + " ");
			}
			System.out.println();
			}  */
	/*	int k=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}  */
	/*	int r=3,v=1;
		for(int i=1;i<=r;i++)
		{
			for(int b=1;b<=r-i;b++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(v);
				v++;
			}
			System.out.println();
		}*/
	/*	int r=3,v=1;
		for(int i=1;i<=r;i++)
		{
			for(int b=1;b<=r-i;b++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(v+ " ");
				v++;
			}
			System.out.println();
		}   */
		
		int r=4;
		for(int i=1;i<=r;i++)
		{
			for(int b=1;b<=r-i;b++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+(j==i ? "": " "));
				
			}
			System.out.println();
		}
	}

}
