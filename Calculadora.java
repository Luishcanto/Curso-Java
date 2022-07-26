public class Calculadora{

	public int somar(int novoNumero1, int novoNumero2){

		int resultado = novoNumero1+novoNumero2;

		return resultado;

	}

	public int multiplicar(int novoNumero1, int novoNumero2){

		int resultado = novoNumero1*novoNumero2;

		return resultado;
	}

	public double calcularIMC(double novoPeso, double novaAltura){

		double imc = novoPeso/(novaAltura*novaAltura);
		return imc;
	}
	

}