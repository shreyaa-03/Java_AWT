import java.awt.*;
import java.awt.event.*;

public class Itemdemo2 extends Frame implements ItemListener {
    CheckboxGroup gb = new CheckboxGroup();
    Checkbox c1 = new Checkbox("Html",gb,false);
    Checkbox c2 = new Checkbox("Java",gb,false);
    Checkbox c3 = new Checkbox("C++",gb,false);
    Label l = new Label();

    Itemdemo2(){
        c1.setBounds(50, 50, 80, 80);
        c1.addItemListener(this);
        add(c1);
        c2.setBounds(50, 100, 80, 80);
        c2.addItemListener(this);
        add(c2);
        c3.setBounds(50, 150, 80, 80);
        c3.addItemListener(this);
        add(c3);
        
        l.setBounds(100, 250, 600, 80);
        add(l);

        setSize(800,500);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e ){
                dispose();
            }
        
        }
        );
}
    public void itemStateChanged(ItemEvent e){
        if(e.getItem()=="Html"){
            l.setText("Value: "+ e.getItem() +" "+ (e.getStateChange()==1?"Checked":"Unchecked"));
        }
        else if(e.getItem()=="Java"){
            l.setText("Value: "+ e.getID()+" "+(e.getStateChange()==1?"Checked":"Unchecked"));
        }
        else if(e.getItem()=="C++"){
            l.setText("Value: "+ e.getItemSelectable()+" "+ (e.getStateChange()==1?"Checked":"Unchecked"));
        }
    }
    
        public static void main(String[] args) {
        new Itemdemo2();
    }
    
}
