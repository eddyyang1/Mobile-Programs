/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hello;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Choice;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.List;
import javax.microedition.midlet.*;

/**
 * @author hilla
 */
public class listExample extends MIDlet {
    private List myList;
    private Display myDisplay;
    public listExample()
    {
        myList= new List("Year of Study",Choice.MULTIPLE);
        myList.append("Year1",null);
        myList.append("Year2",null);
        myList.append("Year3",null);
        myList.append("Year4",null);
         myDisplay= Display.getDisplay(this);
         
    }
    public void startApp() {
        myDisplay.setCurrent(myList);
        


    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }
}
