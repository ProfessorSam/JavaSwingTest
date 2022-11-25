package com.github.professorSam.frames;

import javax.swing.*;

public class BaseFrame extends JFrame {

    public BaseFrame(){
        super();
        this.setIconImage(new ImageIcon(ClassLoader.getSystemResource("logo.png")).getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
