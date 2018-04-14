
import java.util.*;


class Main {
  
  
  public static int[] fact(int n)
  {
    int sol[]=new int[n];
    sol[0]=1;
    
    for(int i=1;i<n;i++)
    {
      sol[i]=i*sol[i-1];
    }
    return sol;
  }
  
  
   public static void main(String[] args) {
     
     
    // System.out.println(Arrays.toString(fact(10)));
     
    // int n[]={4,7,2,8,2,9,1,10};
	 System.out.println("Enter number!");
    
    Scanner sc=new Scanner(System.in);
    short n=sc.nextShort();
    
    int no[]=new int[n];
	
    for(int i=0;i<no.length;i++)
    {
      no[i]=sc.nextInt();
      
    }
     int maxn=minmax.max(no);
	 
     int sol[]=fact(maxn+1);
   //  System.out.println(Arrays.toString(fact(maxn)));
   
		for(int i=0;i<no.length;i++)
		{
			
			System.out.println("Factorial of "+no[i]+" is : "+sol[no[i]]);
		}
     
     
     
     
   }
  
}