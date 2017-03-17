package com.hamo.java.applet.test;

import java.applet.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/*
<applet code="SimpleApplet" width=300 height=80>
<param name=stringToShow value=" Like in CNN from Param ">
</applet>
*/

public class SimpleApplet extends Applet implements Runnable, MouseListener, MouseMotionListener {

    private String message;
    private String statusBarMessage = "";
    private int mouseX = 0;
    private int mouseY = 0;
    private Thread updateThread;
    private volatile boolean stopThread;

    public void start()
    {
        updateThread = new Thread(this);
        stopThread = false;
        updateThread.start();
    }

    public void run()
    {
        for (; ;)
        {
            try {
                repaint();
                Thread.sleep(200);
                if (stopThread)
                    break;
            }
            catch (InterruptedException ex)
            {}
        }
    }

    public void init()
    {
        setBackground(Color.darkGray);
        message = getParameter("stringToShow");
        if (message == null)
            message = " Like in CNN  ";

        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void stop()
    {
        stopThread = true;
    }

    public void paint(Graphics graphics)
    {
        char ch = message.charAt(0);
        message = message.substring(1, message.length());
        message += ch;

        graphics.setColor(Color.RED);
        graphics.drawString(message, 50, 30);

        showStatus("(" + mouseX + "," + mouseY + ") " + statusBarMessage);

        super.paint(graphics);
    }

    public void mouseClicked(MouseEvent ev)
    {
        mouseX = ev.getX();
        mouseY = ev.getY();

        statusBarMessage = "Mouse Clicked";
        repaint();
    }

    public void mouseEntered(MouseEvent ev)
    {
        mouseX = ev.getX();
        mouseY = ev.getY();

        statusBarMessage = "Mouse Entered";
        repaint();
    }

    public void mouseExited(MouseEvent ev)
    {
        mouseX = ev.getX();
        mouseY = ev.getY();

        statusBarMessage = "Mouse Exited";
        repaint();
    }

    public void mousePressed(MouseEvent ev)
    {
        mouseX = ev.getX();
        mouseY = ev.getY();

        statusBarMessage = "Mouse Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent ev)
    {
        mouseX = ev.getX();
        mouseY = ev.getY();

        statusBarMessage = "Mouse Released";
        repaint();
    }

    public void mouseDragged(MouseEvent ev)
    {
        mouseX = ev.getX();
        mouseY = ev.getY();

        statusBarMessage = "Mouse Dragged";
        repaint();
    }

    public void mouseMoved(MouseEvent ev)
    {
        mouseX = ev.getX();
        mouseY = ev.getY();

        statusBarMessage = "Mouse Moved";
        repaint();
    }
}
