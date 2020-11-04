package Chat;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame{
    private JFrame mainFrame;
    public MainWindow(){
        mainFrame = new JFrame();

        mainFrame.setTitle("Chat");
        mainFrame.setBounds(100, 100, 500, 400);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainFrame.setLayout(new BorderLayout());
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JButton buttonSend = new JButton("Send");
        buttonSend.setLayout(new BorderLayout());

        JTextArea chatWindow = new JTextArea();
        chatWindow.setEditable(false);
        chatWindow.setBackground(new Color(190,190,190));
        JTextField setLine = new JTextField();


        mainFrame.add(top, BorderLayout.CENTER);
        top.add(chatWindow, BorderLayout.CENTER);
        top.add(setLine, BorderLayout.SOUTH);
        mainFrame.add(buttonSend, BorderLayout.SOUTH);

        ActionButtonListener abListener = new ActionButtonListener(chatWindow,setLine);
        buttonSend.addActionListener(abListener);
        setLine.addActionListener(abListener);

        mainFrame.setVisible(true);
    }

}
