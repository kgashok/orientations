import java.awt.*;
import java.awt.event.*;

/*
 @Purpose : This Java Program creates a frame with four text fields 
 name, street, city and pin code with suitable tables. 
 Also add a button called "my details". When the button is 
 clicked its corresponding values are to be appeared in the text fields
 */
public class ButtonClick extends Frame implements ActionListener {
  private static final long serialVersionUID = 1L;
  TextField nameTextField, streetTextField, cityTextField, placeTextField;
  Label nameLabel, streetLabel, cityLabel, placeLabel;
  Button button1;

  ButtonClick() {
    setLayout(new GridLayout(4, 2));
    nameTextField = new TextField(30);
    streetTextField = new TextField(30);
    cityTextField = new TextField(30);
    placeTextField = new TextField(30);
    nameLabel = new Label("name:", Label.LEFT);
    streetLabel = new Label("street:", Label.LEFT);
    cityLabel = new Label("city:", Label.LEFT);
    placeLabel = new Label("place:", Label.LEFT);
    button1 = new Button("my details");
    add(nameLabel);
    add(nameTextField);
    add(streetLabel);
    add(streetTextField);
    add(cityLabel);
    add(cityTextField);
    add(placeLabel);
    add(placeTextField);
    setLayout(new FlowLayout(FlowLayout.CENTER));
    button1.addActionListener(this);
    add(button1);
  }

  public void actionPerformed(ActionEvent actionEventObj) {
    if (actionEventObj.getSource() == button1) {
      nameTextField.setText("Vivek Sabu");
      streetTextField.setText("Nehru Nagar");
      cityTextField.setText("Texas City");
      placeTextField.setText("20");
    }
  }

  public static void main(String arg[]) {
    ButtonClick buttonObj = new ButtonClick();
    buttonObj.setSize(600, 300);
    buttonObj.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    buttonObj.show();
  }
}
