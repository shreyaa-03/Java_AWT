import java.awt.*;

import java.awt.event.*;

public class Containerdemo extends Frame implements ContainerListener {

Label hl,h2;

Containerdemo() throws Exception{

hl=new Label("first");

hl.setBounds(50,50,50,20);

h2=new Label("second");

h2.setBounds(50,100,100,100);

addContainerListener(this);

add(hl);add(h2);

setSize(400,400);

setVisible(true);

setLayout(null);

Thread.sleep(2000);

remove(h2);

addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e){
       dispose();
    }
  }
  );

}

public void componentAdded(ContainerEvent e) {

System.out.println("added "+e.getSource());

}

public void componentRemoved(ContainerEvent e) {

System.out.println("removed "+e.getSource());

}

public static void main(String[] args)throws Exception{

Containerdemo cv=new Containerdemo();



}

}