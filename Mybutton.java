import javax.swing.*;
import java.awt.FlowLayout;
public class Mybutton extends JFrame{
    public Mybutton(){
        setSize(300,200);
        setTitle("Button example");

        setLayout(new FlowLayout());
        JButton button = new JButton("버튼");
        add(button);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        Mybutton b = new Mybutton();
    }
}
