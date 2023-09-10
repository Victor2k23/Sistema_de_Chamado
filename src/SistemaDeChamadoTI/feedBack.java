package SistemaDeChamadoTI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class feedBack {
	public String cod;
	public String informacao;
	public String feedBack_cliente;
	public String feedBack_tecnico;
	
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getInformacao() {
		return informacao;
	}
	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
	public String getFeedBack_cliente() {
		return feedBack_cliente;
	}
	public void setFeedBack_cliente(String feedBack_cliente) {
		this.feedBack_cliente = feedBack_cliente;
	}
	public String getFeedBack_tecnico() {
		return feedBack_tecnico;
	}
	public void setFeedBack_tecnico(String feedBack_tecnico) {
		this.feedBack_tecnico = feedBack_tecnico;
	}
	public feedBack(String cod, String informacao, String feedBack_cliente, String feedBack_tecnico) {
		super();
		this.cod = cod;
		this.informacao = informacao;
		this.feedBack_cliente = feedBack_cliente;
		this.feedBack_tecnico = feedBack_tecnico;
	}
	public void feedBack_Cliente() {
		System.out.println("\n***** TELA DE FEEDBACK DO CLIENTE *****");
		
		setCod(JOptionPane.showInputDialog("Digite o codigo do chamado: \n"));
		int cod2 = Integer.parseInt(getCod()); //CONVERTENDO PARA INT
			
		informacao = JOptionPane.showInputDialog("Deixe o feedBack para o chamado \n");
			
		feedBack feedback_cliente = new feedBack(cod, informacao, feedBack_cliente, feedBack_tecnico);
		List <feedBack> feed = new ArrayList<feedBack>();
		feed.add(feedback_cliente);
			
		for(feedBack elem: feed) {
			System.out.println("\n****** Lista do FeedBack do Cliente********");
			System.out.println("Codigo do chamado: " + elem.getCod());
			System.out.println("FeedBack: " + elem.informacao);
		}
	}
}
