import java.sql.*;
public class JdbcDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","030328");
            Statement s = con.createStatement();
            String s1 = ("Create table student(id int,name varchar(50),int marks)");
            s.executeUpdate(s1);
            s.executeUpdate("insert into student values(1,'sagar',99) ");
            s.executeUpdate("insert into student values(2,'sameer',78) ");
            int result = s.executeUpdate("update student set marks=70 where id=1");
            ResultSet rs = s.executeQuery("select * from student");
            while(rs.next()){
            int result1 = s.executeUpdate("delete from student where id=2");
            while(rs.next()){
                System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getInt(3));
            }
            System.out.println(result1 + "records affected");
            con.close();
            }
            }catch (Exception e){
            System.out.println(e);
        }
    }
    
}
