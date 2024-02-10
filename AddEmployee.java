package employee.management.system;
// To change the color of frmae we use awt class

import java.awt.*;
// JFrame class was access by this Package [ javax.swing.* ]
import javax.swing.*;
// to use Calender in the date of Birth section we use jcalender package
import com.toedter.calendar.JDateChooser;
// to use Random clas we import
import java.util.*;
// to use ActionListener class
import java.awt.event.*;

// Here we extend a JFrame class 
public class AddEmployee extends JFrame implements ActionListener {

    // we creat an object of Random class
    Random ran = new Random();
    // here number is the emp id no.
    // here we generate 6 no.s id so we pass "999999"
    int number = ran.nextInt(999999);
    // here we declare globally because to access by the actionPerformed()
    JButton add, back;
    JTextField tfname, tffname, tfsalary, tfaddress, tfphone, tfemail, tfdesignation, tfaadhar;
    JDateChooser dcdob;
    JComboBox cbeducation;
    JLabel lblempId;

    // constructor
    AddEmployee() {
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
        JLabel heading = new JLabel("Add Employee Detail's ");
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

        // here textField is use to craet a box to tke input from the admin
        tfname = new JTextField();
        // textfield is showing on which position of frame we set here
//        50+150 from labelname object =200 in 1st position
        tfname.setBounds(200, 150, 150, 30);
         tfname.setFont(new Font("poppins", Font.BOLD, 15)); 
        add(tfname);

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

        // here we use calender to easy to take birth date of employee
        // we craet a object of JDateChoser to acces the calender
        dcdob = new JDateChooser();
        dcdob.setBounds(210, 200, 170, 30);
         dcdob.setFont(new Font("poppins", Font.BOLD, 15));
        add(dcdob);

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

        // here we craet a drop down to choose one of the eduaction from many of them
        // we creat a dropdown using combo box and Choice class
        // ComboBox class =>
        // here we just add values for JComboBox it take value in string type
        String courses[] = {"BTech", "BCA", "BSc", "BBA", "B.Com", "BA", "MCA", "MBA", "MTech", "MA", "MSc", "MCom"};
        // here we pass courses in JComboBox to show all string value in dropdown list
        cbeducation = new JComboBox(courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setFont(new Font("poppins", Font.BOLD, 15));
        // textfield is showing on which position of frame we set here
        cbeducation.setBounds(600, 300, 170, 30);
        add(cbeducation);

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

        // here textField is use to craet a box to tke input from the admin
        // "tffname" stands for father name of an employee to take input father name of an employee
        tfaadhar = new JTextField();
        // textfield is showing on which position of frame we set here
        tfaadhar.setBounds(600, 350, 170, 30);
          tfaadhar.setFont(new Font("poppins", Font.BOLD, 15));
        add(tfaadhar);

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
        lblempId = new JLabel(" " + number);
        lblempId.setBounds(200, 400, 190, 30);
        lblempId.setFont(new Font("poppins", Font.BOLD, 19));
        add(lblempId);

        // here we use button to add details's of employees in databases-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        add = new JButton("Add Detail's");
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
            // to get the detail's of employee by diffrent box we wtrite
            String name = tfname.getText();
            String fname = tffname.getText();
            // to get the date we use .getDateEditor.getUiComponent().getText() then it will give date
            // but .getText() will run in the JTextField so we converted into JTextFileld by type casting
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfdesignation.getText();
            // .getSelectedItem() will return a object that we choose from combo box 
            // but it will store in string fromat so we will type casting to String
            String aadhar = tfaadhar.getText();
            String empId = lblempId.getText();

            try {
                Conn conn = new Conn();
                //   here we insert the value's of employee's
                // here we use single inverted coma because we take value in varchar format and it take in ( ' ' )
                // remember your value should be in same order that you write in databases 
                String query = "insert into employee values('" + name + "', '" + fname + "', '" + dob + "', '" + salary + "', '" + address + "', '" + phone + "', '" + email + "', '" + education + "', '" + designation + "', '" + aadhar + "', '" + empId + "')";
                // then we creat conn object to execute the query
                // it is a dml so we use .executeUpdtae()
                conn.s.executeUpdate(query);
                // After sucessfully inserted data we show a message using JOptionPane
                JOptionPane.showMessageDialog(null, "Details added successfully");
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
        new AddEmployee();
    }
}
