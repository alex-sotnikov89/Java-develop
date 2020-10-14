
import javax.swing.*;
import java.awt.*;

public class Calculator {
    private JFrame mainFrame;
    public Calculator() {
        mainFrame = new JFrame();

        mainFrame.setTitle("Calculator");
        mainFrame.setBounds(100, 100, 300, 500);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainFrame.setLayout(new BorderLayout());
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(4, 3));
        JPanel bottomSigns = new JPanel();
        bottomSigns.setLayout(new GridLayout(2, 2));

        mainFrame.add(top, BorderLayout.NORTH);
        mainFrame.add(bottom, BorderLayout.CENTER);
        mainFrame.add(bottomSigns, BorderLayout.AFTER_LINE_ENDS);

        JTextField outField = new JTextField();
        outField.setEditable(false);
        top.add(outField, BorderLayout.CENTER);

        ActionButtonListener abListener = new ActionButtonListener(outField);
        ActionCancelListener aCancelListener = new ActionCancelListener(outField);
        ActionSubmitListener aSubmitListener = new ActionSubmitListener(outField);
        for (int i = 0; i <= 9; i++) {
            JButton digitBtn = new JButton(String.valueOf(i));
            bottom.add(digitBtn);
            digitBtn.addActionListener(abListener);
        }

        JButton plusBtn = new JButton("+");
        plusBtn.addActionListener(abListener);
        bottomSigns.add(plusBtn);

        JButton minusBtn = new JButton("-");
        minusBtn.addActionListener(abListener);
        bottomSigns.add(minusBtn);

        JButton multBtn = new JButton("*");
        multBtn.addActionListener(abListener);
        bottomSigns.add(multBtn);

        JButton divBtn = new JButton("/");
        divBtn.addActionListener(abListener);
        bottomSigns.add(divBtn);

        JButton cancelBtn = new JButton("C");
        cancelBtn.addActionListener(aCancelListener);
        bottom.add(cancelBtn);

        JButton submitBtn = new JButton("Submit");
        submitBtn.addActionListener(aSubmitListener);
        bottom.add(submitBtn);

        mainFrame.setVisible(true);
    }
}
