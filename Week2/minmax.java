
import java.util.*;

class minmax {
  
  public static int[]  minmax(int no[])
  {
    
     int max=no[0];
    int min=no[0];
    for(int i=0;i<no.length;i++)
    {
      if(max<no[i])
      {
        max=no[i];
      }
      if(min>no[i])
      {
        min=no[i];
      }
    }
    
  //  System.out.println("max: "+max);
   //  System.out.println("min: "+min);
   
   int arr[]={min,max};
    
    return arr;
  }
  
  
  public static int  max(int no[])
  {
    
     int max=no[0];
    int min=no[0];
    for(int i=0;i<no.length;i++)
    {
      if(max<no[i])
      {
        max=no[i];
      }
      if(min>no[i])
      {
        min=no[i];
      }
    }
    
  //  System.out.println("max: "+max);
   //  System.out.println("min: "+min);
   
  
    
    return max;
  }
  
  public static void main(String[] args) {
    System.out.println("Enter number!");
    
    Scanner sc=new Scanner(System.in);
    short n=sc.nextShort();
    
    int no[]=new int[n];
    for(int i=0;i<no.length;i++)
    {
      no[i]=sc.nextInt();
      
    }
   int sol[]= minmax(no);
   
   
     System.out.println("min: "+sol[0]);
      System.out.println("max: "+sol[1]);
    
  }
  
  
}