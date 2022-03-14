package market.application;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import market.entities.Category;
import market.entities.Employee;
import market.entities.Manager;
import market.entities.Product;
import market.model.dao.CategoryDAO;
import market.model.dao.EmployeeDAO;
import market.model.dao.ManagerDAO;
import market.model.dao.ProductDAO;

public class Menu {

	public static void MenuFuncionario(EmployeeDAO eDAO) throws SQLException {
		Scanner sc = new Scanner(System.in);
		int op;
		while (true) {
			System.out.println("""
					Selecione uma opcao:\s
					1 - Adicionar funcionario
					2 - Listar todos os funcionarios
					3 - Deletar um funcionario
					4 - Apresentar informações sobre um funcionario especifico por meio do ID
					5 - Apresentar informações sobre um funcionario especifico por meio do nome
					6 - Listar funcionários associados a um gerente
					7 - Sair do menu de funcionarios """);
			op = sc.nextInt();
			if (op == 1) {
				System.out.println("Digite o nome do funcionario");
				sc.nextLine();
				String nomeGerente = sc.nextLine();
				System.out.println("Digite o cpf do funcionario");
				String cpfGerente = sc.nextLine();
				System.out.println("Digite o id do gerente");
				long idGerente = sc.nextLong();
				eDAO.create(nomeGerente, cpfGerente, idGerente);
			} else if (op == 2) {
				List<Employee> employees = eDAO.list();
				employees.stream().forEach(e -> System.out.println(e.toString()));
			} else if (op == 3) {
				System.out.println("Digite o id do funcionario");
				int idGerente = sc.nextInt();
				eDAO.delete(idGerente);
			} else if (op == 4) {
				System.out.println("Digite o id do funcionario");
				int idGerente = sc.nextInt();
				eDAO.getByID(idGerente);
			} else if (op == 5) {
				System.out.println("Digite o nome do funcionario");
				sc.nextLine();
				String nomeGerente = sc.nextLine();
				eDAO.getByName(nomeGerente);
			} else if (op == 6) {
				System.out.println("Digite o id do gerente");
				int idGerente = sc.nextInt();
				List<Employee> employees = eDAO.getEmployeesByManagerID(idGerente);
				employees.stream().forEach(e -> System.out.println(e.toString()));
			} else if (op == 7) {
				break;
			}
		}
	}

	public static void MenuGerente(ManagerDAO mDAO) throws SQLException {
		Scanner sc = new Scanner(System.in);
		int op;
		while (true) {
			System.out.println("""
					Selecione uma opcao:\s
					1 - Adicionar gerente
					2 - Listar todos os gerentes
					3 - Deletar um gerente
					4 - Apresentar informações sobre um gerente especifico por meio do ID
					5 - Apresentar informações sobre um gerente especifico por meio do nome
					6 - Sair do menu de gerentes """);

			op = sc.nextInt();
			if (op == 1) {
				System.out.println("Digite o nome do gerente");
				sc.nextLine();
				String nomeGerente = sc.nextLine();
				System.out.println("Digite o cpf do gerente");
				String cpfGerente = sc.nextLine();
				mDAO.create(nomeGerente, cpfGerente);
			} else if (op == 2) {
				List<Manager> managers = mDAO.list();
				managers.stream().forEach(m -> System.out.println(m.toString()));
			} else if (op == 3) {
				System.out.println("Digite o id do gerente ");
				int idGerente = sc.nextInt();
				mDAO.delete(idGerente);
			} else if (op == 4) {
				System.out.println("Digite o id do gerente ");
				int idGerente = sc.nextInt();
				mDAO.getByID(idGerente);
			} else if (op == 5) {
				System.out.println("Digite o nome do gerente ");
				sc.nextLine();
				String nomeGerente = sc.nextLine();
				mDAO.getByName(nomeGerente);
			} else if (op == 6) {
				break;
			}
		}
	}

	public static void MenuProdutos(ProductDAO pDAO) throws SQLException {
		Scanner sc = new Scanner(System.in);
		int op;
		while (true) {
			System.out.println("""
					Selecione uma opcao:\s
					1 - Adicionar produto
					2 - Listar todos os produto
					3 - Alterar o preço de um produto
					4 - Deletar um produto
					5 - Apresentar informações sobre um produto especifico por meio do ID
					6 - Apresentar informações sobre um produto especifico por meio do nome
					7 - Sair do menu de produtos """);

			op = sc.nextInt();
			if (op == 1) {
				System.out.println("Digite o nome do produto");
				sc.nextLine();
				String nomeProduto = sc.nextLine();
				System.out.println("Digite a descricao do produto");
				String descricaoProduto = sc.nextLine();
				System.out.println("Digite o preco do produto");
				double precoProduto = sc.nextDouble();
				System.out.println("Digite o id da categoria");
				int idCategoria = sc.nextInt();
				pDAO.create(nomeProduto, descricaoProduto, precoProduto,idCategoria);
			} else if (op == 2) {
				List<Product> products = pDAO.list();
				products.stream().forEach(p -> System.out.println(p.toString()));
			} else if (op == 3) {
				System.out.println("Digite o id do produto ");
				int idProduto = sc.nextInt();
				System.out.println("Digite o preco do produto ");
				double precoProduto = sc.nextDouble();
				pDAO.updatePreco(precoProduto, idProduto);
			} else if (op == 4) {
				System.out.println("Digite o id do produto ");
				int idProduto = sc.nextInt();
				pDAO.delete(idProduto);
			} else if (op == 5) {
				System.out.println("Digite o id do produto ");
				int idProduto = sc.nextInt();
				pDAO.getByID(idProduto);
			} else if (op == 6) {
				System.out.println("Digite o nome do produto ");
				sc.nextLine();
				String nomeProduto = sc.nextLine();
				pDAO.getByName(nomeProduto);
			} else if (op == 7) {
				break;
			}
		}
	}

	public static void MenuCategorias(CategoryDAO cDAO) throws SQLException  {
		Scanner sc = new Scanner(System.in);
		int op;
		while (true) {
			System.out.println("""
					Selecione uma opcao:\s
					1 - Adicionar categoria
					2 - Listar todas as categorias
					3 - Deletar uma categoria
					4 - Apresentar informações sobre uma categoria especifica por meio do ID
					5 - Apresentar informações sobre uma categoria especifica por meio do nome
					6 - Sair do menu de categorias """);
			op = sc.nextInt();
			if (op == 1) {
				System.out.println("Digite o nome da categoria");
				sc.nextLine();
				String nomeCategoria = sc.nextLine();
				cDAO.create(nomeCategoria);
			} else if (op == 2) {
				List<Category>categories = cDAO.list();
				categories.stream().forEach(c -> System.out.println(c.toString()));
			} else if (op == 3) {
				System.out.println("Digite o id da categoria ");
				int idGerente = sc.nextInt();
				cDAO.delete(idGerente);
			} else if (op == 4) {
				System.out.println("Digite o id da categoria ");
				int id = sc.nextInt();
				cDAO.getByID(id);
			} else if (op == 5) {
				System.out.println("Digite o nome  da categoria ");
				sc.nextLine();
				String nome = sc.nextLine();
				cDAO.getByName(nome);
			} else if (op == 6) {
				break;
			}
		}
	}

}
