//William Stearns
//6-1-25
//CSD402
//This program will take user input and determine the energy needed to heat water.

import javax.swing.*;

import static javax.swing.JOptionPane.*;


public class HeatCalculate {
    public static void main(String[] args) {
        String s1, s2, s3;
        s1 = showInputDialog(null, "Enter the amount of water in KG");
        s2 = showInputDialog(null, "Enter the initial temperature in Celsius");
        s3 = showInputDialog(null, "Enter the final temperature in Celsius");
        double water = Double.parseDouble(s1);
        double initialTemp = Double.parseDouble(s2);
        double finalTemp = Double.parseDouble(s3);

        double joules = water * (finalTemp - initialTemp) * 4184;
        showMessageDialog(null, joules);




    }
}