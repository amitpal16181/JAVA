import java.awt.*;
import java.awt.event.*;

public class Details extends Frame implements ActionListener
{
	Button btnInfo, btnCGPA;

	Details()
	{
		super("Student Details");
		btnInfo = new Button("A");
		btnInfo.setBounds(25,125,450,100);
		btnInfo.addActionListener(this);
		this.add(btnInfo);

		btnCGPA = new Button("B");
		btnCGPA.setBounds(25,300,450,100);
		btnCGPA.addActionListener(this);
		this.add(btnCGPA);

		this.setSize(500,500);
		this.setLayout(null);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
	}

	public static void main(String args[])
	{
		new Details();
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnInfo)
		{
			new Information("Rahul Mishra", "B.Sc(Hons.) Computer Science", "85089", "ARSD College");
		}
		else if(e.getSource()==btnCGPA)
		{
			new CGPA("8.5");
		}
	}
}