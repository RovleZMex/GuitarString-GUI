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
        window.setSize(600,400);
        window.setVisible(true);
        System.out.println("Hello World!");
    }
}
