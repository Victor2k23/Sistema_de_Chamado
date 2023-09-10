package SistemaDeChamadoTI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Tecnico extends Pessoa{
	public String matricula;
	private String especificacao;
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	
	public Tecnico(String nome, String cpf, String end, String rg, String tel, String matricula, String especificacao) {
		super(nome, cpf, end, rg, tel);
		this.matricula = matricula;
		this.especificacao = especificacao;
	}

	public void cadastro_Tecnico() {
	
		System.out.println("******** TELA DE CADASTRO DO TECNICO **********");
		this.nome = JOptionPane.showInputDialog("Digite seu nome: \n");
			
		this.setCpf(JOptionPane.showInputDialog("\ndigite seu cpf"));
		int cpf2 = Integer.parseInt(this. getCpf()); //CONVERTENDO PARA INT
		
		this.setRg(JOptionPane.showInputDialog("\nDigite seu RG: "));
		int rg2 = Integer.parseInt(this. getRg()); //CONVERTENDO PARA INT
		
		this.setEnd(JOptionPane.showInputDialog("\nDigite seu endereco: "));

		this.tel = JOptionPane.showInputDialog("\nDigite seu telefone: ");
		int tel2 = Integer.parseInt(this.tel); //CONVERTENDO PARA INT
			
		setMatricula(JOptionPane.showInputDialog("Informe sua matricula"));
		int matri = Integer.parseInt(getMatricula()); //CONVERTENDO PARA INT
			
		setEspecificacao(JOptionPane.showInputDialog("Informe sua especificação"));
		
		Tecnico tecnico = new Tecnico(getNome(), getCpf(), getRg(), getEnd(), tel, matricula, especificacao);
			
		List <Tecnico> tec = new ArrayList<Tecnico>();
		tec.add(tecnico);
			
		for(Tecnico elem: tec) {
			System.out.println("******** Lista de dados do Tecnico ********** ");
			System.out.println("Nome: " + elem.nome);
			System.out.println("CPF: " + elem.getCpf());
			System.out.println("RG: " + elem.getRg());
			System.out.println("Endereço: " + elem.getEnd());
			System.out.println("Telefone: " + elem.tel);
			System.out.println("Matricula: " + elem.matricula);
			System.out.println("Especificação: " + elem.getEspecificacao());
		}
	}
}

