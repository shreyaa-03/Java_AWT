import java.awt.*;

public class Grid{

public static void main(String[] args) throws Exception {

Frame f =new Frame();

GridLayout gl=new GridLayout(4,2,5,5);



Button b3=new Button("3");

Button b4=new Button("4");

Button b5=new Button("5");

Button b6=new Button("6");

Button b7=new Button("7");

Button b8=new Button("8");

Button b9=new Button("9");

f.add(b3);f.add(b4);f.add(b5);

f.add(b6);f.add(b7);f.add(b8);f.add(b9);

f.setLayout(gl);

f.setSize(300,300);

f.setVisible(true);

Thread.sleep(25000);

System.exit(0);

}

}