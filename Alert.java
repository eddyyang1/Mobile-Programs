import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class SumCalculator extends MIDlet implements CommandListener {
  private Form form;
  private TextField input1;
  private TextField input2;
  private Command calculateCommand;
  private StringItem result;

  public SumCalculator() {
    // Create the form
    form = new Form("Sum Calculator");

    // Create the text fields
    input1 = new TextField("Enter first number:", "", 10, TextField.NUMERIC);
    input2 = new TextField("Enter second number:", "", 10, TextField.NUMERIC);

    // Create the calculate command
    calculateCommand = new Command("Calculate", Command.OK, 0);

    // Create the result string item
    result = new StringItem("Result:", "");

    // Add the text fields and result to the form
    form.append(input1);
    form.append(input2);
    form.append(result);

    // Add the calculate command to the form
    form.addCommand(calculateCommand);

    // Set the command listener for the form
    form.setCommandListener(this);
  }

  public void startApp() {
    // Display the form
    Display.getDisplay(this).setCurrent(form);
  }

  public void pauseApp() {
  }

  public void destroyApp(boolean unconditional) {
  }

  public void commandAction(Command c, Displayable s) {
    if (c == calculateCommand) {
      // Get the values of the text fields
      String str1 = input1.getString();
      String str2 = input2.getString();

      // Parse the values as integers
      int num1 = Integer.parseInt(str1);
      int num2 = Integer.parseInt(str2);

      // Calculate the sum
      int sum = num1 + num2;

      // Convert the sum to a string and set it as the result
      result.setText(Integer.toString(sum));
    }
  }
}
