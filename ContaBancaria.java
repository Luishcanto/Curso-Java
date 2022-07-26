public class ContaBancaria {

	private String nomeCorrentista;
	private String nomeBanco;
	private int numeroAgencia;
	private int numeroConta;
	private double saldoAtual;

	public ContaBancaria criarContaBancaria(String novoNomeCorrentista, String novoNomeBanco, int novoNumeroAgencia, int novoNumeroConta, double novoSaldoAtual){

		ContaBancaria conta = new ContaBancaria();

		nomeCorrentista = novoNomeCorrentista;
		nomeBanco = novoNomeBanco;
		numeroAgencia = novoNumeroAgencia;
		numeroConta = novoNumeroConta;
		saldoAtual = novoSaldoAtual;

		return conta;
	}

	public void depositar(double valorDeposito){

		saldoAtual = saldoAtual+valorDeposito;

		System.out.println("Saldo atual: "+ saldoAtual);

	}

	public void efetuarSaque(double valorSaque){

		if (valorSaque>saldoAtual){
			System.out.println("Nao tem saldo suficiente!");
		} else {
			saldoAtual = saldoAtual - valorSaque;
		}
	}

	

}