import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
 @Purpose   : This Java Applet tracks the Mouse Events and displays appropriate messages .
 */
public class MouseEventTracking extends Applet 
  implements MouseListener, MouseMotionListener {

  private static final long serialVersionUID = 1L;
  String msg = " ";
  int msgheight, msgwidth, mousex = 0, mousey = 0;

  public void init() {
    addMouseListener(this);
    addMouseMotionListener(this);
  }

  public void mousePressed(MouseEvent me) {
    msgheight = 50;
    msgwidth = 100;
    msg = "Mouse Pressed";
    repaint();
  }

  public void mouseClicked(MouseEvent me) {
    msgheight = 50;
    msgwidth = 100;
    msg = "You CLICKED your Mouse";
    repaint();
  }

  public void mouseExited(MouseEvent me) {
    msgheight = 50;
    msgwidth = 100;
    msg = "Oops! You have EXITED";
    repaint();
  }

  public void mouseReleased(MouseEvent me) {
    msgheight = 50;
    msgwidth = 100;
    msg = "Mouse is RELEASED :)";
    repaint();
  }

  public void mouseEntered(MouseEvent me) {
    msgheight = 50;
    msgwidth = 100;
    msg = "Mouse ENTERING the frame!!!";
    repaint();
  }

  public void mouseDragged(MouseEvent me) {
    msg = "";
    showStatus("DRAGGING at" + me.getX() + "," + me.getY());
    repaint();
  }

  public void mouseMoved(MouseEvent me) {
    showStatus("MOVED at" + me.getX() + "," + me.getY());
    repaint();
  }

  public void paint(Graphics g) {
    g.drawString(msg, msgheight, msgwidth);
  }
}
/*
 * TO RUN THE APPLET 
 * <html> <head> <applet code="MouseEvents", width=400
 * height=400> </applet> </head> </html>
 */