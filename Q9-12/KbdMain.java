import java.awt.*;
import java.awt.event.*;

class KbdAdapter extends KeyAdapter
{
	Label label;
	KbdAdapter(Label l)
	{
		this.label = l;
	}

	public void keyTyped(KeyEvent e)
	{
		label.setText("Typed character is: " + e.getKeyChar());
	}

	public void keyPressed(KeyEvent e)
	{
		System.out.println("Pressed character is: " + e.getKeyChar());
	}

	public void keyReleased(KeyEvent e)
	{
		System.out.println("Released character is: " + e.getKeyChar());
	}
}

public class KbdMain extends Frame
{
	Label label;
	KbdMain()
	{
		super("AWT keyboard");
		label = new Label("");

		label.setBounds(25,50,250,30);
		label.setAlignment(Label.CENTER);
		this.addKeyListener(new KbdAdapter(label));
		this.add(label);
		this.setSize(300,100);
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
		new KbdMain();
	}
}