import java.awt.*;
public class Borderlayout {
public static void main(String[] args) throws Exception{
Frame f =new Frame();
Button b1=new Button("NORTH");
Button b2=new Button("SOUTH");
Label l3=new Label("EAST");
Label l4=new Label("WEST");
TextField t5=new TextField("CENTER");
f.add(b1,BorderLayout.NORTH);
f.add(b2,BorderLayout.SOUTH);
f.add(l3,BorderLayout.EAST);
f.add(l4,BorderLayout.WEST);
f.add(t5,BorderLayout.CENTER);
f.setSize(300,300);
f.setVisible(true);
Thread.sleep(20000);
System.exit(0);
} }