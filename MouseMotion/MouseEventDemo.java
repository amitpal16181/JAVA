import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener
{
	String msg = " ";
	int mouseX = 0, mouseY = 0;

	public MouseEventDemo()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new MyWindowAdapter());
	}

	public void mouseClicked(MouseEvent me)
	{
		msg = msg + "--click received";
		repaint();
	}

	public void mouseEntered(MouseEvent me)
	{
		mouseX = 100;
		mouseY = 100;
		msg = "Mouse Entered";
		repaint();
	}

	public void mouseExited(MouseEvent me)
	{
		mouseX = 100;
		mouseY = 100;
		msg = "Mouse Exited";
		repaint();
	}

	public void mousePressed(MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Button down";
		repaint();
	}

	public void mouseReleased(MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Mouse released";
		repaint();
	}

	public void mouseDragged(MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "* Mouse at (" + me.getX() + " , " + me.getY() + ")";
		repaint();
	}

	public void mouseMoved(MouseEvent me)
	{
		msg = "Moving mouse at (" + me.getX() + " , " + me.getY() + ")";
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(msg, mouseX, mouseY);
	}

	public static void main(String args[])
	{
		MouseEventDemo app = new MouseEventDemo();

		app.setSize(new Dimension(500, 500));
		app.setTitle("My first graphical java program");
		app.setVisible(true);
	}
}

class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}