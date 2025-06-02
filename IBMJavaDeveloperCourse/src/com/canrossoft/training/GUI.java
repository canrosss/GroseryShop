package com.canrossoft.training;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    public static void main(String[] args) {
        System.out.println("Gui example using Swing");
        Runnable runner = new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Button sample");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JButton button = new JButton("🍕Hello!");
                ActionListener actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Click clack");
                    }
                };

                button.addActionListener(actionListener);
                frame.add(button, BorderLayout.SOUTH);
                frame.setSize(300, 100);
                frame.setVisible(true);


            }
        };
        EventQueue.invokeLater(runner); //Invocación de Runner para ejecutar la clase anonima que construye la ventana y boton.
    }
}