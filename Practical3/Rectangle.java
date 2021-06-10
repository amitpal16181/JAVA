package P2;

import java.util.Scanner;
import P1.*;

public class Rectangle extends Shape
{
	private double length;
	private double breadth;

	protected	void getData()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length:  ");
		length = scan.nextDouble();
		System.out.print("Enter breadth:  ");
		breadth = scan.nextDouble();
	}

	public double area()
	{
		getData();
		return length * breadth;
	}
}