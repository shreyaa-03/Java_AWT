import java.awt.*;

public class Prac1{
    
    public static void main(String[] args) throws Exception{
        Frame f = new Frame("List");
        f.setSize(400,600);
        f.setVisible(true);
        f.setLayout(null);

        List l = new List(1,false);
        l.setBounds(50,100,100,100);

        l.add("English");
        l.add("Hindi");
        l.add("Marathi");
      
        Label l1 = new Label();
        l1.setBounds(50,350,250,100);

        f.add(l);
        f.add(l1);

        Thread.sleep(100);
        String s = l.getSelectedItem();
        l1.setText("Selected Item: " + s);

        Thread.sleep(20000);
        f.dispose();


    }
    
}
