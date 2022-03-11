package market.application;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import market.connection.FactoryConnection;
import market.entities.Employee;
import market.model.dao.EmployeeDAO;

public class Program {
	public static void main(String[] args) throws SQLException {
		FactoryConnection factoryConnection = new FactoryConnection();
		Connection conn = factoryConnection.openConnection();
		System.out.println("Conexao aberta");
		try {
			EmployeeDAO eDAO = new EmployeeDAO(conn);
			List<Employee>employees = eDAO.list();
			employees.stream().forEach(e -> System.out.println(e.toString()));
			
		} catch (SQLException e) {
			System.out.println("Erro ao se conectar ao banco de dados. Causa por: " + e.getMessage());
			e.printStackTrace();
		}
	}
}

