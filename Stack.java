class Stack
{
	public static void m1()
	{
		m2();
		System.out.println("hello m1");
	}
	public static void m2()
	{
		m3();
		System.out.println("hello m2");
	}
	public static void m3()
	{
		System.out.println("hello m3");
	}
	public static void main(String[] args)
	{
		m1();
		System.out.println("hello main");
	}
}