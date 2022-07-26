public class ProvaDeMatematica{
	

	public static void main(String[]args){

		int contadorAcertos = 0;

		System.out.println("--PROVA DE MATEMATICA--");

		for (int i=0; i<5; i++){

			if (TestesMatematicos.testeDeMultiplicacao()==true){

				contadorAcertos++;
			}

			if (TestesMatematicos.testeDeSoma()==true){

				contadorAcertos++;

			}

		}


		System.out.println("Voce acertou: "+contadorAcertos+" questoes.");


	}
}