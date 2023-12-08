// import java.awt.*;
// import java.awt.event.*;

// import org.w3c.dom.events.MouseEvent;

// public class Mousedemo extends Frame implements MouseListener {
//     Label l = new Label();

//     Mousedemo(){
//         setSize(400,400);
//         setVisible(true);
//         setLayout(null);
//         addMouseListener(this);

//         l.setBounds(100,100,100,100);
//         add(l);
//     }

//     public void mousePressed(MouseEvent e){
//         l.setText("Mouse Pressed " + e.getButton());
//     }
//     public void mouseMoved(MouseEvent e){
//         l.setText("Mouse Moved " + "x: " + e.getClientX() + "y: " + e.getClientY());
//     }
//     public void mouseClicked (MouseEvent e){
//         l.setText("Mouse clicked " + e.getTimeStamp());
//     }
//     public void mouseDragged(MouseEvent e){
//         l.setText("Mouse Dragged" );
//     }
//     public void mouseWheel(MouseEvent e){
//         l.setText("Mouse Wheel");
//     }
    
//     public static void main(String[] args) {
        
//         new Mousedemo()
// ;    }
    
// }
