package market.entities;

public class Employee {
	private long id_employee;
	private String name_employee;
	private String cpf_employee;
	private long fk_id_manager;
	
	public Employee(String name_employee, String cpf_employee) {
		this.name_employee = name_employee;
		this.cpf_employee = cpf_employee;
	}

	public long getId_employee() {
		return id_employee;
	}

	public void setId_employee(long id_employee) {
		this.id_employee = id_employee;
	}

	public String getName_employee() {
		return name_employee;
	}

	public void setName_employee(String name_employee) {
		this.name_employee = name_employee;
	}

	public String getCpf_employee() {
		return cpf_employee;
	}

	public void setCpf_employee(String cpf_employee) {
		this.cpf_employee = cpf_employee;
	}

	public long getFk_id_manager() {
		return fk_id_manager;
	}

	public void setFk_id_manager(long fk_id_manager) {
		this.fk_id_manager = fk_id_manager;
	}

	@Override
	public String toString() {
		return "Employee [id_employee=" + id_employee + ", name_employee=" + name_employee + ", cpf_employee="
				+ cpf_employee + ", fk_id_manager=" + fk_id_manager + "]";
	}
	
	
}
