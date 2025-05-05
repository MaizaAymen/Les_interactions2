package swind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements MouseListener {
    private JLabel labelMessage;
    private JTextField nomField, emailField, passwordField;
    private JButton buttonAfficher;
    JLabel label;
    JButton ButOk, btnquit;

    public Main() {
        super("bienvenue");
        setLayout(new FlowLayout());

        labelMessage = new JLabel("tape ton nom prenom , password, eamil ");
        nomField = new JTextField(20);
        emailField = new JTextField(20);
        passwordField = new JTextField(20);
        buttonAfficher = new JButton("afficher");

        label = new JLabel("donner votre choix");
        ButOk = new JButton("ButOk");
        btnquit = new JButton("Quitter");

        add(labelMessage);
        add(nomField);
        add(emailField);
        add(passwordField);
        add(buttonAfficher);
        add(label);
        add(ButOk);
        add(btnquit);

        buttonAfficher.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nom = nomField.getText();
                labelMessage.setText("Bonjour " + nom);
            }
        });
        ButOk.addMouseListener(this);
        btnquit.addMouseListener(this);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("hello");
        if (e.getSource() == ButOk) {
            String mesage = "qulle est  votre prenom";
            String reponce = JOptionPane.showInputDialog(this, mesage, "le titre ", JOptionPane.PLAIN_MESSAGE);
            if (reponce != null && reponce.length() != 0) {
                label.setText(reponce);
            }
        } else if (e.getSource() == btnquit) {
            System.exit(0);
        }
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new Main();
    }
}