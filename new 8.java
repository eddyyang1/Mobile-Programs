import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import java.util.Calendar;

public class DateTimeAlert extends MIDlet implements CommandListener {
  private Alert alert;
  private Command dismissCommand;

  public DateTimeAlert() {
    // Create the alert
    alert = new Alert("Date and Time");

    // Set the alert type to info
    alert.setType(AlertType.INFO);

    // Set the alert timeout to infinite
    alert.setTimeout(Alert.FOREVER);

    // Create the dismiss command
    dismissCommand = new Command("Dismiss", Command.OK, 0);

    // Add the dismiss command to the alert
    alert.addCommand(dismissCommand);

    // Set the command listener for the alert
    alert.setCommandListener(this);
  }

  public void startApp() {
    // Get the current date and time
    Calendar calendar = Calendar.getInstance();
    String dateTime = calendar.getTime().toString();

    // Set the alert message to the date and time
    alert.setString(dateTime);

    // Display the alert
    Display.getDisplay(this).setCurrent(alert);
  }

  public void pauseApp() {
  }

  public void destroyApp(boolean unconditional) {
  }

  public void commandAction(Command c, Displayable s) {
    if (c == dismissCommand) {
      // Exit the MIDlet
      notifyDestroyed();
    }
  }
}
