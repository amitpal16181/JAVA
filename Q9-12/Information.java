import java.awt.*;
import java.awt.event.*;

class Information extends Frame
{
	Button btnClose;

	Panel panelForm;

	Label labelName, labelCourse, labelRollno, labelCollege;
	TextField fieldName, fieldCourse, fieldRollno, fieldCollege;

	Information(String name, String course, String rollno, String college)
	{
		super("Personal Information");

		labelName = new Label("Name: ");
		labelName.setBounds(20,20,80,30);
		labelCourse = new Label("Course: ");
		labelCourse.setBounds(20,50,80,30);
		labelRollno = new Label("Roll No. : ");
		labelRollno.setBounds(20,80,80,30);
		labelCollege = new Label("College: ");
		labelCollege.setBounds(20,110,80,30);

		fieldName = new TextField(name);
		fieldName.setBounds(100,22,200,24);
		fieldName.setEditable(false);
		fieldCourse = new TextField(course);
		fieldCourse.setBounds(100,52,200,24);
		fieldCourse.setEditable(false);
		fieldRollno = new TextField(rollno);
		fieldRollno.setBounds(100,82,200,24);
		fieldCollege = new TextField(college);
		fieldCollege.setBounds(100,112,200,24);
		fieldCollege.setEditable(false);

		btnClose = new Button("Close");
		btnClose.setBounds(100,150,125,30);
		btnClose.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});

		panelForm = new Panel();
		panelForm.setLayout(null);
		panelForm.add(labelName);
		panelForm.add(fieldName);
		panelForm.add(labelCourse);
		panelForm.add(fieldCourse);
		panelForm.add(labelRollno);
		panelForm.add(fieldRollno);
		panelForm.add(labelCollege);
		panelForm.add(fieldCollege);
		panelForm.add(btnClose);
		this.add(panelForm);
		this.setSize(350,250);
		this.setVisible(true);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
	}
}