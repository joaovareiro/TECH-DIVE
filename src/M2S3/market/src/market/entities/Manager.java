package market.entities;

import java.sql.SQLException;
import java.util.List;

import market.model.dao.CategoryDAO;
import market.model.dao.ManagerDAO;

public class Manager {
	private long id_manager;
	private String nome_manager;
	private String cpf_manager;
	
	public Manager( String nome_manager, String cpf_manager) {
		this.nome_manager = nome_manager;
		this.cpf_manager = cpf_manager;
	}
	
	public long getId_manager() {
		return id_manager;
	}

	public void setId_manager(long id_manager) {
		this.id_manager = id_manager;
	}

	public String getNome_manager() {
		return nome_manager;
	}

	public void setNome_manager(String nome_manager) {
		this.nome_manager = nome_manager;
	}

	public String getCpf_manager() {
		return cpf_manager;
	}

	public void setCpf_manager(String cpf_manager) {
		this.cpf_manager = cpf_manager;
	}

	@Override
	public String toString() {
		return "Manager [id_manager=" + id_manager + ", nome_manager=" + nome_manager + ", cpf_manager=" + cpf_manager
				+ "]";
	}
	
	
}
