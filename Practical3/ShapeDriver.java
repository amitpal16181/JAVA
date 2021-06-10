import java.util.Scanner;
import P1.Shape;
import P2.Rectangle;
import P3.Circle;

class ShapeDriver
{
	public static void main(String args[])
	{
		Shape S;
		Scanner scan = new Scanner(System.in);
		int option;

		do
		{
			System.out.println("\tCHOICE");
			System.out.println("1. Rectangle\n2. Circle\n0. EXIT program");
			System.out.print("Enter your choice:   ");
			option = scan.nextInt();
			switch(option)
			{
				case 1:
					S = new Rectangle();
					System.out.println("Area of Rectangle:  " + S.area());
					break;

				case 2:
					S = new Circle();
					System.out.println("Area of Circle:  " + S.area());
					break;

				case 0:
					return;

				default:
					System.out.println("INVALID CHOICE");
					break;
			}
		}while(option != 0);
		return;
	}
}