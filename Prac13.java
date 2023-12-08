import java.awt.event.*;
import javax.swing.*;

public class Prac13 extends JFrame implements ActionListener {
    int start = 0;
    Timer timer;
    JButton b = new JButton("Start Timmer");

    Prac13(int tm){
        start = start + tm;
        timer = new Timer(1111, this);
        timer.setInitialDelay(1111);
        setSize(400,400);
        setVisible(true);
        setLayout(null);
        b.setBounds(50,50,200,200);
        b.addActionListener(this);
        add(b);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}
    public void actionPerformed(ActionEvent e){
        timer.start();
        start--;
        if(start>=1){
            b.setText("Timer: " + start);
        }
        else{
            b.setText("Timerout..Close Window");
            timer.stop();
        }
    }
    public static void main(String[] args) {
        new Prac13(4);
    }
    
}
