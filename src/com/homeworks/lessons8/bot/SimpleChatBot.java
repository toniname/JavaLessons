package com.homeworks.lessons8.bot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleChatBot extends JFrame implements ActionListener {

    final String TITLE_OF_PROGRAM = "Chatter :simple chatBot";
    final int START_LOCATION = 200;
    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;

    JTextArea dialogue;// area for dialog
    JCheckBox ai;      // enable/disable ai
    JTextField message;// field for entering message
    //SimpleBot sBot;


    public static void main(String[] args) {
        new SimpleChatBot();
    }

    SimpleChatBot() {
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(START_LOCATION, START_LOCATION, WINDOW_WIDTH, WINDOW_HEIGHT);
        // обьявление объектов dialog
        dialogue = new JTextArea();
        dialogue.setLineWrap(true);
        JScrollPane scrollBar = new JScrollPane(dialogue);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        ai = new JCheckBox("AI");
        ai.doClick();
        message = new JTextField();
        //message.addActionListener(this);
        JButton enter = new JButton("Enter");
        //добавление графических объектов
        panel.add(ai);
        panel.add(message);
        panel.add(enter);
        add(BorderLayout.CENTER, scrollBar);
        add(BorderLayout.SOUTH, panel);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
