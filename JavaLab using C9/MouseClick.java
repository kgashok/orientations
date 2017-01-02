import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* 
 @Purpose   : This Applet draws a shape on the screen. 
 */
public class MouseClick extends Applet {
  private static final long serialVersionUID = 1L;
  int length = 0, width = 0, count = 0;

  public void init() {
    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent event) {
        count++;
        length = event.getX();
        width = event.getY();
        repaint();
      }
    });
  }

  public void Paint(Graphics g) {
    if (count % 4 == 1)
      g.drawOval(length, width, 150, 150);
    else if (count % 4 == 2)
      g.drawRect(length, width, 150, 150);
    else if (count % 4 == 3)
      g.drawOval(length, width, 100, 150);
    else if (count % 4 == 0)
      g.drawRect(length, width, 100, 150);
  }
}
/*
 * <html> <head> <title>Mouse click</title></head> <body> <applet code =
 * Mouseclick.class width=400 height=400> </applet> </body> </html>
 */
