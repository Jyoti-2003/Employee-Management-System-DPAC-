package employee.management.system;
//6

import javax.swing.*;
import java.awt.*;
//4.1
import java.awt.event.*;

public class Flash extends JFrame implements ActionListener {
//    4

    Flash() {
        // This code will use for fgrames changes   --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        7
        setSize(1170, 650);
//        8
        setVisible(true);
//        9
        setLocation(200, 100);
        // It will set the title of the frame
        setTitle("Employee Mangement System(DPAC)");

//        10
        getContentPane().setBackground(Color.WHITE);

//      Tgis code will use  for heading changes like-font color,style etc.  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//    12
        JLabel heading = new JLabel("Employee Mangement System(DPAC)");
        add(heading);

//        13    
        setLayout(null);

        //14
        heading.setBounds(100, 30, 1200, 60);

        //15
        heading.setFont(new Font("poppins", Font.BOLD, 50));
//
        //16
        heading.setForeground(Color.DARK_GRAY);

        // This code will use for image chages on a frame --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //17
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("front1.jpg"));
        //18
        Image i1 = i.getImage().getScaledInstance(1100, 550, Image.SCALE_DEFAULT);
        //19 
        //22
        ImageIcon i2 = new ImageIcon(i1);
        //20
        JLabel j = new JLabel(i2);
        //21
        j.setBounds(100, 100, 850, 500);
        //20
        add(j);

        // Tbis code will use for adding button in the front page --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //23
        JButton clickhere = new JButton("Cick Here");
        //24
        clickhere.setBounds(320, 400, 200, 70);
//        26
        clickhere.setBackground(Color.WHITE);
        clickhere.setForeground(Color.BLACK);
//        27
        clickhere.setFont(new Font("poppins", Font.BOLD, 28));
        //4.1
        clickhere.addActionListener(this);
//25
        j.add(clickhere);

        // Thgis code will use for turn on/off the heading like bulb --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        while (true) {
            //28(1)
            heading.setVisible(false);
//            28(2)
            try {
                Thread.sleep(1000);
            } catch (Exception t) {

            }
            // thene repeat this code once again to on/off the heading like bulb
            heading.setVisible(true);
            try {
                Thread.sleep(800);
            } catch (Exception t) {

            }
        }
    }

    // Code-1
//    public void actionPerfromed(ActionEvent ae)
//    {
//        setVisible(false);
//        new Login();
//    }
    // this code will connect Flash.java file to Login.java file through ClickHere button
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String og[]) {
        Flash oh = new Flash();
    }
}
