import java.util.Scanner;

public class TesteConversorDeTemperatura{

	public static void main(String[]args){

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = ler.nextDouble();

		System.out.println("A temperatura em Fahrenheit e: "+ ConversorDeTemperatura.conversorCelsiusParaFahrenheit(celsius));

		System.out.println();

		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = ler.nextDouble();

		System.out.println("A temperatura em Celsius e: "+ ConversorDeTemperatura.conversorFahrenheitParaCelsius(fahrenheit));
	}
	
}