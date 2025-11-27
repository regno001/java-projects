package AwtSwing;
import javax.swing.*;

public class SwingUSage {
    public static void main(String[] args) {
        JFrame a = new JFrame("Myframe");
        JLabel b  = new JLabel("this is the Working of the label ");
        JButton c = new JButton("Press Please");
        JRadioButton d = new JRadioButton("Male");
        JRadioButton e = new JRadioButton("Femail");
        JTextField f = new JTextField("there is so much GRass Around here ");

        a.setLayout(new java.awt.FlowLayout());
        a.add(b);
        a.add(c);
        a.add(d);
        a.add(f);
        a.add(e);

        a.setSize(400,500);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
