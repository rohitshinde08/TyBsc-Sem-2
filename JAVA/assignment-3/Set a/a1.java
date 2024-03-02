import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
class a1
{
   public static void main(String args[])
   {
      Connection con=null;
      Statement  stm=null;
      ResultSet rs=null;
      try
      {
         con=DriverManager.getConnection("jdbc:postgresql://192.168.1.254/ty49","ty49","ty49");
         stm=con.createStatement();
         JFrame frame=new JFrame("Project");
         JTable table=new JTable();
         DefaultTableModel model=new DefaultTableModel(new Object[]{"p_id","p_name","p_description","p_status"},0);
         rs=stm.executeQuery("Select * from Project");
         while(rs.next())
         {
            int id=rs.getInt("p_id");
            String Name=rs.getString("p_name");
            String des=rs.getString("p_description");
            String Status=rs.getString("p_status");
            model.addRow(new Object[]{id,Name,des,Status});
         }
         table.setModel(model);
         JScrollPane sp=new JScrollPane(table);
         frame.add(sp);
         frame.pack();
         frame.setVisible(true);
         rs.close();
         stm.close();
         con.close();
         
      }
      catch(SQLException e)
      {
         System.out.println("Error"+e.getMessage());
      }
   }
}
/*

-- create table project(p_id int primary key, p_name char(34),p_description char(56),p_status char(34));

-- INSERT INTO project VALUES(1,'abc','java project','completed');
-- INSERT INTO project VALUES(2,'kpl','php project','completed');
-- INSERT INTO project VALUES(3,'lmn','c project','completed');
-- INSERT INTO project VALUES(4,'xyz','ruby project','completed');
SELECT * FROM project;

-- delete FROM project where p_id >=7;


*/
