package market.connection;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class FactoryConnection {
	private String jdbcUrl = "jdbc:postgresql://localhost/market?useTimezone=true&serverTimezone=UTC";
	private String user = "postgres";
	private String password = "senhateste";
	
	private DataSource dataSource;

	public FactoryConnection() {
		ComboPooledDataSource comboPooled = new ComboPooledDataSource();
		comboPooled.setJdbcUrl(jdbcUrl);
		comboPooled.setUser(user);
		comboPooled.setPassword(password);
		comboPooled.setMaxPoolSize(10);
		this.dataSource = comboPooled;
	}
	
	public Connection openConnection() throws SQLException {
		return this.dataSource.getConnection();
	}
	
	
	public void closeConnection(Connection conn) throws SQLException {
		conn.close();
	}
}
