package view;

import main.Customer;
import main.Gender;
import main.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;

public class RootLayoutController {
    
    private MainApp mainApp;
    
    @FXML private TextField firstNameBox;
    @FXML private TextField middleInitialBox;
    @FXML private TextField lastNameBox;
    @FXML private RadioButton genderMale;
    @FXML private RadioButton genderFemale;
    @FXML private TextField addressBox;
    @FXML private TextField cityBox;
    @FXML private ComboBox<String> stateBox;
    @FXML private TextField zipBox;
    @FXML private Button saveButton;
    @FXML private Button clearButton;
    @FXML private Label zipError;
    
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    
    @FXML
    public void handleSave() {
    	if (zipBox.getText().length() == 9 || zipBox.getText().length() == 5) {
    		try {
    			Integer.parseInt(zipBox.getText());
        	} catch (NumberFormatException e) {
        		zipError.setVisible(true);
        		return;
        	}
    		zipError.setVisible(false);
    		Gender gender = Gender.MALE;
        	if (genderFemale.isSelected())
        		gender = Gender.FEMALE;
        	
        	
        	new Customer(firstNameBox.getText(), middleInitialBox.getText(),
        			lastNameBox.getText(), gender, addressBox.getText(),
        			cityBox.getText(), stateBox.getValue(),
        			Integer.parseInt(zipBox.getText()));
    	} else {
    		zipError.setVisible(true);
    	}
    }
    
    @FXML
    public void handleClear() {
    	firstNameBox.clear();
    	middleInitialBox.clear();
    	lastNameBox.clear();
    	genderMale.fire();
    	addressBox.clear();
    	cityBox.clear();
    	stateBox.setValue("");
    	zipBox.clear();
    }
    
    @FXML
    public void handleTypeFN() {
    	if (firstNameBox.getText().length() > 50) {
    		firstNameBox.setText(firstNameBox.getText().substring(0, 49));
    		firstNameBox.end();
    	}
    }
    @FXML
    public void handleTypeMI() {
    	middleInitialBox.clear();
    }
    @FXML
    public void handleTypeLN() {
    	if (lastNameBox.getText().length() > 50) {
    		lastNameBox.setText(lastNameBox.getText().substring(0, 49));
    		lastNameBox.end();
    	}
    }
    @FXML
    public void handleTypeADDRESS() {
    	if (addressBox.getText().length() > 50) {
    		addressBox.setText(addressBox.getText().substring(0, 49));
    		addressBox.end();
    	}
    }
    @FXML
    public void handleTypeCITY() {
    	if (cityBox.getText().length() > 25) {
    		cityBox.setText(cityBox.getText().substring(0, 24));
    		cityBox.end();
    	}
    }
    
    private void setStates() {
    	stateBox.getItems().addAll(
        		"Alabama","Alaska","Arizona","Arkansas","California",
        		"Colorado","Connecticut","Delaware","Florida","Georgia",
        		"Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas",
        		"Kentucky","Louisiana","Maine","Maryland","Massachusetts",
        		"Michigan","Mississippi","Missouri","Montana","Nebraska",
        		"Nevada","New Hampshire","New Jersey","New Mexico","New York",
        		"North Carolina","North Dakota","Ohio","Oklahoma","Oregon",
        		"Pennsylvania","Rhode Island","South Carolina","South Dakota",
        		"Tennessee","Texas","Utah","Vermont","Virginia","Washington",
        		"West Virginia","Wisconsin","Wyoming"
        	);
    }
    
    @FXML
    void initialize() {
    	setStates();
    }
}