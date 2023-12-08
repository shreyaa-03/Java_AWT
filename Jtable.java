import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jtable extends JFrame {
   
    Jtable(){
        Panel p = new Panel();
        String data[][] = {
            {"sudeep", "50","5000"},
            {"navdeep", "30","5800"},
            {"kuldeep", "47","9000"}};

        String column [] = {"Name", "Age", "Salary"};
        JTable t = new JTable(data,column);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane p1 = new JScrollPane(t,v,h);
        add(p); 
        p.add(p1); 
        add(p); 
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public static void main(String[] args) {
        new Jtable();
    }
}
