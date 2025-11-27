package AwtSwing;
import java.awt.*;
import java.awt.event.ActionListener;

public class AwtUse {
    public static void main(String[] args) {
        Frame f= new Frame("My frame");
        Button b= new Button("Click Here");
        Label l = new Label("This is the text which is visible here");
        Canvas c = new Canvas();
        f.add( b);
        f.add(l);
        f.add(c);
        f.setSize(400,300);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
    }
}
