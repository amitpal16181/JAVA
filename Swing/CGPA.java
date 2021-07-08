import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CGPA {
    JLabel label;
    JButton btnClose;
    CGPA(String cgpa) {
        JFrame frame = new JFrame("Previous Year CGPA");
        label = new JLabel("Your CGPA was: " + cgpa, SwingConstants.CENTER);
        label.setBounds(20, 20, 250, 30);
        btnClose = new JButton("Close");
        btnClose.setBounds(90, 60, 100, 30);
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        frame.add(label);
        frame.add(btnClose);
        frame.setSize(280, 150);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}