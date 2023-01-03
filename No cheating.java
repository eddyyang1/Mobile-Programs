import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class NoCheatingMIDlet extends MIDlet {

  public void startApp() {
    // Create an Alert object with the warning message and title
    Alert alert = new Alert("NO CHEATING", "CHEATING IN THE EXAM BREEDS CORRUPTION", null, AlertType.WARNING);

    // Set the timeout for the alert to be displayed indefinitely
    alert.setTimeout(Alert.FOREVER);

    // Get the current display and set the alert as the current screen
    Display display = Display.getDisplay(this);
    display.setCurrent(alert);
  }

  // Other required MIDlet methods
  ...
}
