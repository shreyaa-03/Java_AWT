import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ProgressbarDemo{
JFrame f;
JProgressBar b;

ProgressbarDemo() {
f = new JFrame("ProgressBar demo");

b = new JProgressBar();
b.setValue(0);
b.setStringPainted(true);

f.add(b);
f.setSize(500, 500);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
public void fill() {
int i = 0;
try {
while (i <= 100) {
if (i > 30 && i < 70)
b.setString("wait for sometime");
else if (i > 70)
b.setString("almost finished loading");
else
b.setString("loading started");
// fill the menu bar
b.setValue(i + 10);
Thread.sleep(3000);
i += 20;

}
}
catch (Exception e) { }
}
public static void main(String args[]) {
ProgressbarDemo p=new ProgressbarDemo();
p.fill();
}
}
