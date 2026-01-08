package jdbcTraining;


import java.sql.*;

public class JdbcPro1 {
	
    String url = "jdbc:mysql://localhost:3306/Advjava";
    String userName = "root";
    String password = "Root@111";
   
    
    public void connect() {
    	
    	System.out.println("Connect method exection starts");
    	
        // Create Connection object reference
    	
        try {
            // Load My sql Driver class from jar file
            Class.forName("com.mysql.cj.jdbc.Driver");

            // pasing mysql credentials to the Connection obj ref con
            Connection con = DriverManager.getConnection(url, userName, password);

            System.out.println("Connected Successfully!");
            
            con.close();


        } catch (Exception e) {
            
        	e.printStackTrace();
        }
    }

	public static void main(String[] args) {
		
		JdbcPro1 obj = new JdbcPro1();
		
		obj.connect();
	}

}
