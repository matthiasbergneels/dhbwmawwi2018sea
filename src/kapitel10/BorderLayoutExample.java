package kapitel10;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

    private BorderLayoutExample(){
        super("BorderLayoutExample UI");

        this.setLayout(new BorderLayout());


        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton northWestButton = new JButton("Nord Westen");
        JButton northButton = new JButton("Norden");
        JButton northEastButton = new JButton("Nord Osten");
        northPanel.add(northWestButton);
        northPanel.add(northButton);
        northPanel.add(northEastButton);

        JButton southButton = new JButton("Süden");
        JButton eastButton = new JButton("Osten");
        JButton westButton = new JButton("Westen");

        JPanel centerPanel = new JPanel(new FlowLayout());
        JButton centerButton = new JButton("Mitten");
        centerPanel.add(centerButton);


        this.add(northPanel, BorderLayout.NORTH);
        this.add(southButton, BorderLayout.SOUTH);
        this.add(eastButton, BorderLayout.EAST);
        this.add(westButton, BorderLayout.WEST);
        this.add(centerPanel, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
