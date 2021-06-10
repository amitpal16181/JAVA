package P2;

public class ThreeDim extends P1.TwoDim 
{
	private int z;

	public ThreeDim()
	{
		super();
		this.z = 0;
	}

	public ThreeDim(int a, int b, int c)
	{
		super(a,b);
		this.z = c;
	}

	public String toString()
	{
		return "(" + super.toString() + " , " + z + ")";
	}
}