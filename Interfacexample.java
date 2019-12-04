package Interface;
 import java.util.*;

interface It1
{
	void method1();
	void method2();
	void method3();
}
class Interfacexample implements It1
{
	public void method1()
	{
		System.out.println("method1");
	}
	public void method2()
	{
		System.out.println("method2");
	}
	public void method3()
	{
		System.out.println("method3");
	}
	public static void main(String args[])
	{
	It1 t=new Interfacexample();
		t.method1();
		t.method2();
		t.method3();
	}
}


