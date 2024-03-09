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
