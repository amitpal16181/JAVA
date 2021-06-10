package P1;

public class TwoDim
{
	private int x;
	private int y;
	TwoDim()
	{
		this.x = 0;
		this.y = 0;
	}

	TwoDim(int a, int b)
	{
		this.x = a;
		this.y = b;
	}

	public String toString()
	{
		return "(" + this.x + " , " + this.y + ")";
	}
}