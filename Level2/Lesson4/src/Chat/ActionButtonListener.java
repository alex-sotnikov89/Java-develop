package Chat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

public class ActionButtonListener extends KeyAdapter implements ActionListener {
    private JTextArea chatWindow;
    private JTextField setLine;


    public ActionButtonListener(JTextArea chatWindow, JTextField setLine) {
        this.chatWindow = chatWindow;
        this.setLine = setLine;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (setLine.getText().isEmpty()) {
        }else {
        chatWindow.append(setLine.getText() + "\n");
        setLine.setText("");}
    }


}
