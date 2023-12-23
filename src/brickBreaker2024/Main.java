package brickBreaker2024;

import javax.swing.*;


public class Main {

    public static void main(String[] args) {
        JFrame obj = new JFrame();
        GamePlay gameplay = new GamePlay();

        obj.pack();


        obj.setBounds(10, 10, 700, 700);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        obj.add(gameplay);


    }
}
