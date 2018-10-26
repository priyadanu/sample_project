package test;

public class Demo1 
    {
      public static void main(String[] args)
      
	{  
        int n=10; 
        int a = 0;
        int b = 0;
        int c = 1;
          for(int i = 1; i <= n; i++)
          {
              a = b;
              b = c;
              c = a + b;
              System.out.print(c+" ");
    	 
	

	}
	}
    }


