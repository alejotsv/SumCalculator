package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class SumCalculator extends JFrame implements FocusListener {
    Dimension dim = new Dimension(300, 300);
    JTextField first, second, result;
    JLabel error;
    int sum;
    String sumString;

    SumCalculator(String title){
        super(title);
        setSize(dim);
        JPanel calc = new JPanel();
        first = new JTextField("0", 6);
        first.addFocusListener(this);
        JLabel plusSign = new JLabel("+");
        second = new JTextField("0", 6);
        second.addFocusListener(this);
        JLabel equalSign = new JLabel("=");
        sumString = "0";
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
        JTextField field = (JTextField) focusEvent.getSource();
        field.setText("");
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        try {
            sum = Integer.parseInt(first.getText()) + Integer.parseInt(second.getText());
            sumString = String.valueOf(sum);
            result.setText(sumString);
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
            first.setText("0");
            second.setText("0");
            result.setText("0");
        }
    }
}
