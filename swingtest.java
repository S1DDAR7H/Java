import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swingtest implements ActionListener{
    static JFrame f;
    static JTextField t;
    static JRadioButton b1, b2, b3;
    static ButtonGroup b;
    String text;
    public static void main(String args[]){
        swingtest st = new swingtest();
        f = new JFrame("Swingtest");
        t = new JTextField();
        b1 = new JRadioButton();
        b2 = new JRadioButton();
        b3 = new JRadioButton();
        b = new ButtonGroup();
        
        b1.addActionListener(st);
        b2.addActionListener(st);
        b3.addActionListener(st);

        b1.setActionCommand("red");
        b2.setActionCommand("yellow");
        b3.setActionCommand("green");

        b1.setBounds(200, 400, 50, 50);
        b2.setBounds(300, 400, 50, 50);
        b3.setBounds(400, 400, 50, 50);
        t.setBounds(200, 300, 100, 20);

        b.add(b1);
        b.add(b2);
        b.add(b3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(t);

        f.setSize(700,700);
        f.setLayout(null);
        f.setVisible(true);
    } 
    public void actionPerformed(ActionEvent ae){
        String color = b.getSelection().getActionCommand();
        t.setText(color);
    }  
}