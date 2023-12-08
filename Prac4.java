import java.awt.*;
import javax.swing.*;

public class Prac4 extends JFrame{
    Prac4(){

        String data [][] = {
            {"Sheela","Comp","2022"},
            {"Sheela","Comp","2022"},
            {"Sheela","Comp","2022"}
        };
        String column [] = {"Name","Branch","Year"};
        JTable t = new JTable(data,column);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane p = new JScrollPane(t,v,h);
        add(p);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public static void main(String[] args) {
        new Prac4();
    }
}
