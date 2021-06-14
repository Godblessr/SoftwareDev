package be.kuleuven.groept.softdev.part7.formlayout;

import javax.swing.*;

public class FormLayoutTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
   frame.setLayout(new FormLayout());
   //  frame.setLayout(new GridLayout(6,2));

 //frame.setLayout(new FlowLayout());

      frame.add(new JLabel("Name"));
      frame.add(new JTextField(15));
      frame.add(new JLabel("Address"));
      frame.add(new JTextField(20));
      frame.add(new JLabel("City"));
      frame.add(new JTextField(10));
      frame.add(new JLabel("State"));
      frame.add(new JTextField(2));
      frame.add(new JLabel("ZIP"));
      frame.add(new JTextField(5));
      frame.add(new JLabel("Country"));
      frame.add(new JTextField(10));
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   }
}



