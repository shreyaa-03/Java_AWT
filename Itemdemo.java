import java.awt.*;
import java.awt.event.*;

public class Itemdemo extends Frame implements ItemListener{
    Checkbox c1;
    Checkbox c2;
    Checkbox c3;
    Label l;

    Itemdemo(){
        c1 = new Checkbox("C++");
        c1.setBounds(50, 100, 80, 80);
        c1.addItemListener(this);

        c2 = new Checkbox("Java");
        c2.setBounds(50, 150, 80, 80);
        c2.addItemListener(this);

        c3 = new Checkbox("AJ");
        c3.setBounds(50, 200, 80, 80);
        c3.addItemListener(this);

        l = new Label();
        l.setBounds(100, 400, 80, 80);

        add(c1);
        add(c2);
        add(c3);
        add(l);
        setSize(600,600);
        setVisible(true);
        setLayout(null);
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e ){
                dispose();
            }
        }
        );

    }

    public void itemStateChanged( ItemEvent e){
          /*
            getItem()
            getSource()
            getID() 
                    */     
        
        if(e.getItem()=="C++"){
            l.setText("Value: " + e.getID());
          
        }
        if(e.getItem()=="Java"){
            l.setText("Value:" + ( e.getStateChange()==1?"Checked":"UNchecked"));
        }
        if(e.getItem()=="AJ"){
            l.setText("Value: " + (e.getItemSelectable()));
        }
   
    }
public static void main(String[] args) {
    new Itemdemo();
}
}
