import javax.swing.*;

public class dialog1 {

JFrame f;
dialog1(){

// f=new JFrame();

// JOptionPane.showMessageDialog(f,"WELCOME");
// JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.ERROR_MESSAGE);
// JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);
// JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.INFORMATION_MESSAGE);
// JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.QUESTION_MESSAGE);
// String name=JOptionPane.showInputDialog(f,"Complete sentence --Better late ----");
f=new JFrame();
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
JOptionPane.showConfirmDialog(f,"Are you sure?");
f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}

public static void main(String[] args) {
dialog1 d=new dialog1();
}

}