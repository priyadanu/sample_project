package test;

public class Demo3 
{

	public static void main(String[] args) 
	
	{
		String str="pop";
		String reverse="";
		for(int i=str.length()-1;i>0;i--)
		{
			reverse=reverse+str.charAt(i);
			Object equals;
			if(str==reverse)
			{
				System.out.println("String is palindrome");
			}
			else
			{
				System.out.println("String is not palindrome");
			}
		}
		
		
	  

	}

}
