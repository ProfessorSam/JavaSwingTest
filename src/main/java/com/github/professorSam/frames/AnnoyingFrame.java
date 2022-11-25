package com.github.professorSam.frames;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class AnnoyingFrame extends BaseFrame {

    public AnnoyingFrame(){
        super();
        Random random = new Random();
        this.setSize(random.nextInt(200) + 100, random.nextInt(200) + 100);
        this.setTitle("Hey");
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
        int x = (int) random.nextDouble(Toolkit.getDefaultToolkit().getScreenSize().getHeight());
        int y = (int) random.nextDouble(Toolkit.getDefaultToolkit().getScreenSize().getWidth());
        this.setLocationRelativeTo(null);
        this.setLocation(x, y);

        JLabel label = new JLabel();
        label.setText("Jojojo");
        label.setHorizontalTextPosition(JLabel.CENTER);
        this.add(label);
        this.setVisible(true);
    }
}
