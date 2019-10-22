package Ternaryop;

public class Ternaryop
{
	int num1=10,num2=100,res;
	
	public void check()
	{
	res=(num1>num2)?num1:num2;
	System.out.println("greater number is:"+res);
	
}
	public static void main(String[]a)
	{
		Ternaryop oo=new Ternaryop();
		oo.check();
	}
	
				
	}