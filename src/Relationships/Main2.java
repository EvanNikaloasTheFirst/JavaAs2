package Relationships;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 implements ActionListener {

    private JFrame myWindow;
    private JPanel panelNorth, panelSouth;
    private JButton btnClick,btnExit;

    private JTextField txtFirstname,txtSurname;
    private JLabel lblFirstname,lblSurname;

    public Main2() {
        myWindow = new JFrame("Student app");
        panelNorth = new JPanel();
        lblFirstname = new JLabel("Firstname");
        lblSurname = new JLabel("Surname");
        panelNorth.setLayout(new GridLayout(0, 2));
        panelSouth = new JPanel();
        txtFirstname = new JTextField(20);
        txtSurname = new JTextField(20);

        panelNorth.add(lblFirstname);
        panelNorth.add(txtFirstname);
        panelNorth.add(lblSurname);
        panelNorth.add(txtSurname);

        btnClick = new JButton("Save work");
        btnClick.addActionListener(this);
        btnExit = new JButton("Exit");
        btnExit.addActionListener(this);
        panelSouth.add(btnExit);
        panelSouth.add(btnClick);


        myWindow.setBounds(100, 100, 500, 500);
        myWindow.getContentPane().add(panelNorth,BorderLayout.NORTH);
        myWindow.getContentPane().add(panelSouth,BorderLayout.SOUTH);

        myWindow.setVisible(true);
    }

    public void writeToFile(String filename)
    {
        try{
            FileWriter fr = new FileWriter(filename);
            BufferedWriter br = new BufferedWriter(fr);
            br.write(txtSurname.getText()+",");
            br.write(txtFirstname.getText());
            br.close();
        }catch (IOException e)
        {
            e.printStackTrace();;
        }
    }
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btnExit){
        System.exit(0);

    }  else if(e.getSource() == btnClick)
    {
        writeToFile("data.txt");
    }

    }
    public static void main(String[] args) {
//        Name n = new Name("Evangelos","Empochon");
//
//
//        Volunteer x = new Volunteer(123,n,"abc@yahoo.com","1234",12);
//        System.out.println(x.getName().getFullName());
////          public Person(Name n,String em,String p)
//
//            CharityStaff charity = new CharityStaff();
//            charity.populate();
//            System.out.print(charity.listDetails() );
//            System.out.println("Total hours worked is " + charity.getTotalHours())
        new Main2();


    }


}
