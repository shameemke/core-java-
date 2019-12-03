package coreJava;

public  class poly {
	public void area(int x)
	{
		System.out.println("area of the square =" + x*x);
	}
	public void area(int x,int y)
	{
		System.out.println("area of the triangle ="+x*y/(0.5));
	}
	public void area(double x) {
	System.out.println("area of the circle = "+(3.14)*x*x);
	}
	public void area(double x,double y) {
		System.out.println("area of the circle = "+x*y);
		}

 public static void main(String[] args)
 {
	 poly obj=new poly();
	 obj.area(4);
	 obj.area(5,40);
	 obj.area(10.5);
	 obj.area(10.1,20.4);
 }
}