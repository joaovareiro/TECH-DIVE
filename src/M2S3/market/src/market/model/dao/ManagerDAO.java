package market.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import market.entities.Manager;

public class ManagerDAO {
	private Connection conn;

	public ManagerDAO(Connection conn) {
		this.conn = conn;
	}
	
	public List<Manager> list() throws SQLException {
		List<Manager> managers = new ArrayList<>();
		try(Statement statement = conn.createStatement()){
		statement.execute("select id_gerente,nome_gerente,cpf_gerente from gerente");
	
		try (ResultSet resultSet = statement.getResultSet()) {
			while (resultSet.next()) {
				Manager manager = new Manager(resultSet.getString("nome_gerente"),resultSet.getString("cpf_gerente"));
				manager.setId_manager(resultSet.getLong("id_gerente"));
				managers.add(manager);
			}
		}
		return managers;
		}
	}

}
