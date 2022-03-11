package market.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import market.entities.Product;

public class ProductDAO {
	private Connection conn;

	public ProductDAO(Connection conn) {
		this.conn = conn;
	}

	public boolean create() {
		try (PreparedStatement prepareStatement = conn
				.prepareStatement("insert into produto(nome_produto, descricao,preco_produto) values (?,?,?)");) {
			Product product = new Product("Geladeira", "Brastemp", 1500);
			add(prepareStatement, product);

		} catch (SQLException e) {
			System.out.println("Erro ao criar produto. Causado por: " + e.getMessage());
			e.printStackTrace();
		}

		return false;
	}

	public void add(PreparedStatement prepareStatement, Product product) throws SQLException {
		prepareStatement.setString(1, product.getName());
		prepareStatement.setString(2, product.getDescription());
		prepareStatement.setDouble(3, product.getPrice());
		prepareStatement.execute();
	}

	public boolean delete(int id) {
		try {

			String sql = "delete from produto where id = ?";
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setInt(1, id);
			prepareStatement.execute();

			int updateCount = prepareStatement.getUpdateCount();

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

	public List<Product> list() throws SQLException {
		Statement statement = conn.createStatement();
		statement.execute("select id,nome_produto,descricao,preco_produto from produto");
		List<Product> products = new ArrayList<>();
		try (ResultSet resultSet = statement.getResultSet()) {
			while (resultSet.next()) {
				Product product = new Product(resultSet.getString("nome_produto"), resultSet.getString("descricao"),
						resultSet.getDouble("preco_produto"));
				product.setId(resultSet.getInt("id"));
				products.add(product);
			}
		}
		return products;
	}

}
