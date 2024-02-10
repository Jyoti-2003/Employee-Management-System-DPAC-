package employee.management.system;
// JFrame class was access by this Package [ javax.swing.* ]

import javax.swing.*;
// To use Image class we import awt package
import java.awt.*;
// to use ActionListener class we import awt.event.*
import java.awt.event.*;

// Here we extend a JFrame class 
// here we implement a ActionListener class to use mouse click event in add,update,view,remove button's
public class Home extends JFrame implements ActionListener {

    // here we globally declare JButtons for ActionPerformed() can access it 
    JButton view, update, add, remove;

    // CONSTRUCTOR
    Home() {
        // We Creat a frame according to the image
        // whole image will fit to the frame
        setSize(1120, 630);
        setVisible(true);
        // Then we set the location of frame that will be display on window in a nparticular position
        setLocation(250, 50);
                // It will set the title of the frame
        setTitle("Employee Mangement System(DPAC)");

        // To don't use swing Layout we set Layout Null 
        setLayout(null);
        // This code will use for image chages on a frame --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //17
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("home.jpg"));
        //18
        // Here we scaling a image that means we adjust the image ie. small or big
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        //19 
        //22
        ImageIcon i3 = new ImageIcon(i2);
        //20
        JLabel image = new JLabel(i3);
        //21 Here you just copy and paste the scaling of image in last two value
        // First two value will be 0 because we want to image will be show at the starting of the frame
        image.setBounds(0, 0, 1120, 630);
        //20
        add(image);

        //      This code will use  for add heading and changes like-font color,style etc.  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//    12
        JLabel heading = new JLabel("Employee Mangement System(DPAC)");
        // It will set heading from the left,top from the frame and last two value will be height and width
        heading.setBounds(560, 20, 600, 40);
        // setFont() is use tos et the font family,Font,font size
        heading.setFont(new Font("TAHOMA", Font.BOLD, 28));
        // .setForeground is use to set the color of font
//        heading.setForeground(Color.DARK_GRAY);
        // To insert heading over the image we call a method add() through image object which is the object JLabel class
        image.add(heading);

        // here we use button to add the employees in databases-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        add = new JButton("Add Employee");
        // we show the button just starting of the label 
        //In the label object 20 top se and 40 is width th total is =60 so we add 20 then add in Bounds
        add.setBounds(650, 80, 150, 40);
        // setFont() is use tos et the font family,Font,font size
        add.setFont(new Font("poppins", Font.BOLD, 15));
        // to add next page open while clicking we write this
        add.addActionListener(this);
        // To insert button over the image we call a method add() through image object which is the object JLabel class
        image.add(add);

        // here we use button to view the employees databases-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        view = new JButton("View Employees");
        // we show the button just starting of the label 
        //650 is width from frame and 150 width of add button so total is =800 so we take extra 20 we take 820 width from the frame
        view.setBounds(820, 80, 150, 40);
        // setFont() is use tos et the font family,Font,font size
        view.setFont(new Font("poppins", Font.BOLD, 15));
        // to add next page open while clicking we write this
        view.addActionListener(this);
        // To insert button over the image we call a method add() through image object which is the object JLabel class
        image.add(view);

        // here we use button to update the employees data in databases-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        update = new JButton("Update Employee");
        // we show the button just starting of the label 
        // 80+40 from the view button 120+20=140 in the 2nd value
        update.setBounds(650, 140, 150, 40);
        // setFont() is use tos et the font family,Font,font size
        update.setFont(new Font("poppins", Font.BOLD, 12));
        // to add next page open while clicking we write this
        update.addActionListener(this);
        // To insert button over the image we call a method add() through image object which is the object JLabel class
        image.add(update);

        // here we use button to remove an employees from databases-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        remove = new JButton("Remove Employee");
        // we show the button just starting of the label 
        // 80+40 from the view button 120+20=140 in the 2nd value and 820 value from view button just under the view button
        remove.setBounds(820, 140, 150, 40);
        // setFont() is use tos et the font family,Font,font size
        remove.setFont(new Font("poppins", Font.BOLD, 12));
        // to add next page open while clicking we write this
        remove.addActionListener(this);
        // To insert button over the image we call a method add() through image object which is the object JLabel class
        image.add(remove);

    }

    // this code will connect
    public void actionPerformed(ActionEvent ae) {
        // here we have 4 type of button in which basis we can differtiate using .getSource through ActionEvent object
        if (ae.getSource() == add) {
            // when we click Add Employee in data bases we go to the AddEmployee file
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == update) {
            // to set the employee detail already in a Update frame we creat a object of ViewEmployee
            // then it will open ViewEmployee frame then we choose a employee by his id and then we click the update button to update the detail's of employee
            setVisible(false);
            new ViewEmployee();

        } //           else     if(ae.getSource() == remove)
        else {
            setVisible(false);
            new RemoveEmployee();
        }
    }

    public static void main(String og[]) {
        // Here we creating a object of Home class
        new Home();
    }
}
