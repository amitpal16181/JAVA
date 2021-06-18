import java.io.*;
import java.util.Scanner;

public class Filehandeltwr
{
	public static void main(String args[]) throws Exception
	{
		if(args.length != 1)
		{
			System.err.println("Usage: java Filehandeltwr <src-file-name>");
		}
		else
		{
			try(FileInputStream fin = new FileInputStream(args[0]))
			{
				Scanner scan = new Scanner(fin);
				while(scan.hasNextLine())
				{
					String line = scan.nextLine();
					String check = line.substring(0,2);
					if(check.equals("//"))
					{
						line = line.substring(2);
						System.out.println(line);
					}
				}
			}
		}
	}
}