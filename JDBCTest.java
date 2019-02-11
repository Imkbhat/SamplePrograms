import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCTest {
	public static void main(String[] args) throws Exception {
	
	Connection  con =null;
	Statement st = null;
	ResultSet rs = null;

		try {
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/nmc_prod", "postgres","postgres");
		st = con.createStatement();
		st.execute("set search_path to nmc");
		String sql = "SELECT * FROM patient_registration LIMIT 100";
		rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.print("Mr no :"+rs.getString("mr_no"));
			System.out.print("  Visit Id :"+rs.getString("patient_id"));
			System.out.print("\n");
		   }
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally{
			con.close();
			st.close();
			rs.close();
		}
	}
}
