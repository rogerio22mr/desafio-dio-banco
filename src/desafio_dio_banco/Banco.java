package desafio_dio_banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addConta(Conta conta) {
		contas.add(conta);
	}
	
	public void removeConta(Conta conta) {
		contas.remove(conta);
	}
	
	public void listarContas() {
		for(Conta conta : contas) {
			conta.imprimirExtrato();
		}
	}

}
