package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class SumCalculator extends JFrame implements FocusListener {
    Dimension dim = new Dimension(300, 300);
    JTextField first, second, result;

    SumCalculator(String title){
        super(title);
        setSize(dim);
        JPanel calc = new JPanel();
        first = new JTextField("0", 6);
        first.addFocusListener(this);
        JLabel plusSign = new JLabel("+");
        second = new JTextField("0", 6);
        JLabel equalSign = new JLabel("=");
        int sum = Integer.parseInt(first.getText()) + Integer.parseInt(second.getText());
        String sumString = String.valueOf(sum);
        result = new JTextField(sumString, 8);
        result.setEditable(false);
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
        System.out.println("Focus gained");
        System.out.println(focusEvent.getSource());
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        System.out.println("Focus lost");
        System.out.println(focusEvent.getClass());
        System.out.println();
    }
}
