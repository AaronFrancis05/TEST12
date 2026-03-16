import javax.swing.*;
import java.awt.*;

public class JPanel {
    JFrame BorderFrame;
    JButton JbuttonOne, JbuttonTwo, JbuttonThree, JbuttonFour;
    public JPanel(){
        this.createFrame();
    }

     public JFrame createFrame(){
         JFrame.setDefaultLookAndFeelDecorated(true);
         BorderFrame = new JFrame("BorderLayot Example");
         BorderFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
         BorderFrame.setLayout(new BorderLayout());
         BorderFrame.add(this.CreateJButtonOne(),BorderLayout.NORTH);
         BorderFrame.add(this.CreateJButtonTwo(),BorderLayout.SOUTH);
         BorderFrame.add(this.CreateJButtonThree(),BorderLayout.EAST);
         BorderFrame.add(this.CreateJButtonFour(),BorderLayout.WEST);
         BorderFrame.setVisible(true);
        return BorderFrame;
    }
    public JButton CreateJButtonOne(){
        JbuttonOne = new JButton("Button One");
        return JbuttonOne;
    }
    public JButton CreateJButtonTwo(){
        JbuttonTwo = new JButton("Button Two");
        return JbuttonTwo;
    }
    public JButton CreateJButtonThree(){
        JbuttonThree = new JButton("Button Three");
        return JbuttonThree;
    }
    public JButton CreateJButtonFour(){
        JbuttonFour = new JButton("Button Four");
        return JbuttonFour;
    }
}
