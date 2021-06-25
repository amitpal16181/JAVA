import java.awt.*;
import java.awt.event.*;

public class AWTLabel extends Frame
{
	Label label;

	AWTLabel()
	{
		super("AWT Pink");
		label = new Label("This is a Label");
		label.setBounds(25,50,250,30);
		label.setAlignment(Label.CENTER);
		this.add(label);
		this.setBackground(Color.PINK);
		this.setSize(300,100);
		this.setLayout(null);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e)
		{
			dispose();
		}});
	}

	public static void main(String args[])
	{
		new AWTLabel();
	}
}