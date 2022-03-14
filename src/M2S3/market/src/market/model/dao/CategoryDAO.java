package market.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import market.entities.Category;

public class CategoryDAO {
	private Connection conn;

	public CategoryDAO(Connection conn) {
		this.conn = conn;
	}
	
	public boolean create(String nome_categoria) throws SQLException {
		try(PreparedStatement preparedStatemente = conn.prepareStatement("insert into categoria(name) values (?)")){
			Category category = new Category(nome_categoria);
			add(preparedStatemente,category);
		}	
		return false;
	}
	
	public void add(PreparedStatement preparedStatement, Category category) throws SQLException {
		preparedStatement.setString(1, category.getName());
		preparedStatement.execute();
	}

	public boolean delete(int id) {
		try {

			String sql = "delete from categoria where id = ?";
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setInt(1, id);
			prepareStatement.execute();

			int updateCount = prepareStatement.getUpdateCount();

			if (updateCount == 0) {
				System.out.println("Categoria não encontrado no banco.");
				return false;
			} else {
				System.out.println("Categoria deletado com sucesso");
				return false;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao deletar um Categoria. Causado por: " + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}
	
	public Category getCategoryById( int id) throws SQLException {
		CategoryDAO cDAO = new CategoryDAO(conn);
		List<Category> lista = cDAO.list();
		for(Category c : lista) {
			if(c.getId() == id) 
				return c;
		}
		return null;
	}
	
	public void getByID(int id) throws SQLException {
		String sql = "select id,name from categoria where id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		preparedStatement.execute();
		int cont = 0;
		try (ResultSet resultSet = preparedStatement.getResultSet()) {
			while (resultSet.next()) {
				Category category = new Category(resultSet.getString("name"));
				category.setId(resultSet.getInt("id"));
				System.out.println(category.toString());
				cont++;
			}
		}
		if (cont == 0) {
			System.out.println("A categoria com esse ID não foi encontrado no Banco de Dados");
		}
	}
	
	public void getByName(String name) throws SQLException {
		String sql = "select id,name from categoria where name = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setString(1, name);
		preparedStatement.execute();
		int cont = 0;
		try (ResultSet resultSet = preparedStatement.getResultSet()) {
			while (resultSet.next()) {
				Category category = new Category(resultSet.getString("name"));
				category.setId(resultSet.getInt("id"));
				System.out.println(category.toString());
				cont++;
			}
		}
		if (cont == 0) {
			System.out.println("A categoria com esse nome não foi encontrado no Banco de Dados");
		}
	}

	public List<Category> list() throws SQLException {
		List<Category> categories = new ArrayList<>();

		try (Statement statement = conn.createStatement()) {
			statement.execute("select id,name from categoria");

			try (ResultSet resultSet = statement.getResultSet()) {
				while (resultSet.next()) {
					Category categoria = new Category(resultSet.getString("name"));
					categoria.setId(resultSet.getInt("id"));
					categories.add(categoria);
				}
			}
			return categories;
		}
	}
}
