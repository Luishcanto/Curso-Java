import java.util.Scanner;

public class CalculadoraTest{

	public static void main(String[]args){

		Scanner ler = new Scanner (System.in);

		Calculadora conta = new Calculadora();

		System.out.println("Escolha a opcao desejada: 1.Somar | 2.Multiplicar");
		int opcao = ler.nextInt();

		if (opcao == 1){

	     System.out.println("Digite o primeiro numero: ");
		 int num1 = ler.nextInt ();

		 System.out.println("Digite o segundo numero: ");
		 int num2 = ler.nextInt();

		 System.out.println();
		 System.out.println("Resultado: "+conta.somar(num1,num2));


		} else if (opcao == 2){

			System.out.println("Digite o primeiro numero: ");
		 int num1 = ler.nextInt();

		 System.out.println("Digite o segundo numero: ");
		 int num2 = ler.nextInt();

		 System.out.println();
		 System.out.println("Resultado: "+conta.multiplicar(num1,num2));

		} else {

			System.out.println("Opcao invalida!");
		}



		
	}
	
} 