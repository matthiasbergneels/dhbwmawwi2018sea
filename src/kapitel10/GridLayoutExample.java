package kapitel10;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {

    private GridLayoutExample(){
        super("GridLayoutExample UI");


        this.setLayout(new GridLayout(0,2));

        JPanel cell1Panel = new JPanel(new FlowLayout());
        JButton cell1 = new JButton("Zelle 1");
        cell1Panel.add(cell1);

        JButton cell2 = new JButton("Zelle 2");
        JButton cell3 = new JButton("Zelle 3");
        JButton cell4 = new JButton("Zelle 4");
        JButton cell5 = new JButton("Zelle 5");
        JButton cell6 = new JButton("Zelle 6");
        JButton cell7 = new JButton("Zelle 7");


        this.add(cell1Panel);
        this.add(cell2);
        this.add(cell3);
        this.add(cell4);
        this.add(cell5);
        this.add(cell6);
        this.add(cell7);




        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }


}
