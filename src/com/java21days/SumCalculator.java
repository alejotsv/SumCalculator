package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class SumCalculator extends JFrame implements FocusListener {
    Dimension dim = new Dimension(300, 300);

    SumCalculator(String title){
        super(title);
        setSize(dim);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {

    }

    @Override
    public void focusLost(FocusEvent focusEvent) {

    }
}
