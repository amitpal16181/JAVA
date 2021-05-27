class VarArgs {
	//Showing use of static
	static int a = 25;
	static int b = 45;

	static void displaystatic(int i)
	{
		System.out.println("Value of i:   " + i);
		System.out.println("Value of a:   " + a);
		System.out.println("Value of b:   " + b);
	}

	static{
		System.out.println("Initialize static block");
	}

	//Showingvariable arguments
	public static void display(String ...a)
	{
		System.out.println("Inside display function taking variable arguments");
		for(String s:a)
		{
			System.out.print(s+" ");
		}
		System.out.println();
	}

	public static int sum(int ...x)
	{
		System.out.println("Inside sum function taking variable arguments");
		int summation=0;
		for(int e:x)
		{
			summation+=e;
		}
		return summation;
	}

	public static void main(String[] args)
	{
		displaystatic(78);		//Showing use of static

		//Showing variable arguments passing in a function
		System.out.println();
		display("Hello","world!");
		System.out.println();
		display("Have","a","good","day!");
		System.out.println();
		System.out.println("Sum of the given arguments is: "+sum(45,58));
		System.out.println();
		System.out.println("Sum of the given arguments is: "+sum(54,85,47,25));
		System.out.println();
		System.out.println("Sum of the given arguments is: "+sum(1,2,3,4,5,6,7,8,9,10));
	}
}