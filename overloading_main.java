class overloading_main{
	static double sum(double a, double b)
	{
		System.out.println("Inside overloaded function sum taking two inputs as double");
		return (a+b);
	}

	static int sum(int a, int b)
	{
		System.out.println("Inside overloaded function sum taking two inputs as int");
		return (a+b);
	}

	static double sum(double a)
	{
		System.out.println("Inside overloaded function sum taking one input as double and increasing by 10");
		return (a+10);
	}

	public static void main(String args[])
	{
		//calling by giving two double arguments.
		System.out.println("calling by giving two double arguments.");
		System.out.println(sum(10.345,12.458));                          //call function sum(double,double)
		System.out.println();

		//calling by giving one double argument and one int argument.
		System.out.println("calling by giving one double argument and one int argument.");
		System.out.println(sum(10.345,12));                          //call function sum(double,int)
		System.out.println();

		//calling by giving two integer arguments.
		System.out.println("calling by giving two integer arguments.");
		System.out.println(sum(100,56));                                  //call function sum(int,int)
		System.out.println();

		//calling by giving one integer argument.
		System.out.println("calling by giving one double argument.");
		System.out.println(sum(56.345));                                          //call function sum(double)
		System.out.println();


		//calling by giving one integer argument.
		System.out.println("calling by giving one integer argument.");
		System.out.println(sum(25));                                          //call function sum(int)
		System.out.println();
	}
}