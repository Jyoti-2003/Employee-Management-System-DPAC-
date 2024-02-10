package employee.management.system;

import javax.swing.*;
//11 this no. belongs to Flash.java file
import java.awt.*;
//4.1
import java.awt.event.*;

import java.sql.*;

//1.1
public class Login extends JFrame implements ActionListener {

    // we declare the varibale globally 6.2
    JTextField User2, Password2;

    Login() {
        // This code will use for fgrames changes   ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //        7 this no. belongs to Flash.java file
        setSize(600, 300);
//        8 this no. belongs to Flash.java file
        setVisible(true);
//        9 this no. belongs to Flash.java file
        setLocation(450, 200);
//        10 this no. belongs to Flash.java file
        getContentPane().setBackground(Color.WHITE);
                // It will set the title of the frame
        setTitle("Employee Mangement System(DPAC)");

        //      Tgis code will use  for heading changes like-font color,style etc.  ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //13    this no. belongs to Flash.java file
        setLayout(null);
        // This code will use for only username ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // to take input from the user 1.user name  2. password
//        12    this no. belongs to Flash.java file
        JLabel User1 = new JLabel("UserName");
        //15  this no. belongs to Flash.java file
        User1.setFont(new Font("poppins", Font.BOLD, 20));
//        14    this no. belongs to Flash.java file
        User1.setBounds(40, 50, 200, 30);
        //        12    this no. belongs to Flash.java file
        add(User1);

        //3.1
        User2 = new JTextField();
        // here we setFont() to change th efont size of textfield box fonts
        User2.setFont(new Font("poppins", Font.BOLD, 17));
        // the left sight is does not same with "UserName" because it will overlap with this
        User2.setBounds(150, 50, 170, 30);
        add(User2);

        // This code will use for only password ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //        12    this no. belongs to Flash.java file
        JLabel Password1 = new JLabel("Password");
//        14    this no. belongs to Flash.java file
//         here we will change the Bounds of password word 
        Password1.setBounds(40, 100, 100, 30);
        //15  this no. belongs to Flash.java file
        Password1.setFont(new Font("poppins", Font.BOLD, 20));
        //        12    this no. belongs to Flash.java file
        add(Password1);

        //3.1
        Password2 = new JTextField();
        // here we setFont() to change th efont size of textfield box fonts
        Password2.setFont(new Font("poppins", Font.BOLD, 17));
        // the left sight is does not same with "UserName" because it will overlap with this
        Password2.setBounds(150, 100, 170, 30);
        add(Password2);

        // Tbis code will use for adding button in the front page --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //23  this no. belongs to Flash.java file
        JButton Login = new JButton("Login");
        //24  this no. belongs to Flash.java file
        // here qwe can change the Bounds according to TextField size
        Login.setBounds(150, 180, 170, 35);
//        26  this no. belongs to Flash.java file
        Login.setBackground(Color.BLACK);
        Login.setForeground(Color.WHITE);
//        27  this no. belongs to Flash.java file
        Login.setFont(new Font("poppins", Font.BOLD, 22));
        //4.1
        Login.addActionListener(this);
//25
//      we can directly add to the frame with out any image call
        add(Login);

        // This code will use for image chages on a frame ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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
        j.setBounds(350, 20, 200, 200);
        //20 this no. belongs to Flash.java file
        add(j);

    }

    // Code-1   -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // this code will connect Flash.java file to Login.java file through ClickHere button
    // And it is use for extract the value UserName,Pasword from the Login file
    public void actionPerformed(ActionEvent ae) {
        try {
            String username = User2.getText();
            String password = Password2.getText();

            Conn c = new Conn();
            //   inverted username is belongs to database username and same with password
            String query = "select * from login where username = '" + username + "' and password = '" + password + "'";

            //9.2
            ResultSet rs = c.s.executeQuery(query);
            if (rs.next()) {
                setVisible(false);
//                // if query is sucessful run then we open a next class Home [Home.java file]
//                // By creating object of Home class
//                new Home();
     setVisible(false);
                new Home();
            }// If values is not correct then we show Invalid Login 9.3
            else {
                // to show the pop up we JOptionPane
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                // then we just need to close this by using setVsible(false);
                setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] fo) {
//        2.1
        new Login();
    }
}
