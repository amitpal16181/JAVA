package P;

import P1.*;
import P2.*;

public class DimDriver
{
	public static void main(String args[])
	{
		TwoDim C1 = new TwoDim();
		ThreeDim C2 = new ThreeDim();
		TwoDim C3 = new TwoDim(5,8);
		ThreeDim C4 = new ThreeDim(4,-6,12);

		TwoDim C;

		C = C1;
		System.out.println(C);

		C = C2;
		System.out.println(C);

		C = C3;
		System.out.println(C);

		C = C4;
		System.out.println(C);

		return;
	}
}