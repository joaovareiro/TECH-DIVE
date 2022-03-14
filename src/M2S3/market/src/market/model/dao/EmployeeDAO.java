package market.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import market.entities.Employee;
import market.entities.Manager;
import market.entities.Product;

public class EmployeeDAO {
	private Connection conn;

	public EmployeeDAO(Connection conn) {
		this.conn = conn;
	}
	
	
	
	public boolean create(String nome_funcionario, String cpf_funcionario, long fk_id_funcionario) throws SQLException {
		try(PreparedStatement preparedStatement = conn.prepareStatement("insert into funcionario(nome_funcionario,cpf_funcionario,fk_id_funcionario) values (?,?,?)")){
			ManagerDAO mDAO = new ManagerDAO(conn);
			Manager testeManager = mDAO.getCategoryById(fk_id_funcionario);
			if(testeManager == null) {
				System.out.println("A id do gerente que foi inserida não foi encontrada no banco de dados");
			}else {
			Employee employee = new Employee(nome_funcionario,cpf_funcionario,fk_id_funcionario);
			add(preparedStatement,employee);
			}
		}
		return false;
	}
	
	public void add(PreparedStatement preparedStatement, Employee employee) throws SQLException {
		preparedStatement.setString(1, employee.getName_employee() );
		preparedStatement.setString(2, employee.getCpf_employee());
		preparedStatement.setLong(3,employee.getFk_id_manager());
		preparedStatement.execute();
	}
	
	public boolean delete(int id) {
		try {

			String sql = "delete from funcionario where id_funcionario = ?";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.execute();

			int updateCount = preparedStatement.getUpdateCount();

			if (updateCount == 0) {
				System.out.println("Funcionario não encontrado no banco.");
				return false;
			} else {
				System.out.println("Funcionario deletado com sucesso");
				return false;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao deletar um Funcionario. Causado por: " + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}
	
	public List<Employee>getEmployeesByManagerID(int id) throws SQLException {
		List<Employee> employees = new ArrayList<>();
		String sql =  "select id_funcionario,nome_funcionario,cpf_funcionario,fk_id_funcionario from funcionario as f inner join gerente as g on f.fk_id_funcionario = g.id_gerente where fk_id_funcionario = ?";
		int cont = 0;
		try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
			preparedStatement.setInt(1, id);
		try (ResultSet resultSet = preparedStatement.executeQuery()) {
			while (resultSet.next()) {
				Employee employee = new Employee(resultSet.getString("nome_funcionario"),resultSet.getString("cpf_funcionario"),resultSet.getLong("fk_id_funcionario"));
				employee.setId_employee(resultSet.getLong("id_funcionario"));
				employee.setFk_id_manager(resultSet.getLong("fk_id_funcionario"));
				employees.add(employee);
				cont++;
			}
		}
		if (cont == 0) {
			System.out.println("O gerente com esse ID não foi encontrado no Banco de Dados");
		}
		return employees;
		}
	}
	
	public List<Employee> list() throws SQLException {
		List<Employee> employees = new ArrayList<>();
		try(Statement statement = conn.createStatement()){
		statement.execute("select id_funcionario,nome_funcionario,cpf_funcionario,fk_id_funcionario from funcionario");
	
		try (ResultSet resultSet = statement.getResultSet()) {
			while (resultSet.next()) {
				Employee employee = new Employee(resultSet.getString("nome_funcionario"),resultSet.getString("cpf_funcionario"),resultSet.getLong("fk_id_funcionario"));
				employee.setId_employee(resultSet.getLong("id_funcionario"));
				employee.setFk_id_manager(resultSet.getLong("fk_id_funcionario"));
				employees.add(employee);
			}
		}
		return employees;
		}
	}



	public void getByID(int idGerente) throws SQLException {
		String sql = "select id_funcionario,nome_funcionario,cpf_funcionario,fk_id_funcionario from funcionario where id_funcionario = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setInt(1, idGerente);
		preparedStatement.execute();
		int cont = 0;
		try (ResultSet resultSet = preparedStatement.getResultSet()) {
			while (resultSet.next()) {
				Employee employee = new Employee(resultSet.getString("nome_funcionario"), resultSet.getString("cpf_funcionario"), resultSet.getLong("fk_id_funcionario"));
				employee.setId_employee(resultSet.getLong("id_funcionario"));
				System.out.println(employee.toString());
				cont++;
			}
		}
		if (cont == 0) {
			System.out.println("O funcionario com esse ID não foi encontrado no Banco de Dados");
		}
	}

	public void getByName(String nome_func) throws SQLException {
		String sql = "select id_funcionario,nome_funcionario,cpf_funcionario,fk_id_funcionario from funcionario where nome_funcionario = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setString(1, nome_func);
		preparedStatement.execute();
		int cont = 0;
		try (ResultSet resultSet = preparedStatement.getResultSet()) {
			while (resultSet.next()) {
				Employee employee = new Employee(resultSet.getString("nome_funcionario"), resultSet.getString("cpf_funcionario"), resultSet.getLong("fk_id_funcionario"));
				employee.setId_employee(resultSet.getLong("id_funcionario"));
				System.out.println(employee.toString());
				cont++;
			}
		}
		if (cont == 0) {
			System.out.println("O funcionario com esse nome não foi encontrado no Banco de Dados");
		}
	}

}
