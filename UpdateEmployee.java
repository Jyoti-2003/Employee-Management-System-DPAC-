package employee.management.system;

// To change the color of frmae we use awt class
import java.awt.*;
// JFrame class was access by this Package [ javax.swing.* ]
import javax.swing.*;
// to use ActionListener class
import java.awt.event.*;
// to use the data base we use sql
import java.sql.*;

// Here we extend a JFrame class 
public class UpdateEmployee extends JFrame implements ActionListener {

    // here we declare globally because to access by the actionPerformed()
    JButton add, back;
    JTextField tfeducation, tffname, tfsalary, tfaddress, tfphone, tfemail, tfdesignation, tfaadhar;
    JLabel lblempId;
    String empId;

    // constructor
    // here we pass the empid because we the empid in update button from ViewEmployee class
    UpdateEmployee(String empId) {
        // here we store the value of loacl variable in global variable
        this.empId = empId;

        // here all changes made for frame  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // whole image will fit to the frame
        setSize(900, 700);
        // to display the frame to the window 
        setVisible(true);
        // Then we set the location of frame that will be display on  center of window
        setLocation(500, 200);
        // to chnage the color of the frame we use
        getContentPane().setBackground(Color.WHITE);
        // To don't use swing Layout we set Layout Null 
        setLayout(null);
                // It will set the title of the frame
        setTitle("Employee Mangement System(DPAC)");

        //This code will use  for heading of Addemployee changes like-font color,style etc.  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // we creat a JLabel class object to write something in frame
        JLabel heading = new JLabel("Update Employee Detail's ");
        // heading is showing on which position of frame we set here
        heading.setBounds(300, 30, 500, 50);
        // Then we just add heading in the frame by calling add()
        add(heading);
        // setFont() is use to set the font family,Font,font size of heading object
        heading.setFont(new Font("poppins", Font.BOLD, 30));
//        //16
//        heading.setForeground(Color.DARK_GRAY);

        // here we just add the name of employee in databases  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        JLabel labelname = new JLabel("Name :");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("poppins", Font.BOLD, 19));
        add(labelname);

        // here we can't change the Name of an employee s o we use here JLabel class
        JLabel lblname = new JLabel();
        // textfield is showing on which position of frame we set here
//        50+150 from labelname object =200 in 1st position
        lblname.setBounds(200, 150, 150, 30);
        lblname.setFont(new Font("poppins", Font.BOLD, 15));
        add(lblname);

        // here we just add the father name of employee in databases  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // "labelfname" stands for father name of an employee
        JLabel labelfname = new JLabel("Father's Name :");
        // we show label object in the same level pe show karna hain but thoda age dikhana hain
        labelfname.setBounds(400, 150, 190, 30);
        labelfname.setFont(new Font("poppins", Font.BOLD, 19));
        add(labelfname);

        // here textField is use to craet a box to tke input from the admin
        // "tffname" stands for father name of an employee to take input father name of an employee
        tffname = new JTextField();
        // textfield is showing on which position of frame we set here
        tffname.setBounds(600, 150, 170, 30);
        tffname.setFont(new Font("poppins", Font.BOLD, 15));
        add(tffname);

        // here we just add date of birth of employee in databases  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // "labeldob" stands for date of birth of an employee
        JLabel labeldob = new JLabel("Date fo Birth :");
        // we show label object in the same level pe show karna hain but thoda age dikhana hain
        labeldob.setBounds(45, 200, 170, 30);
        labeldob.setFont(new Font("poppins", Font.BOLD, 19));
        add(labeldob);

        // here we can't change the date of birth of an employee s o we use here JLabel class
        JLabel lbldob = new JLabel();
        lbldob.setBounds(210, 200, 170, 30);
        lbldob.setFont(new Font("poppins", Font.BOLD, 15));
        add(lbldob);

        // here we just add salary of employee in databases  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        JLabel labelsalary = new JLabel("Salary :");
        // we show label object in the same level pe show karna hain but thoda age dikhana hain
        labelsalary.setBounds(400, 200, 190, 30);
        labelsalary.setFont(new Font("poppins", Font.BOLD, 19));
        add(labelsalary);

        // here textField is use to craet a box to tke input from the admin
        // "tffname" stands for father name of an employee to take input father name of an employee
        tfsalary = new JTextField();
        // textfield is showing on which position of frame we set here
        tfsalary.setBounds(600, 200, 170, 30);
        tfsalary.setFont(new Font("poppins", Font.BOLD, 15));
        add(tfsalary);

        // here we just add address of employee in databases  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        JLabel labeladdress = new JLabel("Address :");
        // we show label object in the same level pe show karna hain but thoda age dikhana hain
        labeladdress.setBounds(50, 250, 190, 30);
        labeladdress.setFont(new Font("poppins", Font.BOLD, 19));
        add(labeladdress);

        // here textField is use to craet a box to tke input from the admin
        // "tffname" stands for father name of an employee to take input father name of an employee
        tfaddress = new JTextField();
        // textfield is showing on which position of frame we set here
        tfaddress.setBounds(200, 250, 170, 30);
        tfaddress.setFont(new Font("poppins", Font.BOLD, 15));
        add(tfaddress);

        // here we just add the phone no. of employee in databases  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // "labelfname" stands for father name of an employee
        JLabel labelphone = new JLabel("Phone No. :");
        // we show label object in the same level pe show karna hain but thoda age dikhana hain
        labelphone.setBounds(400, 250, 190, 30);
        labelphone.setFont(new Font("poppins", Font.BOLD, 19));
        add(labelphone);

        // here textField is use to craet a box to tke input from the admin
        // "tffname" stands for father name of an employee to take input father name of an employee
        tfphone = new JTextField();
        // textfield is showing on which position of frame we set here
        tfphone.setBounds(600, 250, 170, 30);
        tfphone.setFont(new Font("poppins", Font.BOLD, 15));
        add(tfphone);

        // here we just add email of employee in databases  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        JLabel labelemail = new JLabel("Email :");
        // we show label object in the same level pe show karna hain but thoda age dikhana hain
        labelemail.setBounds(50, 300, 190, 30);
        labelemail.setFont(new Font("poppins", Font.BOLD, 19));
        add(labelemail);

        // here textField is use to craet a box to tke input from the admin
        // "tffname" stands for father name of an employee to take input father name of an employee
        tfemail = new JTextField();
        // textfield is showing on which position of frame we set here
        tfemail.setBounds(200, 300, 170, 30);
        tfemail.setFont(new Font("poppins", Font.BOLD, 15));
        add(tfemail);

        // here we just add the phone no. of employee in databases  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // "labelfname" stands for father name of an employee
        JLabel labeleducation = new JLabel("Highest Education :");
        // we show label object in the same level pe show karna hain but thoda age dikhana hain
        labeleducation.setBounds(400, 300, 190, 30);
        labeleducation.setFont(new Font("poppins", Font.BOLD, 19));
        add(labeleducation);

        // here we can't show a dropdown list so we use a textField
        tfeducation = new JTextField();
        tfeducation.setBackground(Color.WHITE);
        tfeducation.setFont(new Font("poppins", Font.BOLD, 15));
        // textfield is showing on which position of frame we set here
        tfeducation.setBounds(600, 300, 170, 30);
        add(tfeducation);

        // here we just add Dsugnation of employee in databases  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        JLabel labeldesignation = new JLabel("Designation :");
        // we show label object in the same level pe show karna hain but thoda age dikhana hain
        labeldesignation.setBounds(50, 350, 190, 30);
        labeldesignation.setFont(new Font("poppins", Font.BOLD, 19));
        add(labeldesignation);

        // here textField is use to craet a box to tke input from the admin
        // "tffname" stands for father name of an employee to take input father name of an employee
        tfdesignation = new JTextField();
        // textfield is showing on which position of frame we set here
        tfdesignation.setBounds(200, 350, 170, 30);
        tfdesignation.setFont(new Font("poppins", Font.BOLD, 15));
        add(tfdesignation);

        // here we just add the addhar no. of employee in databases  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // "labelaadhar" stands for aadhar of an employee
        JLabel labelaadhar = new JLabel("Aadhar No. :");
        // we show label object in the same level pe show karna hain but thoda age dikhana hain
        labelaadhar.setBounds(400, 350, 190, 30);
        labelaadhar.setFont(new Font("poppins", Font.BOLD, 19));
        add(labelaadhar);

        // here we can't change the Aadhar no. of an employee s o we use here JLabel class
        JLabel lblaadhar = new JLabel();
        // JLabel is showing on which position of frame we set here
        lblaadhar.setBounds(600, 350, 170, 30);
        lblaadhar.setFont(new Font("poppins", Font.BOLD, 15));
        add(lblaadhar);

        // here we just add the employee id of an employee ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // here emp id in JLabel class because we can't cahange the id of an employee
        // JLabel  aap jpo value dal te ho bo value stock ho jati hain
        JLabel labelempid = new JLabel("Employee Id :");
        // we show label object in the same level pe show karna hain but thoda age dikhana hain
        labelempid.setBounds(50, 400, 190, 30);
        labelempid.setFont(new Font("poppins", Font.BOLD, 19));
        add(labelempid);

        // here we pass number variable which is use Random class to craet different no.s
        // **********if you put " " before the no. it will convert your no. into String
        // here we can't change the Employee id  of an employee s o we use here JLabel class
        lblempId = new JLabel();
        lblempId.setBounds(200, 400, 190, 30);
        lblempId.setFont(new Font("poppins", Font.BOLD, 19));
        add(lblempId);

        // here we abstarct data the name,dob,aadhar,empid from the  data base
        try {
            Conn c = new Conn();
            // here abstarct the id of an employee
            String query = "select * from employee where empId='" + empId + "'";
            ResultSet rs = c.s.executeQuery(query);
            // if rs conatin value then this loop will be run
            while (rs.next()) {
                // here we pass name because through empid we abstarct the name of an employee
                lblname.setText(rs.getString("name"));
                // here we pass fname because through empid we abstarct the fname of an employee
                tffname.setText(rs.getString("fname"));
                // here we pass dob because through empid we abstarct the dob of an employee
                lbldob.setText(rs.getString("dob"));
                // here we pass salary because through empid we abstarct the salary of an employee
                tfsalary.setText(rs.getString("salary"));
                // here we pass address because through empid we abstarct the address of an employee
                tfaddress.setText(rs.getString("address"));
                // here we pass phone because through empid we abstarct the phone of an employee
                tfphone.setText(rs.getString("phone"));
                // here we pass email because through empid we abstarct the email of an employee
                tfemail.setText(rs.getString("email"));
                // here we pass education because through empid we abstarct the education of an employee
                tfeducation.setText(rs.getString("education"));
                // here we pass designation because through empid we abstarct the designation of an employee
                tfdesignation.setText(rs.getString("designation"));
                // here we pass aadhar because through empid we abstarct the aadhar of an employee
                lblaadhar.setText(rs.getString("aadhar"));
                // here we pass empid because through empid we abstarct the empid of an employee
                lblempId.setText(rs.getString("empid"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // here we use button to add details's of employees in databases-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        add = new JButton("Update Detail's");
        add.setBounds(250, 550, 190, 40);
        // setFont() is use tos et the font family,Font,font size
        add.setFont(new Font("poppins", Font.BOLD, 15));
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        // to add next page open while clicking we write this
        add.addActionListener(this);
        add(add);

        // here we use button to back to the Home page-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        back = new JButton("Back");
        back.setBounds(450, 550, 190, 40);
        // setFont() is use tos et the font family,Font,font size
        back.setFont(new Font("poppins", Font.BOLD, 15));
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        // to add next page open while clicking we write this
        back.addActionListener(this);
        add(back);

    }

    public void actionPerformed(ActionEvent ae) {
        // here we have two buttons Add Detail's and Back
        if (ae.getSource() == add) {
            // here we choose those variable which value will change 

            String fname = tffname.getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = tfeducation.getText();
            String designation = tfdesignation.getText();

            try {
                Conn conn = new Conn();
                //   here we insert the value's of employee's
                // here we use single inverted coma because we take value in varchar format and it take in ( ' ' )
                // remember your value should be in same order that you write in databases 
                // to update something in data base we write update is DDL COMMAND
                // jiska value change karn ahain suppose [ fname='"+faname+'" ] fname is column name of your table
                // then in last we use empid through we can change in particular row
                String query = "update employee set fname = '" + fname + "', salary = '" + salary + "', address = '" + address + "', phone = '" + phone + "', email =  '" + email + "', education = '" + education + "', designation = '" + designation + "' where empId = '" + empId + "'";
                // then we creat conn object to execute the query
                // it is a dml so we use .executeUpdtae()
                conn.s.executeUpdate(query);
                // After sucessfully inserted data we show a message using JOptionPane
                JOptionPane.showMessageDialog(null, "Details updated successfully");
                setVisible(false);
                // Hre we enter Back button we back to the home page
                new Home();
            } catch (Exception e) {
                // it will return the exception arrise in the code
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            // After click back button we back to Home page so we creat an object of Home page
            new Home();
        }
    }

    public static void main(String h[]) {
        // here we craet a object of AddEmployee
        new UpdateEmployee(" ");
    }
}
