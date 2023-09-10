package SistemaDeChamadoTI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Chamado{
	public String local;
	public String problema;
	public String numero_servico;
	public String categoria;

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getNumero_servico() {
		return numero_servico;
	}

	public void setNumero_servico(String numero_servico) {
		this.numero_servico = numero_servico;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Chamado(String local, String problema, String numero_servico, String categoria) {
		super();
		this.local = local;
		this.problema = problema;
		this.numero_servico = numero_servico;
		this.categoria = categoria;
	}
	public void telaChamado_Cliente() {
		
		System.out.println("\n******* Tela de Chamado do Cliente ******");
			
		local = JOptionPane.showInputDialog("Qual o local do problema?");

		problema = JOptionPane.showInputDialog("Qual problema encontrado ?");
			
		setNumero_servico(JOptionPane.showInputDialog("Digite o numero de serviço: \n"));
		int numero_servico2 = Integer.parseInt(getNumero_servico());
			
		categoria = JOptionPane.showInputDialog("Informe a categoria");
			
		Chamado chamado = new Chamado(local, problema, numero_servico, categoria);
		List<Chamado> cham = new ArrayList<Chamado>();
		cham.add(chamado);
			
		for(Chamado elem : cham) {
			System.out.println("***** LISTA COM OS DADOS DO CHAMADO *****");
			System.out.println("Local do Problema: " + elem.local);
			System.out.println("Problema detectado: " + elem.problema);
			System.out.println("Numero de serviço: " + elem.getNumero_servico());
			System.out.println("Categoria do Seriço: " + elem.categoria);
		}
	}

	public void telaChamado_Tecnico() {
		
		System.out.println("***** TELA DE CHAMADO DO TECNICO *****");
		this.local = "Bloco A1 sala 4";
		this.problema = "Monitor queimado";
		this.numero_servico = "2257";
		this.categoria = "Equipamentos";
			
		Chamado chamado = new Chamado(local, problema, numero_servico, categoria);
		List<Chamado>cham = new ArrayList<Chamado>();
		cham.add(chamado);
			
		for(Chamado elem: cham) {
			System.out.println("\nLocal do Problema: " + elem.local);
			System.out.println("Problema detectado: " + elem.problema);
			System.out.println("Numero de serviço: " + elem.numero_servico);
			System.out.println("Categoria do Seriço: " + elem.categoria);
		}
	}
}