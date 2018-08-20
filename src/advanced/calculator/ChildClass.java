package advanced.calculator;

import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;



public class ChildClass extends JFrame
{
    public String text;
    public JFrame frame;
    public JPanel panel;
            
    public JTextField txtBox;
    public JButton btn1;
    public JButton btn2;
    public JButton btn3;
    public JButton btn4;
    public JButton btn5;
    public JButton btn6;
    public JButton btn7;
    public JButton btn8;
    public JButton btn9;
    public JButton btn0;
            
    public JButton btnAdd;
    public JButton btnSub;
    public JButton btnMul;
    public JButton btnDiv;
            
    public JButton btnEqual;
    public JButton btnClear;
            
      public ChildClass()
      {
          
            frame=new JFrame("Calculator");
            panel=new JPanel(new FlowLayout());
            txtBox=new JTextField(20);
            text="";
            
            JButton btn1=new JButton("1");
            JButton btn2=new JButton("2");
            JButton btn3=new JButton("3");
            JButton btn4=new JButton("4");
            JButton btn5=new JButton("5");
            JButton btn6=new JButton("6");
            JButton btn7=new JButton("7");
            JButton btn8=new JButton("8");
            JButton btn9=new JButton("9");
            JButton btn0=new JButton("0");
            
            JButton btnAdd=new JButton("+");
            JButton btnSub=new JButton("-");
            JButton btnMul=new JButton("*");
            JButton btnDiv=new JButton("/");
            
            JButton btnEqual=new JButton("=");
            JButton btnClear=new JButton("C");
            
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(250,200);
            frame.setVisible(true);
            
            frame.add(panel);
            
            panel.add(txtBox);
            panel.add(btn1);
            panel.add(btn2);
            panel.add(btn3);
            panel.add(btn4);
            panel.add(btn5);
            panel.add(btn6);
            panel.add(btn7);
            panel.add(btn8);
            panel.add(btn9);
            panel.add(btn0);
            panel.add(btnAdd);
            panel.add(btnSub);
            panel.add(btnMul);
            panel.add(btnDiv);
            panel.add(btnClear);
            panel.add(btnEqual);
            theHandler obj=new theHandler();
            txtBox.addActionListener(obj);
            btn1.addActionListener(obj);
            btn2.addActionListener(obj);
            btn3.addActionListener(obj);
            btn4.addActionListener(obj);
            btn5.addActionListener(obj);
            btn6.addActionListener(obj);
            btn7.addActionListener(obj);
            btn8.addActionListener(obj);
            btn9.addActionListener(obj);
            btn0.addActionListener(obj);
            btnAdd.addActionListener(obj);
            btnSub.addActionListener(obj);
            btnMul.addActionListener(obj);
            btnDiv.addActionListener(obj);
            btnEqual.addActionListener(obj);
            btnClear.addActionListener(obj);
            
      }
      private class theHandler implements ActionListener
      {
        private int required_operation=0;
        public double num1,num2,result=0;
        public String s1="";
        public String s2="";
        public void actionPerformed(ActionEvent event)
        { 
            text+=event.getActionCommand();
            txtBox.setText(text);
            if(text.contains("+"))
            {
                required_operation=1;
               // text=text.substring(0,(text.length()-1));
                //s1+=text;
                s1=text.substring(0,(text.length()-1));
                num1=Double.valueOf(s1);
                System.out.println(num1);
                text="";
            }
            
            if(text.contains("-"))
            {
                required_operation=2;
//                text=text.substring(0,(text.length()-1));
//                s1+=text;
                s1=text.substring(0,(text.length()-1));
                num1=Double.valueOf(s1);
                System.out.println(num1);
                text="";
            }
            
            if(text.contains("="))
            {
                String s2="";
                s2=text.substring(0,(text.length()-1));
                num2=Double.valueOf(s2);
                System.out.println(num2);
                text="";
                calculate();
                
            }
            
            if(text.contains("C"))
            {
                text="";
            }
        }
        public void calculate()
        {
            if(required_operation==1)
            {
                result=num1+num2;
                System.out.println(result);
                String final_result="";
                final_result+=num1+"+"+num2+"="+result;
                txtBox.setText(final_result);
            }
            else if(required_operation==2)
            {
                result=num1-num2;
                System.out.println(result);
                String final_result="";
                final_result+=num1+"-"+num2+"="+result;
                txtBox.setText(final_result);
            }
        }
      }
}
