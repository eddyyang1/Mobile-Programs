/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hello;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.*;

/**
 * @author hilla
 */
public class MadarakaExpress extends MIDlet {

 private TextBox myTextBox;
 private Display myDisplay;
 public MadarakaExpress()
 {
     myTextBox= new TextBox("BOOK KR MADARAKA", "1.intercounty 8:00Am\n 2.Nairobi - MSA express\n 3.Mombasa - Nrb express\n 4.Suswa train\n Helpline :070938888\n 00: Main Menu\n 000:Exit,1000, TextFie ld.ANY);
     myDisplay= Display.getDisplay(this);
 }
    public void startApp() {
        myDisplay.setCurrent(myTextBox);
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }
}
