/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Monika
 */
public class GUI extends Frame{
//    private JTextField fName;
//    private JTextField lName;
//    private JTextField bDate;
//    private JTextField email;
//    private JTextField contactNum;
//    private JTextField address;
//    private JButton photoBtn;
//    private JButton resetBtn;
//    private JButton saveBtn;

    public GUI(String name){
        JFrame frame=new JFrame("Add User");
        JLabel l1 = new JLabel("First Name");
        l1.setBounds(25,25, 100,30); 
        frame.add(l1);
        JTextField fName = new JTextField();
        fName.setBounds(125,25, 150, 30);
        frame.add(fName);
        JLabel l2 = new JLabel("Last Name");
        l2.setBounds(25,55, 100,30); 
        frame.add(l2);
        JTextField lName = new JTextField();
        lName.setBounds(125,55, 150, 30);
        frame.add(lName);   
        JLabel l3 = new JLabel("Birth Date");
        l3.setBounds(25,85, 100,30); 
        frame.add(l3);
        JTextField bDate = new JTextField();
        bDate.setBounds(125,85, 150, 30);
        frame.add(bDate);   
        JLabel l4 = new JLabel("Email");
        l4.setBounds(25,115, 100,30); 
        frame.add(l4);
        JTextField email = new JTextField();
        email.setBounds(125,115, 150, 30);
        frame.add(email);   
        JLabel l5 = new JLabel("Contact Number");
        l5.setBounds(25,145, 100,30); 
        frame.add(l5);
        JTextField contactNum = new JTextField();
        contactNum.setBounds(125,145, 150, 30);
        frame.add(contactNum); 
        JLabel l6 = new JLabel("Address");
        l6.setBounds(25,175, 100,30); 
        frame.add(l6);
        JTextField address = new JTextField();
        address.setBounds(125,175, 150, 30);
        frame.add(address);      
        JButton photoBtn=new JButton("Upload Photo");
        photoBtn.setBounds(25,205,125, 30);         
        frame.add(photoBtn);
        JButton resetBtn=new JButton("Reset");
        resetBtn.setBounds(25,235,100, 30);         
        frame.add(resetBtn);
        JButton saveBtn=new JButton("Save");
        saveBtn.setBounds(150,235,100, 30);         
        frame.add(saveBtn);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public static void main(String[] args){
        GUI addUser = new GUI("Add User");
        GUI updateUser = new GUI("Update User");
    }
}
