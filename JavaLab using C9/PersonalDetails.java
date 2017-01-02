import java.awt.*;
import java.awt.event.*;

/*
 @Purpose      : This Program creates a frame with three text fields for name, age, qualification and a text field for multiple line for address
 */
public class PersonalDetails extends Frame {
	private static final long serialVersionUID = 1L;
	TextField nameText, ageText, qualificationText, addressText;
	Label nameLabel, ageLabel, qualificationLabel, addressLabel;
	TextArea textArea;

	PersonalDetails() {
		setLayout(new GridLayout(4, 2));
		nameText = new TextField(30);
		ageText = new TextField(30);
		qualificationText = new TextField(30);
		addressText = new TextField(40);
		textArea = new TextArea(" ", 2, 5);
		nameLabel = new Label("Name", Label.LEFT);
		ageLabel = new Label("Age", Label.LEFT);
		qualificationLabel = new Label("Qualification", Label.LEFT);
		addressLabel = new Label("Address", Label.LEFT);
		add(nameLabel);
		add(nameText);
		add(ageLabel);
		add(ageText);
		add(qualificationLabel);
		add(qualificationText);
		add(addressLabel);
		add(addressText);
	}

	public static void main(String[] args) {
		PersonalDetails personalDetails = new PersonalDetails();
		personalDetails.setSize(300, 250);
		personalDetails.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		personalDetails.show();
	}
}
