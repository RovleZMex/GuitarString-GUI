package com.robles.pruebagui;

import javax.swing.JFrame;

/**
 *
 * @author santiagorobles
 */
public class PruebaGUI {
   

    public static void main(String[] args) {
        JFrame window = new MainWindow();
        window.setTitle("Prueba GUI");
        window.setSize(150,150);
        window.setLocation(600,350);
        window.setVisible(true);
    }
}
