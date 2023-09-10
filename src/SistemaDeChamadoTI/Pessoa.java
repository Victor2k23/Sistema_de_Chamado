package SistemaDeChamadoTI;

public abstract class Pessoa{
	public String nome;
	private String cpf;
	private String end;
	private String rg;
	public String tel;
	
	public Pessoa(String nome, String cpf, String end, String rg, String tel) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.end = end;
		this.rg = rg;
		this.tel = tel;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
