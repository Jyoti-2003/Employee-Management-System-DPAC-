//package employee.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//// to use ResultSet class we import sql pacakge
//import java.sql.*;
//import net.proteanit.sql.DbUtils;
//import java.awt.event.*;
//
//public class ViewEmployee extends JFrame implements  ActionListener{
//
////     Here we show the data in a table format so we creat a variable of JTable
//    JTable table;
//    // here we creat a drop down
//    Choice cemployeeId;
//    JComboBox hero;
//
//    // then we add button in frame
//    JButton search, print, update, back;
//
//    ViewEmployee() {
//        // here all changes made for frame  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        // whole image will fit to the frame
//        setSize(900, 700);
//        // to display the frame to the window 
//        setVisible(true);
//        // Then we set the location of frame that will be display on  center of window
//        setLocation(500, 200);
//        // to chnage the color of the frame we use
//        getContentPane().setBackground(Color.WHITE);
//        // To don't use swing Layout we set Layout Null 
//        setLayout(null);
//
//        // here we show the data in table format  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//// here we creat a object of JTable
//        table = new JTable();
//        //here we abstract the data from MySql data base so we use try and catch block to catch the error type ocuured by MySql
//        try {
//            // when you try to work with databse first you creat a object of 'Conn' class
//            Conn c = new Conn();
//            // to abstract data from databse we use ResultSet class to store the data in 'rs'
//            // we show all the data from database so we write "select * from employee"
//            ResultSet rs = c.s.executeQuery("select * from employee");
//            // to store the data from "rs" object to "table" object we write
//            table.setModel(DbUtils.resultSetToTableModel(rs));
//
//        } catch (Exception r) {
//            r.printStackTrace();
//        }
//
//        // To add the scroll bar because the data is very big we need a "ScrollBar"
//        // here we pass the object in which add the scroll bar
//        JScrollPane jsp = new JScrollPane(table);
//        // then we need to SetBounds of table in frame
//        jsp.setBounds(0, 100, 900, 600);
//        // then add the jsp object in frame
//        add(jsp);
//
//        // here we write code about to search a employee from database  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        // It add the heading in frame to serach the employee detail's by employee id
//        JLabel searchlbl = new JLabel("Search By Employee Id");
//        searchlbl.setBounds(20, 26, 150, 10);
//        add(searchlbl);
//
//        // here we write the code for ad choice in the frame  -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
//        // here we creat a object of Choice
////        cemployeeId = new Choice();
////        cemployeeId.setBounds(180, 20, 150, 10);
////        add(cemployeeId);
//      // here we just add values for JComboBox it take value in string type
//        String courses[] = {" 11655", " 941015", " 565168"};
//        // here we pass courses in JComboBox to show all string value in dropdown list
//        hero = new JComboBox(courses);
//hero.setBackground(Color.WHITE);
//        hero.setFont(new Font("poppins", Font.BOLD, 14));
//        // textfield is showing on which position of frame we set here
//        hero.setBounds(180, 20, 150, 20);
//        add(hero);
//
//        // here it is the code for search button  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        search = new JButton("Search");
//        search.setBounds(20, 70, 80, 20);
//        search.addActionListener(this);
//        add(search);
//
//        // here it is the code for print button  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        print = new JButton("Print");
//        print.setBounds(120, 70, 80, 20);
//        print.addActionListener(this);
//        add(print);
//
//        // here it is the code for update button  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        update = new JButton("Update ");
//        update.setBounds(220, 70, 80, 20);
//        update .addActionListener(this);
//        add(update);
//
//        // here it is the code for Back button  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        back = new JButton("Back");
//        back.setBounds(320, 70, 80, 20);
//        back.addActionListener(this);
//        add(back);
//    }
//    
//     // this code will connect
//    public void actionPerformed(ActionEvent ae) {
//        // here we have 4 type of button in which basis we can differtiate using .getSource through ActionEvent object
//        if (ae.getSource() == search) {
//            // it will give result according to the employee id
//              String query = "select * from employee where empid = '"+cemployeeId.getSelectedItem()+"'";
//            try {
//                Conn c = new Conn();
//                ResultSet rs = c.s.executeQuery(query);
//                table.setModel(DbUtils.resultSetToTableModel(rs));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else if (ae.getSource() == print) {
//            
//        } else if (ae.getSource() == update) {
//
//        } //           else     if(ae.getSource() == back)
//        else {
//            // when we will click back button it will close the frame open the home page
//            setVisible(false);
//            new Home();
//        }
//    }
//
//    public static void main(String og[]) {
//        new ViewEmployee();
//    }
//}
package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class ViewEmployee extends JFrame implements ActionListener {

    JTable table;
    Choice cemployeeId;
    JButton search, print, update, back;

    ViewEmployee() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel searchlbl = new JLabel("Search by Employee Id");
        searchlbl.setBounds(20, 20, 150, 20);
        add(searchlbl);

        cemployeeId = new Choice();
        cemployeeId.setBounds(180, 20, 150, 20);
        add(cemployeeId);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            while (rs.next()) {
                cemployeeId.add(rs.getString("empId"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        table = new JTable();

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 900, 600);
        add(jsp);

        search = new JButton("Search");
        search.setBounds(20, 70, 80, 20);
        search.addActionListener(this);
        add(search);

        print = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.addActionListener(this);
        add(print);

        update = new JButton("Update");
        update.setBounds(220, 70, 80, 20);
        update.addActionListener(this);
        add(update);

        back = new JButton("Back");
        back.setBounds(320, 70, 80, 20);
        back.addActionListener(this);
        add(back);

        setSize(900, 700);
        setLocation(300, 100);
        setVisible(true);
        // It will set the title of the frame
        setTitle("Employee Mangement System(DPAC)");
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {
            String query = "select * from employee where empId = '" + cemployeeId.getSelectedItem() + "'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == print) {
            try {
                // it will give result according to the employee database so we use try and catch block 
                // first you will mention kisko print karna hain then cal  [.print()]
                table.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == update) {
            setVisible(false);
// here when we click the update button by his id we jump to the update frame
            new UpdateEmployee(cemployeeId.getSelectedItem());
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String og[]) {
        new ViewEmployee();
    }
}

public static void main(String[] args) {
        new ViewEmployee();
    }
}
