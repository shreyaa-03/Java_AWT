import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Jprogbar extends JFrame{
    JProgressBar b = new JProgressBar(0,100);

    Jprogbar(){
        b.setOrientation(SwingConstants.CENTER);
        b.setStringPainted(true);
        b.setBounds(100,10,300,100);
        add(b);
        setSize(400,400);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void fill(){
       int i = 0;
       try{
        while(i<=100){

            if(i>30 && i<70)
            b.setString("wait for sometime");
            else if(i>70 && i<90)
            b.setString("almost finished");
            else if(i<30)
            b.setString("loading started");
            else
            b.setString("loading complete");

            b.setValue(i + 10);
            Thread.sleep(3000);
            i += 20;
        }

       }
       catch (Exception e){
        System.out.println(e);
       }

    }


public static void main(String args[]) {
Jprogbar p=new Jprogbar();
p.fill();

}
}
