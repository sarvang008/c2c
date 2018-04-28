import java.util.*;


class TwodArray
	{
	
	
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	
	
		System.out.println("Enter size");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
			
		}
		int sumrow=0;
		int sumcolumn=0;
		int sumdiag=0;
		int j;
		
		for(int i=0;i<a.length;i++)
		{	 sumrow=0;
				sumcolumn=0;
			for(j=0;j<a[i].length;j++)
			{
				sumrow+=a[i][j];
				sumcolumn+=a[j][i];	
				if(i==j)
				{
				sumdiag+=a[i][j];
				}
				
				
				
			}
			sumdiag+=a[i][n-i-1];
			System.out.println("Row Sum "+i+" :"+sumrow);
			System.out.println("Column Sum "+sumcolumn);
				
			
		}
		
		
			System.out.println("Diagonal Sum  "+sumdiag);
	
			
	
	
	
	
	
	
	
	}
	
	}