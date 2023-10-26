/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seo;

import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

/**
 *
 * @author sramp
 */
public class CubeTest extends Frame implements ActionListener, WindowListener, WindowStateListener, MouseListener, MouseMotionListener {

    Graphics g;

    public CubeTest() {
        setVisible(true);
        setSize(1000, 1000);
        AWTEventMonitor.addActionListener(this);
        addWindowListener(this);
        addWindowStateListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        repaint();
    }

    public void paint(Graphics g) {
        System.out.println("PAINT CALLED");
        this.g = g;
    }

    public static void main(String[] args) {
        new CubeTest();
        Cube[][][] cube = new Cube[][][]{
            {
                {new Cube(new Face(3, "R", null, null, "G", "W", null)), //000
                    new Cube(new Face(2, "R", null, null, "G", null, null)), //001
                    new Cube(new Face(3, "R", null, null, "G", null, "P"))}//002
            },
            {
                {new Cube(new Face(2, null, null, null, "G", "W", null))//010
                    ,
                     new Cube(new Face(1, null, null, null, "G", null, null)) //011
                    ,
                     new Cube(new Face(2, null, null, null, "G", null, "P"))//012
                }
            },
            {
                {new Cube(new Face(3, null, "Y", null, "G", "W", null))//020
                    ,
                     new Cube(new Face(2, null, "Y", null, "G", null, null))//021
                    ,
                     new Cube(new Face(3, null, "Y", null, "G", null, "P"))//022
                }
            },
            {
                {new Cube(new Face(2, "R", null, null, null, "W", null)), //100
                    new Cube(new Face(1, "R", null, null, null, null, null)), //101
                    new Cube(new Face(2, "R", null, null, null, null, "P"))}//102
            },
            {
                {new Cube(new Face(1, null, null, null, null, "W", null))//110
                    ,
                     new Cube(new Face(0, null, null, null, null, null, null)) //111
                    ,
                     new Cube(new Face(1, null, null, null, null, null, "P"))//112
                }
            },
            {
                {new Cube(new Face(2, null, "Y", null, null, "W", null))//120
                    ,
                     new Cube(new Face(1, null, "Y", null, null, null, null))//121
                    ,
                     new Cube(new Face(2, null, "Y", null, null, null, "P"))//122
                }
            },
            {
                {new Cube(new Face(3, "R", null, "B", null, "W", null)), //200
                    new Cube(new Face(2, "R", null, "B", null, null, null)), //201
                    new Cube(new Face(3, "R", null, "B", null, null, "P"))}//202
            },
            {
                {new Cube(new Face(2, null, null, "B", null, "W", null))//210
                    ,
                     new Cube(new Face(1, null, null, "B", null, null, null)) //211
                    ,
                     new Cube(new Face(2, null, null, "B", null, null, "P"))//212
                }
            },
            {
                {new Cube(new Face(3, null, "Y", "B", null, "W", null))//220
                    ,
                     new Cube(new Face(2, null, "Y", "B", null, null, null))//221
                    ,
                     new Cube(new Face(3, null, "Y", "B", null, null, "P"))//222
                }
            }
        };
    }

    @Override
    public void windowStateChanged(WindowEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(1);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getX() + " " + e.getY());
        g.drawRect(e.getX(), e.getY(), 100, 100);
        g.draw3DRect(e.getX(), e.getY(), 50, 50, true);
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

}
