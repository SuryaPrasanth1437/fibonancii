package program;

public class Fibonanci 
{

	public static void main(String[] args) 
	{
		int a=0,b=1,t,i;
		for(i=1;i<=10;i++)
		{
			System.out.println(a);
			t=a+b;
			a=b;
			b=t;
			
		}
	}

}
