import java.awt.*;
import javax.swing.*;

public class Prac14 extends JFrame {
    
    Prac14(){
        
       
        String input = JOptionPane.showInputDialog(this,"Enter number to find cube",JOptionPane.INFORMATION_MESSAGE);
        int num = Integer.parseInt(input);
        int area = num * num;
        JOptionPane.showMessageDialog(this,"Cube is: " + area);
      
        
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public static void main(String[] args) {
        new Prac14();
    }
    
}
