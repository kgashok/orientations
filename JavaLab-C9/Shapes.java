import java.awt.*;
import java.applet.*;

/*
 @Purpose     : This applet draws several shapes in the window created. 
 */
public class Shapes extends Applet {
  private static final long serialVersionUID = 1L;
  int xPoint[] = { 60, 240, 440, 40 };
  int yPoint[] = { 60, 240, 40, 40 };
  int nPoints = 4;

  public void paint(Graphics g) {
    g.drawPolygon(xPoint, yPoint, nPoints);
    g.drawLine(20, 20, 160, 280);
    g.drawRect(300, 200, 160, 280);
    g.fillRect(200, 200, 80, 40);
    g.fillRoundRect(40, 320, 20, 60, 10, 10);
    g.drawRoundRect(20, 300, 160, 100, 20, 20);
    g.drawOval(550, 400, 100, 40);
  }
}
/*
 * <html> <head> <applet code="shapes",height=400 width=400> </applet> </head>
 * </html>
 */
