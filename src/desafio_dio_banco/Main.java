package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("Banco T");
		
		Conta ccRogerio = new ContaCorrente(new Cliente("Rogerio"));
		Conta poupancaRogerio = new ContaPoupanca(new Cliente("Rogerio"));
		
		ccRogerio.depositar(100);
		ccRogerio.transferir(100, poupancaRogerio);
		
		ccRogerio.imprimirExtrato();
		poupancaRogerio.imprimirExtrato();
		
		Conta ccJoao = new ContaCorrente(new Cliente("Joao"));
		Conta poupancaJoao = new ContaPoupanca(new Cliente("Joao"));
		
		Conta ccBreno = new ContaCorrente(new Cliente("Breno"));
		Conta poupancaBreno = new ContaPoupanca(new Cliente("Breno"));
		
		banco.addConta(ccRogerio);
		banco.addConta(poupancaRogerio);
		banco.addConta(ccJoao);
		banco.addConta(poupancaJoao);
		banco.addConta(ccBreno);
		banco.addConta(poupancaBreno);
		
		System.out.println();
		System.out.println("----------------------- Imprimindo Contas do Banco -----------------------");
		System.out.println();
		
		banco.listarContas();
		
		banco.removeConta(poupancaBreno);
		banco.removeConta(poupancaJoao);
		
		System.out.println();
		System.out.println("----------------------- Imprimindo Contas Atualizada do Banco -----------------------");
		System.out.println();
		
		banco.listarContas();
	}

}
