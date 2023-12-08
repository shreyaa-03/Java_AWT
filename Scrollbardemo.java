import java.awt.*;
import java.awt.event.*;
public class Scrollbardemo implements AdjustmentListener {
    Frame f;
    Label l;
    Scrollbar sc;
    Scrollbardemo(){
    Frame f = new Frame();
    Label l = new Label();
    Scrollbar sc = new Scrollbar();
    sc.setBounds(100,100,100,100);
    l.setSize(400,100);
    f.setSize(400,400);
    f.setVisible(true);
    f.setLayout(null);
    sc.addAdjustmentListener(this);
    f.add(sc);
    f.add(l);
    }


    public void adjustmentValueChanged(AdjustmentEvent e){
         l.setText("Value: " + sc.getValue());
         

    }
    public static void main(String[] args) {
        new Scrollbardemo();
    }
    
}
