package filework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField displayField;
    private JButton[] numberButtons;
    private JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton;
    private double firstNumber, secondNumber;
    private char operator;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        displayField = new JTextField();
        displayField.setEditable(false);
        add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            buttonPanel.add(numberButtons[i]);
        }

        addButton = new JButton("+");
        addButton.addActionListener(this);
        buttonPanel.add(addButton);

        subtractButton = new JButton("-");
        subtractButton.addActionListener(this);
        buttonPanel.add(subtractButton);

        multiplyButton = new JButton("*");
        multiplyButton.addActionListener(this);
        buttonPanel.add(multiplyButton);

        divideButton = new JButton("/");
        divideButton.addActionListener(this);
        buttonPanel.add(divideButton);

        equalsButton = new JButton("=");
        equalsButton.addActionListener(this);
        buttonPanel.add(equalsButton);

        clearButton = new JButton("C");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            operator = command.charAt(0);
            firstNumber = Double.parseDouble(displayField.getText());
            displayField.setText("");
        } else if (command.equals("=")) {
            secondNumber = Double.parseDouble(displayField.getText());
            double result = calculateResult(firstNumber, secondNumber, operator);
            displayField.setText(String.valueOf(result));
        } else if (command.equals("C")) {
            displayField.setText("");
        } else {
            String currentText = displayField.getText();
            displayField.setText(currentText + command);
        }
    }

    private double calculateResult(double firstNumber, double secondNumber, char operator) {
        switch (operator) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                if (secondNumber != 0)
                    return firstNumber / secondNumber;
                else {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero");
                    return 0;
                }
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
