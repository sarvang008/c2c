
import java.util.*;


class Student
	{
	
		String name;
		int roll_no;
		int grade;
		static int count;
		
		Student()
		{
			grade=0;
			count++;
			
		}
	
		public void addgrade()
		{
			grade+=1;
			
		}
		
		
		public void appname()
		{
			
			String a="MR ";
			
			name=a+name;
			System.out.println("Name :"+name);
			
		}
		
		public static void decrease()
		{
			
				count--;
			
		}
		
	
	}




 public	class StudentDemo
 {			
			

		public static void main(String[] args) {
    
			Scanner sc=new Scanner(System.in);
    
		
			Student a=new Student();
			a.name="Parth";
			a.addgrade();
			a.addgrade();
			a.appname();
		System.out.println("Grade :"+a.grade);
			Student b=new Student();
			b.name="Sarvang";
			b.addgrade();
			b.appname();
			System.out.println("Grade: "+b.grade);
		
			Student c=new Student();
			c.appname();
			System.out.println("Grade: "+c.grade);
			
			
		
			System.out.println(Student.count);
	
			Student.decrease();
			
			
			System.out.println(Student.count);
   
   
     
    
		}
  
  
 }