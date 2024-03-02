import java.sql.*;
class a2
{
   public static void main(String args[])
   {
      ResultSet rs=null;
      Connection con=null;
      try
      {
         con=DriverManager.getConnection("jdbc:postgresql://192.168.1.254/ty49","ty49","ty49");
         DatabaseMetaData dbmd=con.getMetaData();
         System.out.println("Database product name="+dbmd.getDatabaseProductName());
         System.out.println("User name="+dbmd.getUserName());
         System.out.println("Database driver name="+dbmd.getDriverName());
         System.out.println("Database driver version="+dbmd.getDriverVersion());
         System.out.println("Database version="+dbmd.getDriverMajorVersion());
         rs=dbmd.getTables(null,null,null,new String[]{"TABLE"});
         System.out.println("List of tables...");
         while(rs.next())
         {
            String tblName=rs.getString("TABLE_NAME");
            System.out.println("Table:"+tblName);
         }
         rs.close();
         con.close();
         
      }
      catch(SQLException e)
      {
         System.out.println("Error"+e.getMessage());
      }
   }
}


