package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Driver;

public class Dbconnection {
	static String server = "10.1.9.101";
	static String dataBase = "UAT_TAYADES_SLIMS";
	static String userName = "slims";
	static String password = "Suvarna@123";
	static String port = "45999";
	static String url = "jdbc:sqlserver://"+server
			            +";databaseName="+dataBase
			            +";encrypt=false"
			            +";trustServerCertificate=true";
			            
    	public static Connection connection() throws Throwable {
    		return DriverManager.getConnection(url, userName, password);

	}
    	public static List<String> getStringvalue() throws Throwable {
    		Connection connection = connection();
    		Statement stmt = connection.createStatement();
            String query1 = "SELECT SERVICE_CD FROM SERVICE WHERE IS_FOREIGN_SERVICE<>'Y' AND RECORD_STATUS='A'";

    		ResultSet rs = stmt.executeQuery(query1);
    		List<String> servicecodes = new ArrayList<>();
    		while(rs.next()) {
    			String code =  rs.getString("service_cd");
    			servicecodes.add(code);	
    		}
    		System.out.println("total services" + servicecodes.size());
    		rs.close();
    		stmt.close();
    		connection.close();
    		return servicecodes;
    	}
    	public ResultSet sampleCollection() throws Throwable {
    		Connection connection = connection();
    		Statement stmt = connection.createStatement();
    		String query1 = "\r\n"
    				+ "\r\n"
    				+ "  SELECT distinct bill_no FROM FO_BILL FB\r\n"
    				+ "  INNER JOIN FO_BILL_SRV FBS ON (FBS.BILL_ID=FB.BILL_ID)\r\n"
    				+ "  WHERE FBS.SERVICE_STATUS='B' AND CAST(FB.BILL_DT AS DATE) = CASt(GETDATE() AS DATE); ";
    		ResultSet bill_number = stmt.executeQuery(query1);
    		List<String> billNumber = new ArrayList<String>();
    		while(bill_number.next()) {
    			String billno = bill_number.getString("bill_no");
    			billNumber.add(billno);
    			
    		}
			return bill_number;
    	}
    	public static void main(String[] args) throws Throwable {
    		Dbconnection db = new Dbconnection();
    		List<String> services=db.getStringvalue();
    		System.out.println(services);
    	}

}
