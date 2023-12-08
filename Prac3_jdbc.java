//Step 1: import java sql 
import java.sql.*;

public class Prac3_jdbc {
    public static void main(String[] args) {
        try{
            //Step 2: Load and register driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Step 3: Create connection to databse 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kjsp","root", "root@123");
            //Step 4: Create statement object
            Statement s = con.createStatement();
            //Create table
            String table = "Create table emp(eno, ename varchar(20),ebrach varchar(20))";
            s.executeUpdate(table);
            //Step 5: execute querry using statement object 
            //insert value in table
            s.executeUpdate("Insert into emp values(101,'Ash','sells')");
            s.executeUpdate("Insert into emp values(203,'Kiran','marketing')");
            //display result
            //Step 6: Retrieve data from returned resultset object 
            ResultSet rs = s.executeQuery("Select * from emp");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            //delete ash
            s.executeUpdate("delete from emp where eno = 101");
            ResultSet rs2 = s.executeQuery("select * from emp");
            while(rs2.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            //Step 7:close connection
            con.close();


        }catch(Exception e){

        }
    }
    
}
