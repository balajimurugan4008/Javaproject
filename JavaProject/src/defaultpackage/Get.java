package defaultpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class Get {
	public static void main(String[]args) throws Exception {
		get();
	}
	public static void get() throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/project";
	String userName="root";
	String password="1110";
	String Query="select *from project.details";
	Connection con=DriverManager.getConnection(url, userName, password);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(Query);
	while(rs.next()) {
		System.out.println("id:"+rs.getInt(1));
		System.out.println("proname:"+rs.getString(2));
		System.out.println("loaction:"+rs.getString(3));
	}
	
con.close();
}}
