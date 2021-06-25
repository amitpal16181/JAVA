import java.awt.*;
import java.awt.event.*;

class CGPA extends Frame
{
	Label label;
	Button btnClose;

	CGPA(String cgpa)
	{
		super("Previous Year CGPA");
		label = new Label("Your CGPA is: " + cgpa);
		label.setBounds(10,50,280,30);
		label.setAlignment(Label.CENTER);

		btnClose = new Button("Close");
		btnClose.setBounds(20,85,260,30);
		btnClose.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});

		this.add(label);
		this.add(btnClose);
		this.setSize(300,150);
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
}