package market.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import market.entities.Category;
import market.entities.Product;

public class ProductDAO {
	private static Connection conn;

	public ProductDAO(Connection conn) {
		this.conn = conn;
	}

	public boolean create(String nome_produto, String descricao_produto, double preco_produto, int fk_id_categoria) {
		try (PreparedStatement preparedStatement = conn.prepareStatement(
				"insert into produto(nome_produto, descricao,preco_produto,fk_id_categoria) values (?,?,?,?)");) {
			CategoryDAO cDAO = new CategoryDAO(conn);
			Category testefk = cDAO.getCategoryById(fk_id_categoria);
			if (testefk == null) {
				System.out.println("A categoria que foi inserida não foi encontrada no banco de dados");
			} else {
				Product product = new Product(nome_produto, descricao_produto, preco_produto, fk_id_categoria);
				add(preparedStatement, product);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao criar produto. Causado por: " + e.getMessage());
			e.printStackTrace();
		}

		return false;
	}

	public void add(PreparedStatement preparedStatement, Product product) throws SQLException {
		preparedStatement.setString(1, product.getName());
		preparedStatement.setString(2, product.getDescription());
		preparedStatement.setDouble(3, product.getPrice());
		preparedStatement.setInt(4, product.getFk_category_id());
		preparedStatement.execute();
	}

	
	public boolean delete(int id) {
		try {

			String sql = "delete from produto where id = ?";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.execute();

			int updateCount = preparedStatement.getUpdateCount();

			if (updateCount == 0) {
				System.out.println("Produto não encontrado no banco.");
				return false;
			} else {
				System.out.println("Produto deletado com sucesso");
				return false;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao deletar um produto. Causado por: " + e.getMessage());
			e.printStackTrace();
			return false;

		}
	}

	public boolean updatePreco(double novo_preco, int id) throws SQLException {
		try {
			String sql = "update produto set preco_produto = ? where id = ?";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setDouble(1, novo_preco);
			preparedStatement.setInt(2, id);
			preparedStatement.execute();

			int updateCount = preparedStatement.getUpdateCount();

			if (updateCount == 0) {
				System.out.println("Produto não encontrado no banco.");
				return false;
			} else {
				System.out.println("O produto teve seu preco alterado com sucesso");
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao alterar preco do produto. Causado por: " + e.getMessage());
			e.printStackTrace();
			return false;

		}
	}

	public void getByID(int id) throws SQLException {
		String sql = "select id,nome_produto,descricao,preco_produto,fk_id_categoria from produto where id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		preparedStatement.execute();
		int cont = 0;
		try (ResultSet resultSet = preparedStatement.getResultSet()) {
			while (resultSet.next()) {
				Product product = new Product(resultSet.getString("nome_produto"), resultSet.getString("descricao"),
						resultSet.getDouble("preco_produto"), resultSet.getInt("fk_id_categoria"));
				product.setId(resultSet.getInt("id"));
				System.out.println(product.toString());
				cont++;
			}
		}
		if (cont == 0) {
			System.out.println("O produto com esse ID não foi encontrado no Banco de Dados");
		}
	}

	public void getByName(String name) throws SQLException {
		String sql = "select id,nome_produto,descricao,preco_produto,fk_id_categoria from produto where nome_produto = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setString(1, name);
		preparedStatement.execute();
		int cont = 0;
		try (ResultSet resultSet = preparedStatement.getResultSet()) {
			while (resultSet.next()) {
				Product product = new Product(resultSet.getString("nome_produto"), resultSet.getString("descricao"),
						resultSet.getDouble("preco_produto"), resultSet.getInt("fk_id_categoria"));
				product.setId(resultSet.getInt("id"));
				System.out.println(product.toString());
				cont++;
			}
		}
		if (cont == 0) {
			System.out.println("O produto com esse ID não foi encontrado no Banco de Dados");
		}
	}

	public List<Product> list() throws SQLException {
		String sql = "select id,nome_produto,descricao,preco_produto,fk_id_categoria from produto";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.execute();
		List<Product> products = new ArrayList<>();
		try (ResultSet resultSet = preparedStatement.getResultSet()) {
			while (resultSet.next()) {
				Product product = new Product(resultSet.getString("nome_produto"), resultSet.getString("descricao"),
						resultSet.getDouble("preco_produto"), resultSet.getInt("fk_id_categoria"));
				product.setId(resultSet.getInt("id"));
				products.add(product);
			}
		}
		return products;
	}

}
