package SistemaDeChamadoTI;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;

public class testeChamado {
	
	public static void main(String[] args) {
		
		String escolha;
		
		escolha = JOptionPane.showInputDialog("Você é cliente ou Tecnico? Digite 1 se for cliente ou digite 2 se for tecnico");
		if(escolha.equals("1")) {
			System.out.println("Olá Cliente !!");
			escolha = JOptionPane.showInputDialog("Deseja entrar na tela de cadastro do Cliente? 1 para sim 2 para não");
			if(escolha.equals("1")) {
				Cliente cliente = new Cliente(null, null, null, null, null);
				cliente.cadastroCliente();
			}
			escolha = JOptionPane.showInputDialog("Deseja entrar na tela de chamado do Cliente? 1 para sim 2 para não");
			if(escolha.equals("1")) {
				Chamado chamado = new Chamado(null, null, null, null);
				chamado.telaChamado_Cliente();
			}
			escolha = JOptionPane.showInputDialog("Deseja entrar na tela de FeedBack? 1 para sim 2 para não");
			if(escolha.equals("1")) {
				feedBack feedback = new feedBack(null, null, null, null);
				feedback.feedBack_Cliente();
			}
			
		}
		if(escolha.equals("2")) {
			System.out.println("Olá Tecnico !!");
			escolha = JOptionPane.showInputDialog("Deseja entrar na tela de cadastro do Tecnico? 1 para sim 2 para não");
			if(escolha.equals("1")) {
				Tecnico tecnico = new Tecnico(null, null, null, null, null, null, null);
				tecnico.cadastro_Tecnico();
			}
			escolha = JOptionPane.showInputDialog("Deseja entrar na tela de chamado do Tecnico? 1 para sim 2 para não");
			if(escolha.equals("1")) {
				Chamado chamado = new Chamado(null, null, null, null);
				chamado.telaChamado_Tecnico();
			}
			escolha = JOptionPane.showInputDialog("Deseja entrar na tela de Relatório? 1 para sim 2 para não");
			if(escolha.equals("1")) {
				Relatorio relatorio = new Relatorio(null, null, null, null, null);
				relatorio.tela_relatorio();
			}
		}else {
			System.out.println("Insira numero 1 para cliente e  2 para tecnico");
			return;
		}
	}
}
