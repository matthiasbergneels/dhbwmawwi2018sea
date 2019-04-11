package kapitel10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFirstUI {
    public static void main(String[] args) {

        JFrame myFrame = new JFrame("Mein erstes Swing UI");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // defines what should happen when we press "x"

        JLabel myText = new JLabel("Juhu, tolles UI!");
        JButton myButton = new JButton("Pause");
        JLabel mySecondText = new JLabel("Noch ein Text");

        myFrame.setLayout(new FlowLayout(FlowLayout.LEFT));

        myFrame.add(myText);            // adds text field to Content Pane
        myFrame.add(myButton);
        myFrame.add(mySecondText);

        //myFrame.setSize(300, 100)
        //myFrame.setBounds(250, 300, 400, 150);

        myFrame.pack();                 // sets size for added content
        myFrame.setVisible(true);       // makes the frame visible

    }
}
