package defaultpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class Insert {
	public static void main(String[]args) throws Exception {
		insert();
	}
	public static void insert() throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/project";
	String userName="root";
	String password="1110";
	String Query="insert into details values(?,?,?)";
	Connection con=DriverManager.getConnection(url, userName, password);
	PreparedStatement pst=con.prepareStatement(Query);
	
	pst.setInt(1, 786);
	pst.setString(2, "jdbc1");
	pst.setString(3,"formalfile");
	
	pst.executeUpdate();
	con.close();
}

}
