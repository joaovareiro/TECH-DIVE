package market.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import market.entities.Manager;
import market.entities.Product;

public class ManagerDAO {
	private Connection conn;

	public ManagerDAO(Connection conn) {
		this.conn = conn;
	}
	
	public Manager getCategoryById(long id) throws SQLException {
		ManagerDAO mDAO = new ManagerDAO(conn);
		List<Manager> lista = mDAO.list();
		for(Manager m : lista) {
			if(m.getId_manager() == id) 
				return m;
		}
		return null;
	}

	public boolean create(String nome_gerente, String cpf_gerente) throws SQLException {
		try (PreparedStatement preparedStatemente = conn
				.prepareStatement("insert into gerente(nome_gerente,cpf_gerente) values (?,?)")) {
			Manager manager = new Manager(nome_gerente, cpf_gerente);
			add(preparedStatemente, manager);

		}
		return false;
	}

	public void add(PreparedStatement prepareStatement, Manager manager) throws SQLException {
		prepareStatement.setString(1, manager.getNome_manager());
		prepareStatement.setString(2, manager.getCpf_manager());
		prepareStatement.execute();
	}

	public boolean delete(int id) {
		try {

			String sql = "delete from gerente where id_gerente = ?";
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setInt(1, id);
			prepareStatement.execute();

			int updateCount = prepareStatement.getUpdateCount();

			if (updateCount == 0) {
				System.out.println("Gerente não encontrado no banco.");
				return false;
			} else {
				System.out.println("Gerente deletado com sucesso");
				return false;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao deletar um Gerente. Causado por: " + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	public void getByID(int id) throws SQLException {
		String sql = "select id_gerente,nome_gerente,cpf_gerente from gerente where id_gerente = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		preparedStatement.execute();
		int cont = 0;
		try (ResultSet resultSet = preparedStatement.getResultSet()) {
			while (resultSet.next()) {
				Manager manager = new Manager(resultSet.getString("nome_gerente"), resultSet.getString("cpf_gerente"));
				manager.setId_manager(resultSet.getLong("id_gerente"));
				System.out.println(manager.toString());
				cont++;
			}
		}
		if (cont == 0) {
			System.out.println("O gerente com esse ID não foi encontrado no Banco de Dados");
		}
	}

	public void getByName(String name) throws SQLException {
		String sql = "select id_gerente,nome_gerente,cpf_gerente from gerente where nome_gerente = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setString(1, name);
		preparedStatement.execute();
		int cont = 0;
		try (ResultSet resultSet = preparedStatement.getResultSet()) {
			while (resultSet.next()) {
				Manager manager = new Manager(resultSet.getString("nome_gerente"), resultSet.getString("cpf_gerente"));
				manager.setId_manager(resultSet.getLong("id_gerente"));
				System.out.println(manager.toString());
				cont++;
			}
		}
		if (cont == 0) {
			System.out.println("O gerente com esse nome não foi encontrado no Banco de Dados");
		}
	}

	public List<Manager> list() throws SQLException {
		List<Manager> managers = new ArrayList<>();
		try (Statement statement = conn.createStatement()) {
			statement.execute("select id_gerente,nome_gerente,cpf_gerente from gerente");

			try (ResultSet resultSet = statement.getResultSet()) {
				while (resultSet.next()) {
					Manager manager = new Manager(resultSet.getString("nome_gerente"),
							resultSet.getString("cpf_gerente"));
					manager.setId_manager(resultSet.getLong("id_gerente"));
					managers.add(manager);
				}
			}
			return managers;
		}
	}

}
