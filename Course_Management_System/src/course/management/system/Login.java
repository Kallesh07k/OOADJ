/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    Login(){

        super("Login");

        setBackground(Color.white);
        setLayout(null);

        l1 = new JLabel("Enter Admin Password");
        l1.setBounds(40,20,200,30);
        add(l1);

        t1=new JPasswordField();
        t1.setBounds(40,70,150,30);
        add(t1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("course/management/system/icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,20,150,150);
        add(l3);


        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);

        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setSize(600,300);
        setLocation(500,300);

    }

    public void actionPerformed(ActionEvent ae){

        try{
            conn c1 = new conn();
            String pw = t1.getText();
            
            String q = "adminpw";
            
            if(q.equals(pw)){
                new Admin().setVisible(true);
                setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] arg){
        Login l = new Login();
    }
}