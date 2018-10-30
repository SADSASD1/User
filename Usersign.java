package com.company;
import com.sun.security.auth.module.JndiLoginModule;

import java.awt.*;
import  java.awt.event.*;
import javax.swing.*;

public class Usersign extends JFrame {
    private JTextField fs=new JTextField("",10);
    private JTextField ls=new JTextField("",10);
    private JTextField em=new JTextField("",10);
    private JPasswordField passwordField=new JPasswordField();

    public Usersign(){
        super("User sign in");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container=this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(fs);
        container.add(ls);
        container.add(em);
        container.add(passwordField);
    }
}
