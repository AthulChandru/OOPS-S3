import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Test implements ActionListener { 
    JLabel l;
    JTextField t;
    JButton b;

    
    Test() {
        JFrame f = new JFrame("Login");
        l = new JLabel("Enter Name");
        t = new JPasswordField(16);
        b = new JButton("Submit");

        
        JPanel p = new JPanel(new GridLayout(3, 1));
        p.add(l);
        p.add(t);
        p.add(b);

      
        b.addActionListener(this);

        
        f.add(p);
        f.setSize(300, 300);
        f.setVisible(true);
    }

   
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("Submit")) { 
            l.setText(t.getText());
            t.setText(""); 
        }
    }

    public static void main(String[] args) {
        new Test(); 
    }
}
