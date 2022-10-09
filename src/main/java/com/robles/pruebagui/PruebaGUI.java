package com.robles.pruebagui;

import javax.swing.JFrame;

/**
 *
 * @author santiagorobles
 */
public class PruebaGUI {
   

    public static void main(String[] args) {
        JFrame window = new MainWindow();
        window.setTitle("GuitarString GUI");
        window.setSize(500,300);
        window.setLocation(600,350);
        window.setVisible(true);
    }
}
