import java.sql.*;
class a3
{
   public static void main(String args[])
   {
      ResultSet rs=null;
      Connection con=null;
      Statement stm=null;
      try
      {
         con=DriverManager.getConnection("jdbc:postgresql://192.168.1.254/ty49","ty49","ty49");
         stm=con.createStatement();
         rs=stm.executeQuery("Select * from Donor");
         ResultSetMetaData rsmd=rs.getMetaData();
         int n=rsmd.getColumnCount();
         for(int i=1;i<=n;i++)
         {
            System.out.println("Column No:"+i);
            System.out.println("Column Name:"+rsmd.getColumnName(i));
            System.out.println("Column Type:"+rsmd.getColumnTypeName(i));
            System.out.println("Column size:"+rsmd.getColumnDisplaySize(i));
         }
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
OUTPUT
ty23@pc20:~/JAVA2/Assignment3$ javac setA3.java
ty23@pc20:~/JAVA2/Assignment3$ java -cp .:/data/jdbc/psql.jar setA3
Column No:1
Column Name:donor_id
Column Type:int4
Column size:11
Column No:2
Column Name:name
Column Type:varchar
Column size:50
Column No:3
Column Name:bloodgroup
Column Type:varchar
Column size:50
Column No:4
Column Name:age
Column Type:int4
Column size:11
ty23@pc20:~/JAVA2/Assignment3$ 



-- create table donor(did int, dname char(22),daddr varchar(22));

-- insert into donor VALUES(1,'AAA','zzz');
-- insert into donor VALUES(2,'BBB','yyy');
-- insert into donor VALUES(3,'CCC','xxx');
-- insert into donor VALUES(4,'DDD','www');

SELECT * from donor;
*/
