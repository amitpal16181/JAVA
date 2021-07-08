import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main implements ActionListener {
    JButton btnInfo, btnCGPA;
    Main() {
        JFrame frame = new JFrame("Student Details");
        btnInfo = new JButton("A");
        btnInfo.setBounds(100, 125, 300, 60);
        btnInfo.addActionListener(this);
        frame.add(btnInfo);
        btnCGPA = new JButton("B");
        btnCGPA.setBounds(100, 250, 300, 60);
        btnCGPA.addActionListener(this);
        frame.add(btnCGPA);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnInfo) {
            new Information(
                "Rajveer Chaurasia", 
                "B.Com (hons.)", 
                "52670", 
                "ABC College"
            );
        } else if (e.getSource() == btnCGPA) {
            new CGPA("8.56");
        }
    }
}