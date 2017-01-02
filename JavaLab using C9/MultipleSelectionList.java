import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
 @Purpose     : This Java applet creates multiple selection list box. 
 */
public class MultipleSelectionList extends Applet implements ActionListener {
  private static final long serialVersionUID = 1L;
  List osList;
  TextField osListTextField;
  Button showButton;

  public void init() {
    osListTextField = new TextField(40);
    add(osListTextField);
    osList = new List(3, true);
    osList.add("Windows NT");
    osList.add("Windows Vista");
    osList.add("Windows XP");
    osList.add("LINUX");
    osList.add("UNIX");
    osList.add("Xenix");
    add(osList);
    showButton = new Button("Show Selection");
    showButton.addActionListener(this);
    add(showButton);
  }

  String Selections[];

  public void actionPerformed(ActionEvent e) {
    String outString = new String("YOU SELECTED : ");
    if (e.getSource() == showButton) {
      osListTextField.setText("");
      Selections = osList.getSelectedItems();
      for (int loopIndex = 0; loopIndex < Selections.length; loopIndex++) {
        outString += " " + Selections[loopIndex];
      }
      osListTextField.setText(outString);
    }
  }
}
/*
 * <html> <applet code = MultipleSelectionList.class width=400 height=400>
 * </applet> </html>
 */
