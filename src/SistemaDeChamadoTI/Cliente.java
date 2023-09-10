package SistemaDeChamadoTI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cliente extends Pessoa{
	public String num_cadastro;
	
	public Cliente(String nome, String cpf, String end, String rg, String tel) {
		super(nome, cpf, end, rg, tel);
	}

	public String getNum_cadastro() {
		return num_cadastro;
	}


	public void setNum_cadastro(String num_cadastro) {
		this.num_cadastro = num_cadastro;
	}
	
	public void cadastroCliente() {
		
			System.out.println("\n****** TELA DE CADASTRO DO CLIENTE *******");
			this.nome = JOptionPane.showInputDialog("Digite seu nome: \n");
	
			this.setCpf(JOptionPane.showInputDialog("\ndigite seu cpf"));
			int cpf2 = Integer.parseInt(this. getCpf()); //CONVERTENDO PARA INT
		
			this.setRg(JOptionPane.showInputDialog("\nDigite seu RG: "));
			int rg2 = Integer.parseInt(this. getRg()); //CONVERTENDO PARA INT
		
			this.setEnd(JOptionPane.showInputDialog("\nDigite seu endereco: "));

			this.tel = JOptionPane.showInputDialog("\nDigite seu telefone: ");
			int tel2 = Integer.parseInt(this.tel); //CONVERTENDO PARA INT

			this.num_cadastro = JOptionPane.showInputDialog("\nDigite seu numero de cadastro: ");
			int cadastro2 = Integer.parseInt(this.num_cadastro); //CONVERTENDO PARA INT
			
			// FAZER LISTA CLIENTE SEPARADA ?????
			Cliente cliente = new Cliente(nome, getCpf(), getEnd(), getRg(), tel);
			
			List<Cliente> cl = new ArrayList<Cliente>();
			cl.add(cliente);
			
			for (Cliente elem : cl) {
				System.out.println("Lista com os dados do cliente!!");
				System.out.println("Nome do Cliente: " + elem.nome);
				System.out.println("cpf: " + elem.getCpf());
				System.out.println("endereco: " + elem.getEnd());
				System.out.println("RG do cliente: " + elem.getRg());
				System.out.println("Telefone do Cliente: " + elem.tel);
		}
	}
}
	
