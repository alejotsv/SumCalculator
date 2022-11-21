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
        JPanel calc = new JPanel();
        JTextField first = new JTextField(6);
        JLabel plusSign = new JLabel("+");
        JTextField second = new JTextField(6);
        JLabel equalSign = new JLabel("=");
        JTextField result = new JTextField(8);
        calc.add(first);
        calc.add(plusSign);
        calc.add(second);
        calc.add(equalSign);
        calc.add(result);
        add(calc);
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
