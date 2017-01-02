import java.awt.*;
import java.applet.*;

/*
 @Purpose     : This Applet creates a menu bar and sets menu items on the menu bar.
 */
public class MenuBarApplication extends Applet {
	private static final long serialVersionUID = 1L;

	public void init() {
		/* method initializationOfMenuBar is described. */
		int width = Integer.parseInt(getParameter("width"));
		int height = Integer.parseInt(getParameter("height"));
		Frame frame = new Frame("First Frame"); /*
																						 * Frame constructor with String
																						 * Parameter
																						 */
		frame.resize(width, height);
		MenuBar menuBar = new MenuBar();
		frame.setMenuBar(menuBar);
		Menu menuFile = new Menu("File");/* Menu constructor with String Parameter */
		menuFile.add(new MenuItem("New"));
		menuFile.add(new MenuItem("Open"));
		menuFile.add(new MenuItem("Close")); /* File operation on Menu */
		menuFile.add(new MenuItem("-"));
		menuFile.add(new MenuItem("new"));
		menuBar.add(menuFile);
		Menu menuEdit = new Menu("Edit");/* Menu constructor with String Parameter */
		menuEdit.add(new MenuItem("Cut"));
		menuEdit.add(new MenuItem("Copy")); /* Menu Items to edit */
		menuEdit.add(new MenuItem("paste"));
		menuEdit.add(new MenuItem("-"));
		Menu menu = new Menu("Special");/* Menu constructor with String Parameter */
		menu.add(new MenuItem("First"));
		menu.add(new MenuItem("Second")); /* Add Menu Items */
		menu.add(new MenuItem("Third"));
		menuEdit.add(menu);
		menuEdit.add(new CheckboxMenuItem("Debug"));
		menuEdit.add(new CheckboxMenuItem("Testing"));
		menuBar.add(menuEdit);
		frame.show();
	}
}
/*
 * TO RUN THE APPLET <html> <head> <applet code="Menudemo.class" width=400
 * height=400> </applet> </head> </html>
 */