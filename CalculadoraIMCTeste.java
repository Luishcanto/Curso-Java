import java.util.Scanner;

public class CalculadoraIMCTeste {

	public static void main(String[]args){

		Scanner ler = new Scanner(System.in);

		Calculadora conta = new Calculadora();

		System.out.println("-- Calculo de IMC --");
		System.out.println();

		System.out.println("Digite seu peso em Kg: ");
		double peso = ler.nextDouble();

		System.out.println("Digite sua altura em metros: ");
		double altura = ler.nextDouble();

		double imc = conta.calcularIMC(peso,altura);

		if (imc<18.5){
			System.out.println("Abaixo do peso.");
		} else if (imc>=18.5 && imc<=24.9){
			System.out.println("Peso normal.");
		} else if (imc>=25 && imc<=29.9){
			System.out.println("Sobrepeso.");
		} else if (imc>=30 && imc<=34.9){
			System.out.println("Obesidade grau 1.");
		} else if (imc>=35 && imc<=39.9){
			System.out.println("Obesidade grau 2.");
		} else if (imc >= 40){
			System.out.println("Obesidade grau 3 ou morbida.");
		}




	}
	
}