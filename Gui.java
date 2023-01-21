/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
public class Gui extends JFrame implements ActionListener{

    private JTextField ProductID = new JTextField(10);
    
    private JLabel EnterID = new JLabel("Enter Product ID");
    private JLabel Result = new JLabel("");
    private JButton Click = new JButton("Click");
    private Store storeMange;
    private JTextArea Products = new JTextArea (20,20);
    private JLabel Print;
    public int x;

    private JPanel Panel1 = new JPanel();
    private JPanel Panel2 = new JPanel();
    private JPanel Panel3 = new JPanel();
    private JPanel Panel4 = new JPanel();

    public Gui(Store storeMange) {
        this.storeMange=storeMange;
        setLayout(new java.awt.GridLayout(4,1,10,3));
        Panel3.setLayout(new java.awt.FlowLayout());
        Products.setText(storeMange.toString());
        Panel3.add(Products);
        add(Panel3);
        
        Panel1.setLayout(new java.awt.FlowLayout());
        Panel1.add(EnterID);
        Panel1.add(ProductID);

        
        add(Panel1);
        Panel2.setLayout(new java.awt.FlowLayout());
        Panel2.add(Click);
        add(Panel2);
        
        Panel4.setLayout(new java.awt.FlowLayout());
        Panel4.add(Result);
        add(Panel4);
        
        ProductID.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Manager");
        setSize(500,400);
        setVisible(true);
        Click.addActionListener(this);
    }
  
    @Override
    public void actionPerformed(ActionEvent ae) {
       if (ae.getSource() == (JButton)Click) {
        int PID =Integer.parseInt(ProductID.getText());
        if(storeMange.MangerRemove(PID))
        Result.setText("Removed the product correctly.");
        
        else
            Result.setText("The product can't be removed. Enter an existing product.");
                  }
       Products.setText(storeMange.toString());

    }
    
    
}