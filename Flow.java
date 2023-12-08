import java.awt.*;
public class Flow{
public static void main(String args[])throws Exception{
Frame f=new Frame();
FlowLayout fl=new FlowLayout(FlowLayout.CENTER,10,35); // creating layout manager
Button b1=new Button("1");
Button b2=new Button("2");
Button b3=new Button("3");
Button b4=new Button("4");
Button b5=new Button("5");
f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);
f.setLayout(fl); // assigning layout to frame
f.setSize(300,300);
f.setVisible(true);
Thread.sleep(3000);
System.exit(0);
}
}