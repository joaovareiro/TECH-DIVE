package market.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import market.entities.Employee;

public class EmployeeDAO {
	private Connection conn;

	public EmployeeDAO(Connection conn) {
		this.conn = conn;
	}
	
	public List<Employee> list() throws SQLException {
		List<Employee> employees = new ArrayList<>();
		try(Statement statement = conn.createStatement()){
		statement.execute("select id_funcionario,nome_funcionario,cpf_funcionario,fk_id_funcionario from funcionario");
	
		try (ResultSet resultSet = statement.getResultSet()) {
			while (resultSet.next()) {
				Employee employee = new Employee(resultSet.getString("nome_funcionario"),resultSet.getString("cpf_funcionario"));
				employee.setId_employee(resultSet.getLong("id_funcionario"));
				employee.setFk_id_manager(resultSet.getLong("fk_id_funcionario"));
				employees.add(employee);
			}
		}
		return employees;
		}
	}

}
