import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
class InvalidBirthDateException extends Exception
{
  String msg="Invalid Date Exception";
  public String toString()
  {
     return msg;
  }
}
public class setB2 extends JFrame implements ActionListener
{
   JTextField aadhar,byear,phone,hosp;
   JPanel p1,p2,p3,p4;
   JButton add,update,delete,view,search;
   JRadioButton r1,r2,r3,r4,r5,r6,r7,r8;
   ButtonGroup bg,bg1,bg2; 
   JComboBox hos;
   String s[]={"criticare hospital","Tambe hospital","Sahyadri hospital"};
   setB2()
   {
      setTitle("Cowin Registration");
      setSize(800,600);
      setLayout(new GridLayout(8,2,40,40));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JLabel aadharno=new JLabel("Aadhar card number");
      add(aadharno);
      aadhar=new JTextField(10);
      add(aadhar);
      JLabel Byear=new JLabel("Birth year");
      add(Byear);
      byear=new JTextField(10);
      add(byear);
      JLabel phoneno=new JLabel("Mobile no");
      add(phoneno);
      phone=new JTextField(10);
      add(phone);
      p1=new JPanel();
      p1.setLayout(new FlowLayout());
      JLabel AgeGrp=new JLabel("Age Group");
      add(AgeGrp);
      r1=new JRadioButton("18 & above");
      p1.add(r1);
      r1.setActionCommand("18 & above");
      r2=new JRadioButton("45 & above");
      p1.add(r2);
      r2.setActionCommand("45 & above");
      add(p1);
      JLabel hospital=new JLabel("Select hospital");
      add(hospital);
      hos=new JComboBox(s);
      add(hos);
      p2=new JPanel();
      p2.setLayout(new FlowLayout());
      JLabel vaccine=new JLabel("Vaccines");
      add(vaccine);
      r3=new JRadioButton("Covishield");
      p2.add(r3);
      r3.setActionCommand("Covishield");
      r4=new JRadioButton("Covaxin");
      p2.add(r4);
      r4.setActionCommand("Covaxin");
      r5=new JRadioButton("Sputnik V");
      p2.add(r5);
      r5.setActionCommand("Sputnik V");
      add(p2);
      
      p3=new JPanel();
      p3.setLayout(new FlowLayout());
      JLabel time=new JLabel("Time slot");
      add(time);
      r6=new JRadioButton("Morning");
      p3.add(r6);
      r6.setActionCommand("Morning");
      r7=new JRadioButton("Afternoon");
      p3.add(r7);
      r7.setActionCommand("Afternoon");
      r8=new JRadioButton("Evening");
      p3.add(r8);
      r8.setActionCommand("Evening");
      add(p3);
      
      p4=new JPanel();
      p3.setLayout(new FlowLayout());
      add=new JButton("Add");
      add(add);
      update=new JButton("Update");
      add(update);
      delete=new JButton("Delete");
      add(delete);
      view=new JButton("View");
      add(view);
      search=new JButton("Search");
      add(search);
      
      add.addActionListener(this);
      bg=new ButtonGroup();
      bg.add(r1);
      bg.add(r2);
      bg1=new ButtonGroup();
      bg1.add(r4);
      bg1.add(r3);
      bg1.add(r5);
      bg2=new ButtonGroup();
      bg2.add(r6);
      bg2.add(r7);
      bg2.add(r8);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent ae)
   {
     if(ae.getSource()==add)
     {
        String adharno=(aadhar.getText());
        int year=Integer.parseInt(byear.getText());
        String phNo=(phone.getText());
        String hospital=(String)(hos.getSelectedItem());
        String age=bg.getSelection().getActionCommand();
        String vaccine=bg1.getSelection().getActionCommand();
        String timestamp=bg2.getSelection().getActionCommand();
        try
        {
          if(year==0000)
          {
            throw new InvalidBirthDateException();
          }
          else
          {
             Connection con=null;
             PreparedStatement pstm=null;
      
            try
            {
                con=DriverManager.getConnection("jdbc:postgresql://192.168.1.254/ty23","ty23","ty23");
                pstm=con.prepareStatement("insert into cowin values(?,?,?,?,?,?,?)");
                pstm.setString(1,adharno);
                pstm.setInt(2,year);
                pstm.setString(3,phNo);
                pstm.setString(4,hospital);
                pstm.setString(5,age);
                pstm.setString(6,vaccine);
                pstm.setString(7,timestamp);
                int result=pstm.executeUpdate();
                if(result==1)
                {
                   JOptionPane.showMessageDialog(null,"Successfully Inserted",hospital,JOptionPane.INFORMATION_MESSAGE);
                }
                pstm.close();
                con.close();
          }
          catch(Exception e)
          {
             JOptionPane.showMessageDialog(null,e,"ERROR OCCURED",JOptionPane.ERROR_MESSAGE);
          }
        }
      }
      catch(InvalidBirthDateException e)
      {
         JOptionPane.showMessageDialog(null,e,"ERROR OCCURED",JOptionPane.ERROR_MESSAGE);
      }
    }
  }
  public static void main(String args[])
  {
    new setB2();
  }
}


