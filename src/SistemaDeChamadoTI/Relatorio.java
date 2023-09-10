package SistemaDeChamadoTI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Relatorio{
	private String cod;
	public String data_ini;
	public String data_fim;
	public String relat_tecnico;
	public String relat_cliente;
	
	public String getCod() {
		return cod;
	}


	public void setCod(String cod) {
		this.cod = cod;
	}


	public String getData_ini() {
		return data_ini;
	}


	public void setData_ini(String data_ini) {
		this.data_ini = data_ini;
	}


	public String getData_fim() {
		return data_fim;
	}


	public void setData_fim(String data_fim) {
		this.data_fim = data_fim;
	}


	public String getRelat_tecnico() {
		return relat_tecnico;
	}


	public void setRelat_tecnico(String relat_tecnico) {
		this.relat_tecnico = relat_tecnico;
	}


	public String getRelat_cliente() {
		return relat_cliente;
	}


	public void setRelat_cliente(String relat_cliente) {
		this.relat_cliente = relat_cliente;
	}

	public Relatorio(String cod, String data_ini, String data_fim, String relat_tecnico, String relat_cliente) {
		super();
		this.cod = cod;
		this.data_ini = data_ini;
		this.data_fim = data_fim;
		this.relat_tecnico = relat_tecnico;
		this.relat_cliente = relat_cliente;
	}

	public void tela_relatorio() {
			System.out.println("\n********* TELA DE RELATÓRIO DO TECNICO *********");
			
			setCod(JOptionPane.showInputDialog("Informe o codigo do chamado"));
			int cod2 =  Integer.parseInt(getCod());
			
			setData_ini(JOptionPane.showInputDialog("Informe a data em que se iniciou o trabalho"));
			
			setData_fim(JOptionPane.showInputDialog("Informe a data em que foi terminado o trabalho"));
			
			setRelat_tecnico(JOptionPane.showInputDialog("Observações"));
			
			Relatorio relatorio = new Relatorio(getCod(), getData_ini(), getData_fim(),relat_tecnico, relat_cliente);
			List<Relatorio> relat = new ArrayList<Relatorio>();
			relat.add(relatorio);
			
			for(Relatorio elem : relat) {
				System.out.println("Numero de seriço: " + elem.getCod());
				System.out.println("Inicio: " + elem.getData_ini());
				System.out.println("Fim: " + elem.getData_fim());
				System.out.println("Observação: " + elem.relat_tecnico);
			}
			
	}
}
