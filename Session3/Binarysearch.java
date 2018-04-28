
import java.util.*;


class Binarysearch

{
	
	
	public static int binsearch(int[] a,int search)
	{
		
		int start=0;
		int end=(a.length-1);
		int mid=(start+end)/2;
		
		while(start!=end)
		{	
			mid =(start+end)/2;
			
			
				if(search<a[mid])
				{
					
					//System.out.println("hell");
					end=mid;
					
				}
				else if(search==a[mid])
				{	
				//	System.out.println("hi");
					return mid;
				}
				else if(search>a[mid])
				{
					
					//System.out.println("bye");
					start=mid;
				}
				
			
			
		}
			if(start==end)
			{
				return -1;
			}
			else
				return mid;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter search number");
	int s=sc.nextInt();
		
		System.out.println("Enter sorted numbers");
		
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int t=binsearch(a,s);
		if(t==-1)
		System.out.println("Not Found");
	
		else
		System.out.println("Found");
		
	}
	
	
	
}
	
	