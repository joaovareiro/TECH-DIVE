package market.application;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import market.connection.FactoryConnection;
import market.entities.Employee;
import market.model.dao.CategoryDAO;
import market.model.dao.EmployeeDAO;
import market.model.dao.ManagerDAO;
import market.model.dao.ProductDAO;

public class Program {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		FactoryConnection factoryConnection = new FactoryConnection();
		try (Connection conn = factoryConnection.openConnection();){
			System.out.println("Conexao aberta");
			int op;
	        while(true) {
	            System.out.println("-----MERCADO TECH-DIVE-----");
	            System.out.println("""
	                    Selecione uma opcao:\s
	                    1 - Acessar Menu Funcionarios
	                    2 - Acessar Menu Categorias
	                    3 - Acessar Menu Produtos
	                    4 - Acessar Menu Gerentes
	                    5 - Sair da aplicacao """);

	            op = sc.nextInt();
	            if (op == 1) {
	            	EmployeeDAO eDAO = new EmployeeDAO(conn);
	            	Menu.MenuFuncionario(eDAO);
	            } else if (op == 2) {
	            	CategoryDAO cDAO = new CategoryDAO(conn);
	            	Menu.MenuCategorias(cDAO);
	            } else if (op == 3) {
	            	ProductDAO pDAO = new ProductDAO(conn);
	            	Menu.MenuProdutos(pDAO);
	            } else if (op == 4) {
	            	ManagerDAO mDAO = new ManagerDAO(conn);
	            	Menu.MenuGerente(mDAO);
	            } else if (op == 5) {
	                break;
	            }
	        }
			
			
		} catch (SQLException e) {
			System.out.println("Erro ao se conectar ao banco de dados. Causa por: " + e.getMessage());
			e.printStackTrace();
		}
	}
}

