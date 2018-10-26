package test;

public class Demo2 {

	public static void main(String[] args) 
	{
	 int num=153;
	 int sum=0;
	 int x,y;
	 y=num;
	 while(num>0)
	 {
		 x=num % 10;
		 num=num /10;
		 sum=sum+(x*x*x);
	 }
	  if(y==sum) 
	  {
		  System.out.println("number is armstrong");
		  
	  }
	  else
	  {
		  System.out.println("number is not armstrong");
	  }
	 

	}

}
