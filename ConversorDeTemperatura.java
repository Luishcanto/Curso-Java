public class ConversorDeTemperatura{
	



	public static double conversorCelsiusParaFahrenheit(double novoCelsius){

		double fahrenheit = 1.8*novoCelsius+32;
		return fahrenheit;

	}

	public static double conversorFahrenheitParaCelsius(double novoFahrenheit){

		double celsius = (novoFahrenheit-32)/1.8;
		return celsius;

	}
}