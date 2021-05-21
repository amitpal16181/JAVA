import java.lang.Math;
import java.util.Scanner;
class distance{
	int feets;
	int inches;

	distance()
	{
		feets=0;
		inches=0;
	}

	distance(int x , int y)
	{
		feets=x;
		inches=y;
	}

	distance(distance o)
	{
		this.feets = o.feets;
		this.inches = o.inches;
	}

	void calc()	
	{
		if(this.feets < 0 || this.inches < 0)
		{
			this.feets = Math.abs(this.feets);
			this.inches = Math.abs(this.inches);
		}

		if(this.inches >= 12)
		{
			this.feets+=(this.inches/12);
			this.inches=(this.inches%12);
		}
		return;
	}

	void print()
	{
		calc();
		System.out.println("Distance is :  " + this.feets + "\' " + this.inches + "\" ");
	}

	void modify(int a, int b)
	{
		this.feets = a;
		this.inches = b;
	}
}

class distance_main{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the distance: ");
		System.out.print("Enter feets:  ");
		int f = scan.nextInt();
		System.out.print("Enter inches:  ");
		int i = scan.nextInt();

		distance obj1 = new distance(f,i);               //Creating first object.
		obj1.print();

		System.out.println("Second object is creating.........");

		System.out.print("Enter feets:  ");
		f = scan.nextInt();
		System.out.print("Enter inches:  ");
		i = scan.nextInt();
		distance obj2 = new distance(f,i);
		obj2.print();

		//creating another object and assigning second object (obj2) as reference variable.
		distance another_obj = obj2;
		another_obj.print();

		System.out.println("Enter modified values of second distance......");

		System.out.print("Enter feets:  ");
		f = scan.nextInt();
		System.out.print("Enter inches:  ");
		i = scan.nextInt();

		//These lines are showing that if you modify original copy, reference variable also get modified. This means assigning reference will not copy whole object but only reference will be created.
		System.out.println("Modifying second object");
		obj2.modify(f,i);
		System.out.println("Printing second object to see if change happens with reference variable as well.");      
		obj2.print();
		another_obj.print();

		System.out.println("Creating clone of first object");
		distance clone = new distance(obj1);  //This will create clone of first object.
		System.out.println("Printing object 1");
		obj1.print();
		System.out.println("Printing clone of object 1");
		clone.print();


		System.out.println("Enter modified values of first distance......");

		System.out.print("Enter feets:  ");
		f = scan.nextInt();
		System.out.print("Enter inches:  ");
		i = scan.nextInt();

		System.out.println("Modifying object 1");
		obj1.modify(f,i);
		System.out.println("Printing object 1");
		obj1.print();
		System.out.println("Printing clone of object 1");
		clone.print();

	}
}

/* Output
C:\Users\Amit Pal\Desktop\classwork sem-2\JAVA>java distance_main
Enter the distance:
Enter feets:  10
Enter inches:  11
Distance is :  10' 11"
New object is creating.........
Enter feets:  14
Enter inches:  23
Distance is :  15' 11"
Distance is :  15' 11"
Enter modified values of second distance......
Enter feets:  10
Enter inches:  14
Modifying second object
Printing second object to see if change happens with reference variable as well.
Distance is :  11' 2"
Distance is :  11' 2"
Creating clone of first object
Printing object 1
Distance is :  10' 11"
Printing clone of object 1
Distance is :  10' 11"
Enter modified values of first distance......
Enter feets:  12
Enter inches:  11
Modifying object 1
Printing object 1
Distance is :  12' 11"
Printing clone of object 1
Distance is :  10' 11"    */