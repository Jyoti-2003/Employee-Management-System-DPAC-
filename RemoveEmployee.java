//package employee.management.system;
//
//import javax.swing.*;
//// Color class is under the awt pacakage
//import java.awt.*;
//// to use ResultSet classs we use sql package
//import java.sql.*;
//// to use ActionListener class we import
//import java.awt.event.*;
//
//public class RemoveEmployee extends JFrame implements ActionListener {
//
//    // here we creat a choice variable
//    Choice cEmpId;
//
//    RemoveEmployee() {
//        // here all changes made for frame  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        // whole image will fit to the frame
//        setSize(900, 400);
//        // to display the frame to the window 
//        setVisible(true);
//        // Then we set the location of frame that will be display on  center of window
//        setLocation(500, 200);
//        // to change the color of the frame we use
//        getContentPane().setBackground(Color.WHITE);
//        // To don't use swing Layout we set Layout Null 
//        setLayout(null);
//        // It will set the title of the frame
//        setTitle("Employee Mangement System(DPAC)");
//
//        // here first of all we need empid to search the particular emp ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        // we delete the particular employee detail's based on "EmpId"
//        JLabel labelempId = new JLabel("Employee Id :");
//        labelempId.setBounds(50, 50, 100, 30);
//        add(labelempId);
//
//        // here we creat an inatnce of Choice class
//        cEmpId = new Choice();
//        cEmpId.setBounds(200, 50, 130, 30);
//        add(cEmpId);
//
//        // here we add emp id in Choice object
//        try {
//            // It will creat a connection with sql
//            Conn c = new Conn();
//            // It will receive the query execute in the data base
//            String query = "select * from employee";
//            ResultSet rs = c.s.executeQuery(query);
//            // here we abstract the data from rs
//            while (rs.next()) {
//                // here we add the all empid from employee data table show in the choice list
//                cEmpId.add(rs.getString("empid"));
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // here we show the name based on the empid-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        JLabel labelname = new JLabel("Name :");
//        labelname.setBounds(50, 100, 100, 30);
//        add(labelname);
//
//        // here we don't update the name 
//        JLabel lblname = new JLabel();
//        lblname.setBounds(200, 100, 100, 30);
//        add(lblname);
//
//        // here we show the phone no. based on the empid-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        JLabel labelphone = new JLabel("Phone No. :");
//        labelphone.setBounds(50, 150, 100, 30);
//        add(labelphone);
//
//        // here we don't update the phone no.
//        JLabel lblphone = new JLabel();
//        lblphone.setBounds(200, 150, 100, 30);
//        add(lblphone);
//
//        // here we show the name based on the empid-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        JLabel labelemail = new JLabel("Email Id :");
//        labelemail.setBounds(50, 200, 100, 30);
//        add(labelemail);
//
//        // here we don't update the name based on the empid
//        JLabel lblemail = new JLabel();
//        lblemail.setBounds(200, 200, 100, 30);
//        add(lblemail);
//
//        // here we abstarct data based on empid
//        try {
//            // It will creat a connection with sql
//            Conn c = new Conn();
//            // It will receive the query execute in the data base
//            // it will show data based item selected in Chioce list item
//            String query = "select * from employee where empid='" + cEmpId.getSelectedItem() + "'";
//            ResultSet rs = c.s.executeQuery(query);
//            // here we abstract the data from rs
//            while (rs.next()) {
//                // it will show text receive from rs object like name from data base based on empid,phone from data base based on empid,email from data base based on empid
//                lblname.setText(rs.getString("name"));
//                lblphone.setText(rs.getString("phone"));
//                lblemail.setText(rs.getString("email"));
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // here it will check if the value of empid is changing or not-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        cEmpId.addItemListener(new ItemListener() {
//            public void itemStateChanged(ItemListener ae) {
//                // if dropdown empid value will be changed then also data also be change
//                try {
//                    // It will creat a connection with sql
//                    Conn c = new Conn();
//                    // It will receive the query execute in the data base
//                    // it will show data based item selected in Chioce list item
//                    String query = "select * from employee where empid='" + cEmpId.getSelectedItem() + "'";
//                    ResultSet rs = c.s.executeQuery(query);
//                    // here we abstract the data from rs
//                    while (rs.next()) {
//                        // it will show text receive from rs object like name from data base based on empid,phone from data base based on empid,email from data base based on empid
//                        lblname.setText(rs.getString("name"));
//                        lblphone.setText(rs.getString("phone"));
//                        lblemail.setText(rs.getString("email"));
//                    }
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//
//    }
//
////    public static void main(String[] oh) {
////        new RemoveEmployee();
////    }
//    public static void main(String[] args) {
//        new RemoveEmployee();
//    }
//}
package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class RemoveEmployee extends JFrame implements ActionListener {

    Choice cEmpId;
    JButton delete, back;

    RemoveEmployee() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel labelempId = new JLabel("Employee Id");
        labelempId.setBounds(50, 50, 100, 30);
        add(labelempId);

        cEmpId = new Choice();
        cEmpId.setBounds(200, 50, 150, 30);
        add(cEmpId);

        try {
            Conn c = new Conn();
            String query = "select * from employee";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                cEmpId.add(rs.getString("empId"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 100, 100, 30);
        add(labelname);

        JLabel lblname = new JLabel();
        lblname.setBounds(200, 100, 100, 30);
        add(lblname);

        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(50, 150, 100, 30);
        add(labelphone);

        JLabel lblphone = new JLabel();
        lblphone.setBounds(200, 150, 100, 30);
        add(lblphone);

        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 200, 100, 30);
        add(labelemail);

        JLabel lblemail = new JLabel();
        lblemail.setBounds(200, 200, 100, 30);
        add(lblemail);

        try {
            Conn c = new Conn();
            String query = "select * from employee where empId = '" + cEmpId.getSelectedItem() + "'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                lblname.setText(rs.getString("name"));
                lblphone.setText(rs.getString("phone"));
                lblemail.setText(rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        cEmpId.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try {
                    Conn c = new Conn();
                    String query = "select * from employee where empId = '" + cEmpId.getSelectedItem() + "'";
                    ResultSet rs = c.s.executeQuery(query);
                    while (rs.next()) {
                        lblname.setText(rs.getString("name"));
                        lblphone.setText(rs.getString("phone"));
                        lblemail.setText(rs.getString("email"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // here we craet a delete button to remove the employee dtatil's -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        delete = new JButton("Delete");
        delete.setBounds(80, 300, 100, 30);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        // to add click event in button we use addActionListener class
        delete.addActionListener(this);
        add(delete);

        // here we craet a back button to jump to the Home page -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        back = new JButton("Back");
        back.setBounds(220, 300, 100, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        // to add click event in button we use addActionListener class
        back.addActionListener(this);
        add(back);

//         // here we add a image to the Remove page -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
//        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(350, 0, 600, 400);
//        add(image);

 // here we add a image to the Remove page -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //17 this no. belongs to Flash.java file
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("second2.jpg"));
        //18 this no. belongs to Flash.java file
        // to show image in squre size we same the first two value 200,200
        Image i1 = i.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        //19 this no. belongs to Flash.java file
        //22 this no. belongs to Flash.java file
        ImageIcon i2 = new ImageIcon(i1);
        //20 this no. belongs to Flash.java file
        JLabel j = new JLabel(i2);
        //21 this no. belongs to Flash.java file
        j.setBounds(350, 60, 200, 200);
        //20 this no. belongs to Flash.java file
        add(j);

        setSize(600, 400);
        setLocation(300, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        // if delete button was click we perfrom some task
        if (ae.getSource() == delete) {
            try {
                Conn c = new Conn();
                // here we excute delete command to delete the employee based on empid
                String query = "delete from employee where empId = '"+cEmpId.getSelectedItem()+"'";
                c.s.executeUpdate(query);
                // After deleteing an employee from dtata bse we show a mesage using JOpationPane
                JOptionPane.showMessageDialog(null, "Employee Information Deleted Sucessfully");
                setVisible(false);
//                 after message dialog show we jump to Home page
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new RemoveEmployee();
    }
}
