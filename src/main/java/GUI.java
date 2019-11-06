/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
/**
 *
 * @author Monika
 */
public class GUI extends Frame{
    private TextField fName;
    private TextField lName;
    private TextField bDate;
    private TextField email;
    private TextField contactNum;
    private TextField address;
    private Button photoBtn;
    private Button resetBtn;
    private Button saveBtn;

    public GUI(String name){
        setLayout(new FlowLayout());
        add(new Label("First Name"));
        fName = new TextField(10);
        add(fName);
        add(new Label("Last Name"));
        lName = new TextField(10);
        add(lName);
        add(new Label("Birthdate"));
        bDate = new TextField(10);
        add(bDate);
        add(new Label("Email"));
        email = new TextField(10);
        add(email);
        add(new Label("Contact Number"));
        contactNum = new TextField(10);
        add(contactNum);
        add(new Label("Address"));
        address = new TextField(10);
        add(address);
        photoBtn = new Button("Upload Photo");
        add(photoBtn);
        resetBtn = new Button("Reset");
        add(resetBtn);
        saveBtn = new Button("Save");
        add(saveBtn);
        setTitle(name);
        setSize(425,250);
        setVisible(true);
    }
    
    public static void main(String[] args){
        GUI addUser = new GUI("Add User");
        GUI updateUser = new GUI("Update User");
    }
}
