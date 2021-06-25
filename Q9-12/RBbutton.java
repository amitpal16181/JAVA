import java.awt.*;
import java.awt.event.*;

public class RBbutton extends Frame implements ActionListener
{
	Button btnRed, btnBlue;

	RBbutton()
	{
		super("AWT Buttons");
		btnRed = new Button("Red");
		btnRed.setBounds(150,130,250,30);
		btnRed.addActionListener(this);
		this.add(btnRed);

		btnBlue = new Button("Blue");
		btnBlue.setBounds(150,200,250,30);
		btnBlue.addActionListener(this);
		this.add(btnBlue);

		this.setSize(600,400);
		this.setLayout(null);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
	}

	public static void main(String args[])
	{
		new RBbutton();
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnRed)
		{
			this.setBackground(Color.RED);
		}
		else if(e.getSource()==btnBlue)
		{
			this.setBackground(Color.BLUE);
		}
	}
}