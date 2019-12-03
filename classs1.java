package coreJava;


 class p
{
 void add (int a,int b)

{
	 int s=a+b+20;
	 System.out.println(s);
	
	}
}
class c extends  p
{
	void add (int a,int b) {

	int s=a+b;
	System.out.println(s);
	}
}
 class d extends c
 {
	 void sub(int a ,int b)
	 {
		 int s=a-b;
		 System.out.println(s);
	 }
 }
public class classs1
{
	public static void main(String args[])
	{
		c obj=new c();
		obj.add(10,20);
	}

	}