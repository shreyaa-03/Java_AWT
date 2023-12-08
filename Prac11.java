import java.awt.*;
// import javax.swing.*;

public class Prac11{
    public static void main(String[] args) throws Exception{
        Frame f = new Frame();
        MenuBar mb = new MenuBar();
       
        Menu file = new Menu("File");
        Menu opt = new Menu("Options");
        Menu help = new Menu("Help");
        Menu subopt = new Menu("SubOptions");
        MenuItem i1 = new MenuItem("Alpha");
        MenuItem i2 = new MenuItem("Gama");
        MenuItem i3 = new MenuItem("Deta");
        subopt.add(i1); subopt.add(i2); subopt.add(i3);
        opt.add(subopt);
        mb.add(file);mb.add(opt);mb.add(help);

        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        Thread.sleep(30000);
        f.dispose();

        

    }
}
