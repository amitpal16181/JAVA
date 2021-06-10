package P3;

import java.util.Scanner;
import P1.*;

public class Circle extends Shape
{
	private double radius;
	protected void getData()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter radius of circle:  ");
		radius = scan.nextDouble();
	}

	public double area()
	{
		getData();
		return 3.14 * radius * radius;
	}
}