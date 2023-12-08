import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Jtimer extends JFrame implements ActionListener{
int start = 1;
JButton jbtn;
Timer swingtimer;
JFrame f;

Jtimer(int tm){
start =start+tm;
f=new JFrame();
f.setLayout(null);
jbtn = new JButton("Staring Timer...");
jbtn.setBounds(100,100,250,250);
f.add(jbtn);
swingtimer = new Timer(222,this);
swingtimer.start();
f.setSize(700,350);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent evnt)
{
start--;
if(start>=1){
jbtn.setText("Time : "+start); //changing the label of button as the timer
}
else{
jbtn.setText("Timeout... Now,Close the Window");
swingtimer.stop();
}
}public static void main(String[] args) {
Jtimer tw = new Jtimer(10);
}
}