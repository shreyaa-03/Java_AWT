import java.util.*;
import java.awt.*;
import java.awt.event.*;

class Form{
   public static void main(String args[])throws Exception{
   Frame f = new Frame();
   f.setBackground(Color.PINK);
   Label l;
   TextField tf = new TextField("");
   Label p;
   TextField tf1 = new TextField("");
   Label g;
   CheckboxGroup cbg= new CheckboxGroup();
   Checkbox Cbg = new Checkbox("Male",cbg,true);
   Checkbox cbg1 = new Checkbox("Female",cbg,false);
   Label d;
   Label r;
   Checkbox c = new Checkbox("Mechanical engineering");
   Checkbox c1 = new Checkbox("Computer engineering");
   Checkbox c2 = new Checkbox("Civil engineering");
   Checkbox c3 = new Checkbox("Electrical engineering");
   
   Button b = new Button("SUBMIT");

// name
   l= new Label("name : ");
   l.setBounds(20,100,60,20);
//password
   p= new Label("password : ");
   p.setBounds(20,140,80,20);
//gender
   g=new Label("gender : ");
   g.setBounds(20,180,60,20);
//department
   d= new Label("depart : ");
   d.setBounds(20,220,70,20);
   
//    r= new Label("Reference");
//    r.setBounds(20,240,100,20);
//name
   tf.setBounds(80,100,80,20);
//password
   tf1.setBounds(100,140,80,20);
//gender
   Cbg.setBounds(80,180,80,20);
   cbg1.setBounds(80,200,80,20);
//department
   c.setBounds(100,220,220,20);
   c1.setBounds(100,240,240,20);
   c2.setBounds(100,260,220,20);
   c3.setBounds(100,280,240,20);

   b.setBounds(20,340,100,20);
   
     
   f.add(l);
   f.add(tf);
   f.add(p);
   f.add(tf1);
   f.add(Cbg);
   f.add(cbg1);
   f.add(g);
   f.add(d);
   f.add(c);
   f.add(c1);
   f.add(c2);
   f.add(c3);
   f.add(b);
//    f.add(r);
   f.setTitle("1st exp");
   f.setSize(400,400);
   f.setLayout(null);
   f.setVisible(true);

   
   Thread.sleep(1000000);
   System.exit(0);

   }
}