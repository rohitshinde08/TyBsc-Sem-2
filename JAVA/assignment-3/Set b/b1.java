import java.sql.*;
import java.util.*;
class b1
{
   public static void main(String args[])
   {
      ResultSet rs=null;
      Connection con=null;
      Statement stm=null;
      PreparedStatement pstm=null;
      try
      {
         con=DriverManager.getConnection("jdbc:postgresql://192.168.1.254/ty36","ty36","ty36");
         stm=con.createStatement();
         Scanner sc=new Scanner(System.in);
         System.out.println("\nMobile Information\n");
         do{
            System.out.println("\n1:Insert\n2:Modify\n3:DElete\n4:Search\n5:View All\n6:Exit\n");
            System.out.println("Enter your choice:");
            int ch=sc.nextInt();
            switch(ch)
            {
               case 1:pstm=con.prepareStatement("insert into Mobile values(?,?,?,?,?,?,?,?,?)");
                      System.out.println("Enter model no:");
                      int mno=sc.nextInt();
                      pstm.setInt(1,mno);
                      sc.nextLine();
                      System.out.println("Enter model name:");
                      String name=sc.nextLine();
                      pstm.setString(2,name);
                      System.out.println("Enter model color:");
                      String color=sc.nextLine();
                      pstm.setString(3,color);
                      System.out.println("Enter sim type:");
                      String stype=sc.nextLine();
                      pstm.setString(4,stype);
                      System.out.println("Enter network type:");
                      String ntype=sc.nextLine();
                      pstm.setString(5,ntype);
                      System.out.println("Enter Battery Capacity:");
                      String battery=sc.nextLine();
                      pstm.setString(6,battery);
                      System.out.println("Enter internal storage:");
                      String storage=sc.nextLine();
                      pstm.setString(7,storage);
                      System.out.println("Enter RAM:");
                      String ram=sc.nextLine();
                      pstm.setString(8,ram);
                      System.out.println("Enter processor type:");
                      String processor=sc.nextLine();
                      pstm.setString(9,processor);
                      int result=pstm.executeUpdate();
                      System.out.println(result+" Record inserted\n");
                      break;
                      
               case 2:int choice=0;
                      while (choice!=3)
                      {
                           System.out.println("1.modify name\n2.modify colour\n3.Exit");
                           choice=sc.nextInt();
                      if (choice==1)
                      {
                         pstm=con.prepareStatement("update mobile set m_name=? where m_id=?");
                         System.out.println("Enter model no for update record:");
                         int no=sc.nextInt();
                         pstm.setInt(2,no);
                         sc.nextLine();
                         System.out.println("Enter updated model name:");
                         String mname=sc.nextLine();
                         pstm.setString(1,mname);
                         int result2=pstm.executeUpdate();
                         System.out.println(result2+" REcord updated\n");
                      }
                      if (choice==2)
                      {
                         pstm=con.prepareStatement("update mobile set m_colour=? where m_id=?");
                         System.out.println("Enter model no for update record:");
                         int no=sc.nextInt();
                         pstm.setInt(2,no);
                         sc.nextLine();
                         System.out.println("Enter updated colour:");
                         String mname=sc.nextLine();
                         pstm.setString(1,mname);
                         int result2=pstm.executeUpdate();
                         System.out.println(result2+" REcord updated\n");
                      }
                      }
                    /*  if (choice==3)
                          break;*/
                     
                      break;
               case 3:pstm=con.prepareStatement("Delete from Mobile where m_id=?");
                      System.out.println("Enter the model no to be deleted:");
                      int m=sc.nextInt();
                      pstm.setInt(1,m);
                      int result3=pstm.executeUpdate();
                      System.out.println(result3+" Record Deleted Successfully");
                      break;
                      
               case 4:pstm=con.prepareStatement("Select * from Mobile where m_id=?");
                      System.out.println("Enter model no for search record:");
                      int mn=sc.nextInt();
                      pstm.setInt(1,mn);
                      rs=pstm.executeQuery();
                      
                      while(rs.next())
                      {
                         System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+
                         rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getString(9)+"\t");
                      }         
                      break;
                      
               case 5:pstm=con.prepareStatement("Select * from Mobile");
                      rs=pstm.executeQuery();
                     
                      while(rs.next())
                      {
                         System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+
                         rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getString(9)+"\t");
                      }
 
                      break;
               case 6:System.exit(1);
                      rs.close();
                      stm.close();
                      pstm.close();
                      con.close();
                      sc.close();
            }
         }
         while(true);
      }
      catch(SQLException e)
      {
         System.out.println("Error"+e.getMessage());
      }
      
   }
}
create table mobile(m_id int primary key, m_name char(34),m_colour char(56),m_sim char(34),m_network char(34),m_battery varchar(15),m_storage varchar(15),m_ram varchar(34),m_processor);
ERROR:  syntax error at or near ")"
LINE 1: ...ar(15),m_storage varchar(15),m_ram varchar(34),m_processor);
                                                                     ^
ty36=> create table mobile(m_id int primary key, m_name char(34),m_colour char(56),m_sim char(34),m_network char(34),m_battery varchar(15),m_storage varchar(15),m_ram varchar(34),m_processor varchar(15);
ty36(> create table mobile(m_id int primary key, m_name char(34),m_colour char(56),m_sim char(34),m_network char(34),m_battery varchar(15),m_storage varchar(15),m_ram varchar(34),m_processor varchar(15));
ty36(> create table mobile(m_id int primary key, m_name varchar(34),m_colour varchar(56),m_sim varchar(34),m_network varchar(34),m_battery varchar(15),m_storage varchar(15),m_ram varchar(34),m_processor);
ty36(> create table mobile(m_id int primary key, m_name varchar(34),m_colour varchar(56),m_sim varchar(34),m_network varchar(34),m_battery varchar(15),m_storage varchar(15),m_ram varchar(34),m_processor varchar(35));
ty36(> ^C
ty36=> create table mobile(m_id int primary key, m_name char(34),m_colour char(56),m_sim char(34),m_network char(34),m_battery varchar(15),m_storage varchar(15),m_ram varchar(34),m_processor);
ERROR:  syntax error at or near ")"
LINE 1: ...ar(15),m_storage varchar(15),m_ram varchar(34),m_processor);
                                                                     ^
ty36=> create table mobile(m_id int primary key, m_name char(34),m_colour char(56),m_sim char(34),m_network char(34),m_battery varchar(15),m_storage varchar(15),m_ram varchar(34),m_processor varchar)^C
ty36=> create table mobile(m_id int primary key, m_name varchar(34),m_colour varchar(56),m_sim varchar(34),m_network varchar(34),m_battery varchar(15),m_storage varchar(15),m_ram varchar(34),m_processor varchar(34));
CREATE TABLE
ty36=> insert into mobile values(1,'oppo','red','airtel','5G','2100h','256GB','16GB','snpadragon'); 
INSERT 0 1
ty36=> insert into mobile values(2,'apple','green','idea','4G','5000h','512GB','8GB','snpadragon'); 
INSERT 0 1
ty36=> insert into mobile values(3,'realme','white','vi','3G','3500h','512GB','32GB','mac') 
ty36-> insert into mobile values(4,'samsung','gold','jio','4G','5000h','512GB','164GB','snap'); 
ERROR:  syntax error at or near "insert"
LINE 2: insert into mobile values(4,'samsung','gold','jio','4G','500...
        ^
ty36=> insert into mobile values(3,'realme','white','vi','3G','3500h','512GB','32GB','mac') 
insert into mobile values(4,'samsung','gold','jio','4G','5000h','512GB','164GB','sn^Z
[1]+  Stopped                 psql -h 192.168.1.254 -U ty36
ty36@pc38:~/roll no 36/JAVA-2/assignment-3$ psql -h 192.168.1.254 -U ty36
Password for user ty36: 
psql (13.8 (Debian 13.8-0+deb11u1))
SSL connection (protocol: TLSv1.3, cipher: TLS_AES_256_GCM_SHA384, bits: 256, compression: off)
Type "help" for help.

ty36=> select * from mobile
ty36-> ;
 m_id | m_name | m_colour | m_sim | m_network | m_battery | m_storage | m_ram | m_processor 
------+--------+----------+-------+-----------+-----------+-----------+-------+-------------
    4 | iphone | black    | 3     | 4G        | 5000h     | 126GB     | 8GB   | snap
    2 | varad  | green    | idea  | 4G        | 5000h     | 512GB     | 8GB   | snpadragon
(2 rows)

ty36=> \q
