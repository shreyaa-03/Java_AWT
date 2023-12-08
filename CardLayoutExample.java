import java.awt.*;
public class CardLayoutExample {
public static void main(String[] args) throws Exception{
Frame f =new Frame();
Panel cardPanel = new Panel(); //1. created panel
CardLayout cl= new CardLayout(); // 2.created layout manager
cardPanel.setLayout(cl); // 3.layout manager set for panel
Button b1=new Button("First Year");
Button b2=new Button("Second Year");
Button b3=new Button("Third Year");
cardPanel.add(b1,"C1");
cardPanel.add(b2,"C2");
// cardPanel.add(b3,"C3");
f.add(cardPanel);
f.setSize(300,300);
f.setVisible(true);
Thread.sleep(2000);
cl.next(cardPanel);
Thread.sleep(2000);
cl.last(cardPanel);
// Thread.sleep(2000);
// cl.show(cardPanel,"C3");
Thread.sleep(2000);
System.exit(0);
}
}