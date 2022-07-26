import java.util.Scanner;

public class TestesMatematicos{
	


	public static boolean testeDeMultiplicacao(){

		Scanner ler = new Scanner(System.in);

		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);

		System.out.println("Digite o resultado de "+num1+"x"+num2+":");
		int resposta = ler.nextInt();

		if(resposta == num1*num2){

			return true;
			

		} else{

			System.out.println("A resposta correta era: "+num1*num2);
			return false;
		}
		
	}


	public static boolean testeDeSoma(){

		Scanner ler = new Scanner(System.in);

		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);

		System.out.println("Digite o resultado de "+num1+"+"+num2+":");
		int resposta = ler.nextInt();

		if(resposta == num1+num2){

			return true;
			

		} else{

			System.out.println("A resposta correta era: "+(num1+num2));
			return false;
		}
		
	}



}