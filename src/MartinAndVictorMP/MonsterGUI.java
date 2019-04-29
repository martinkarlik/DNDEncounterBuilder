package src.MartinAndVictorMP;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class MonsterGUI extends JFrame {

    private Font font = new Font("Arial", Font.BOLD, 26);
    private Font fontMedium = new Font("Arial", Font.ITALIC, 20);
    private Font fontSmall = new Font("Arial", Font.PLAIN, 16);

    public MonsterGUI(String name, String description, String[] generalInfo, String[] attributes, ArrayList<String> savingThrows, ArrayList<String> otherInfo, ArrayList<String> monsterActions) throws IOException {

        // all the JLabels
        JLabel nameL, descriptionL, generalInfoL, attributesL, savingThrowsL, otherInfoL, actionsL;

        JFrame frame = new JFrame("Monster encounter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanelWithBackground panel = new JPanelWithBackground(new ImageIcon("src/Images/Image.png").getImage());

        frame.getContentPane().add(panel);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        setContentPane(new JLabel(new ImageIcon("src/Images/Image.png")));

        panel.add(nameL = new JLabel(name));
        nameL.setFont(font);
        nameL.setForeground(Color.RED);
        panel.add(descriptionL = new JLabel(description));
        descriptionL.setFont(fontSmall);

        // Adding the red arrow to split the UI
        panel.add(new JLabel(new ImageIcon("src/Images/Split.png")));


        for (int i = 0; i < generalInfo.length; i++) {
            panel.add(generalInfoL = new JLabel(generalInfo[i])).setForeground(Color.RED);
            generalInfoL.setFont(fontSmall);
        }

        panel.add(new JLabel(new ImageIcon("src/Images/Split.png")));

        for (int i = 0; i < attributes.length; i++) {
            panel.add(attributesL = new JLabel(attributes[i]));
            attributesL.setFont(fontSmall);
            attributesL.setForeground(Color.RED);
        }

        panel.add(new JLabel(new ImageIcon("src/Images/Split.png")));

        for (String e: savingThrows) {
                panel.add(savingThrowsL = new JLabel("Saving throw " + e));
                savingThrowsL.setFont(fontSmall);
                savingThrowsL.setForeground(Color.RED);
        }

        if(!savingThrows.isEmpty()){
            panel.add(new JLabel(new ImageIcon("src/Images/Split.png")));
        }

        for (String e: otherInfo) {
                panel.add(otherInfoL = new JLabel(e));
                otherInfoL.setFont(fontSmall);
        }

        panel.add(new JLabel(new ImageIcon("src/Images/Split.png")));

        panel.add(new JLabel("Actions: ")).setFont(fontMedium);
        for (String e: monsterActions) {
            panel.add(actionsL = new JLabel(e));
            actionsL.setFont(fontSmall);
        }
        frame.pack();
        frame.setVisible(true);


    }


}
