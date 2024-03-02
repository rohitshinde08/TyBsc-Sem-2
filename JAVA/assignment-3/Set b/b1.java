
B1



import java.sql.*;
import java.util.*;
class setB1
{
   public static void main(String args[])
   {
      ResultSet rs=null;
      Connection con=null;
      Statement stm=null;
      PreparedStatement pstm=null;
      try
      {
         con=DriverManager.getConnection("jdbc:postgresql://192.168.1.254/ty23","ty23","ty23");
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
               case 2:pstm=con.prepareStatement("update mobile set model_name=? where model_no=?");
                      System.out.println("Enter model no for update record:");
                      int no=sc.nextInt();
                      pstm.setInt(2,no);
                      sc.nextLine();
                      System.out.println("Enter updated model name:");
                      String mname=sc.nextLine();
                      pstm.setString(1,mname);
                      int result2=pstm.executeUpdate();
                      System.out.println(result2+" REcord updated\n");
                      break;
               case 3:pstm=con.prepareStatement("Delete from Mobile where model_no=?");
                      System.out.println("Enter the model no to be deleted:");
                      int m=sc.nextInt();
                      pstm.setInt(1,m);
                      int result3=pstm.executeUpdate();
                      System.out.println(result3+" Record Deleted Successfully");
                      break;
               case 4:pstm=con.prepareStatement("Select * from Mobile where model_no=?");
                      System.out.println("Enter model no for search record:");
                      int mn=sc.nextInt();
                      pstm.setInt(1,mn);
                      rs=pstm.executeQuery();
                      System.out.println("\n----------------------------------------------------------------------------------------\n");
                      while(rs.next())
                      {
                         System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+
                         rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getString(9)+"\t");
                      }
                      System.out.println("\n----------------------------------------------------------------------------------------\n");
                      break;
               case 5:pstm=con.prepareStatement("Select * from Mobile");
                      rs=pstm.executeQuery();
                      System.out.println("\n----------------------------------------------------------------------------------------\n");
                      while(rs.next())
                      {
                         System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+
                         rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getString(9)+"\t");
                      }
                      System.out.println("\n----------------------------------------------------------------------------------------\n");
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
/*
OUTPUT
ty23@pc20:~/JAVA2/Assignment3$ javac setB1.java
ty23@pc20:~/JAVA2/Assignment3$ java -cp .:/data/jdbc/psql.jar setB1

Mobile Information


1:Insert
2:Modify
3:DElete
4:Search
5:View All
6:Exit

Enter your choice:
4
Enter model no for search record:
1004

----------------------------------------------------------------------------------------

1004	IQOO 11	black	nano	5G	5000mh	256GB	16GB	SD 8 gen2	

----------------------------------------------------------------------------------------


1:Insert
2:Modify
3:DElete
4:Search
5:View All
6:Exit

Enter your choice:
5

----------------------------------------------------------------------------------------

1001	poco m4 pro	yellow	macro	5G	3000mh	128GB	8GB	Snapdragon 550	
1003	iPhone14	copper	mini	5G	2500mh	128GB	4GB	SD 8 gen2	
1004	IQOO 11	black	nano	5G	5000mh	256GB	16GB	SD 8 gen2	

----------------------------------------------------------------------------------------


1:Insert
2:Modify
3:DElete
4:Search
5:View All
6:Exit

Enter your choice:
2
Enter model no for update record:
1001
Enter updated model name:
OPPO
1 REcord updated


1:Insert
2:Modify
3:DElete
4:Search
5:View All
6:Exit

Enter your choice:
5

----------------------------------------------------------------------------------------

1003	iPhone14	copper	mini	5G	2500mh	128GB	4GB	SD 8 gen2	
1004	IQOO 11	black	nano	5G	5000mh	256GB	16GB	SD 8 gen2	
1001	OPPO	yellow	macro	5G	3000mh	128GB	8GB	Snapdragon 550	

----------------------------------------------------------------------------------------


1:Insert
2:Modify
3:DElete
4:Search
5:View All
6:Exit

Enter your choice:
1
Enter model no:
5678
Enter model name:
vivo
Enter model color:
red
Enter sim type:
micro
Enter network type:
4G
Enter Battery Capacity:
4500mah
Enter internal storage:
64GB
Enter RAM:
6GB
Enter processor type:
snapdragon 777
1 Record inserted


1:Insert
2:Modify
3:DElete
4:Search
5:View All
6:Exit

Enter your choice:
5

----------------------------------------------------------------------------------------

1003	iPhone14	copper	mini	5G	2500mh	128GB	4GB	SD 8 gen2	
1004	IQOO 11	black	nano	5G	5000mh	256GB	16GB	SD 8 gen2	
1001	OPPO	yellow	macro	5G	3000mh	128GB	8GB	Snapdragon 550	
5678	vivo	red	micro	4G	4500mah	64GB	6GB	snapdragon 777	

----------------------------------------------------------------------------------------


1:Insert
2:Modify
3:DElete
4:Search
5:View All
6:Exit

Enter your choice:
3
Enter the model no to be deleted:
1003
1 Record Deleted Successfully

1:Insert
2:Modify
3:DElete
4:Search
5:View All
6:Exit

Enter your choice:
5

----------------------------------------------------------------------------------------

1004	IQOO 11	black	nano	5G	5000mh	256GB	16GB	SD 8 gen2	
1001	OPPO	yellow	macro	5G	3000mh	128GB	8GB	Snapdragon 550	
5678	vivo	red	micro	4G	4500mah	64GB	6GB	snapdragon 777	

----------------------------------------------------------------------------------------


1:Insert
2:Modify
3:DElete
4:Search
5:View All
6:Exit

Enter your choice:
6
ty23@pc20:~/JAVA2/Assignment3$ 


*/
create table mobile(mno int ,name char(20),color char(20),sim char(20), Battery int, internal int , ram int , pr char(25));

select * from mobile;

