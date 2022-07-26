import java.util.Scanner;

public class ContaBancariaTest {
	
	public static void main(String[]args){

		ContaBancaria conta1 = new ContaBancaria();

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = ler.next();

		System.out.println("Digite o nome do banco: ");
		String nomeBanco = ler.next();

		System.out.println("Digite o numero da agencia: ");
		int agencia = ler.nextInt();

		System.out.println("Digite o numero da conta: ");
		int conta = ler.nextInt();

		System.out.println("Digite o saldo atual: ");
		double saldo = ler.nextDouble();

		conta1.criarContaBancaria(nome,nomeBanco,agencia,conta,saldo);

		System.out.println("Digite o valor do deposito: ");
		double deposito = ler.nextDouble();

		conta1.depositar(deposito);

		System.out.println();

		System.out.println("Digite o valor do saque: ");
		double saque = ler.nextDouble();

		conta1.efetuarSaque(saque);

	}
}