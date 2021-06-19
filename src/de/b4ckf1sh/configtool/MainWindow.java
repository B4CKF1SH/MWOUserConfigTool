package de.b4ckf1sh.configtool;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.HashMap;

public class MainWindow {

    private JFrame frame;

    private boolean placeLeft = true;

    static {
        FlatLightLaf.setup();
    }

    private JMenuBar menuBar;
    private JPanel panel1;
    private JButton initialSetupButton;
    private JComboBox<Preset> comboBox1;
    private JPanel panel2;
    private JButton generateUserCfgButton;
    private JPanel panel3;
    private JTextField textField1;
    private JButton searchButton;
    private JButton clearButton;

    {
        menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.getAccessibleContext().setAccessibleDescription(
                "File Menu");
        menuBar.add(fileMenu);

        JMenuItem loadPreset = new JMenuItem("Load Preset");
        loadPreset.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        loadPreset.getAccessibleContext().setAccessibleDescription(
                "Load a preset file");

        loadPreset.addActionListener((e) -> {
            //TODO: load from file
        });

        fileMenu.add(loadPreset);

        JMenuItem savePreset = new JMenuItem("Save Preset");
        savePreset.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        savePreset.getAccessibleContext().setAccessibleDescription(
                "Save a preset file");

        savePreset.addActionListener((e) -> {
            HashMap<String, Integer> optionsMap = new HashMap<>();
            for (Option o : OptionsLibrary.getOptionList()) {
                optionsMap.put(o.name, o.getValue());
            }

            //TODO: Save to file
            try {
                System.out.println(Preset.jsonFromPreset(optionsMap));
            } catch (JsonProcessingException jsonProcessingException) {
                jsonProcessingException.printStackTrace();
            }
        });

        fileMenu.add(savePreset);

        fileMenu.addSeparator();

        JMenuItem exit = new JMenuItem("Exit");
        exit.getAccessibleContext().setAccessibleDescription(
                "Exit the Program");
        fileMenu.add(exit);
    }

    /*{
        for (Preset p : OptionsLibrary.getPresetList()) {
            comboBox1.addItem(p);
        }

        comboBox1.addActionListener((e) -> {
            Preset p = (Preset) comboBox1.getSelectedItem();
            List<Option> optionList = OptionsLibrary.getOptionList();
            for (int i = 0; i < p.values.size(); i++) {
                optionList.get(i).setValue(p.values.get(i));
            }
        });
    }*/

    {
        searchButton.addActionListener((e) -> {
            showOptions(textField1.getText().strip());
        });

        clearButton.addActionListener((e) -> {
            textField1.setText("");
            showOptions("");
        });
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
        JFrame frame = new JFrame("MWO User Config Tool v0.1b");
        mw.frame = frame;
        frame.setContentPane(mw.panel1);
        frame.setJMenuBar(mw.menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mw.panel2.setLayout(new BoxLayout(mw.panel2, BoxLayout.PAGE_AXIS));
        mw.panel3.setLayout(new BoxLayout(mw.panel3, BoxLayout.PAGE_AXIS));

        mw.showOptions("");

        frame.pack();
        frame.setSize(600, 800);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    private void showOptions(String filter) {

        placeLeft = true;

        panel2.removeAll();
        panel3.removeAll();

        if (filter == null || filter.isBlank()) {
            for (Option o : OptionsLibrary.getOptionList()) {
                addOption(o);
            }
        }
        else {
            for (Option o : OptionsLibrary.getOptionList()) {
                if (o.name.toLowerCase().contains(filter.toLowerCase())) {
                    addOption(o);
                }
            }
        }

        panel2.revalidate();
        panel2.repaint();
        panel3.revalidate();
        panel3.repaint();
    }

    private void addOption(Option o) {

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel(o.name);
        label.setSize(100, 50);
        label.revalidate();
        panel.add(label);

        JButton infoButton = new JButton("i");
        infoButton.setSize(25, 25);
        infoButton.revalidate();

        infoButton.addActionListener((e) -> {
            JOptionPane.showMessageDialog(frame, String.format("<html><body>%s</body></html>", o.description.replace("\n", "<br>")), o.name, JOptionPane.INFORMATION_MESSAGE);
        });

        panel.add(infoButton);

        Component cb = o.getComponent();
        cb.setSize(100, 40);
        panel.add(cb);

        (placeLeft ? panel2 : panel3).add(panel);
        placeLeft = !placeLeft;
    }
}
