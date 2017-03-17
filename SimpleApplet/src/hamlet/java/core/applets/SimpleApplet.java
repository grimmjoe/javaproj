package hamlet.java.core.applets;

import java.applet.Applet;
import java.awt.*;
import java.io.IOException;

/**
 <applet code="SimpleApplet" width=200 height=60>
 </applet>
 */
public class SimpleApplet extends Applet {
    public void paint (Graphics g)
    {
        g.drawString("A simple applet", 20, 20);
        Runtime rt = Runtime.getRuntime();
        g.drawString(Long.toString(rt.freeMemory()), 20, 40);
        g.drawString(Long.toString(rt.totalMemory()), 20, 60);
        g.drawString(System.getProperty("user.dir"), 20, 80);
        try {
            rt.exec("notepad.exe");
        } catch (IOException ex)
        {

        }
    }
}
