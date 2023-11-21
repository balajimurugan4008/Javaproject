package defaultpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class Update {
	public static void main(String[]args) throws Exception{
		update();
	}
	public static void update() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/project";
		String userName="root";
		String password="1110";
		String Query="update details set id =342 where proname='jdbc'";
		Connection con=DriverManager.getConnection(url, userName, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
		
	}
	

}
