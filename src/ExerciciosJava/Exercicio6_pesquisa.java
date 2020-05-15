package ExerciciosJava;

import java.util.Scanner;

public class Exercicio6_pesquisa {
	public static void main(String[] args) {
		int mulherNervosa=0, homemAgressivo=0, nervoso40=0, calmo18=0, calmo=0;
		Scanner entrada = new Scanner(System.in);
		
		for (int i=0; i <5; i++) {
			System.out.print("Digite sua idade: ");
			int idade = entrada.nextInt();
			System.out.println("Escolha seu sexo: ");
			System.out.println("1 - feminino");
			System.out.println("2 - masculino");
			int sexo = entrada.nextInt();
			System.out.println("Você se considera: ");
			System.out.println("1 - Calmo");
			System.out.println("2 - Nervoso");
			System.out.println("3 - Agressivo");
			int opcao = entrada.nextInt();
		
		
			if (sexo == 1 && opcao == 2) {
				++mulherNervosa;
			}
			if (sexo == 2 && opcao == 3) {
				++homemAgressivo;
			}
			if (idade >= 40 && opcao == 2) {
				++nervoso40;
			}
			if (idade <=18 && opcao == 1) {
				++calmo18;
			}
			if(opcao == 1) {
				++calmo;
			}
			
		}
		System.out.println("Número de pessoas calmas: " + calmo);
		System.out.println("Numero de mulheres nervosas: " + mulherNervosa);
		System.out.println("Numero de homens agressivos: " + homemAgressivo);
		System.out.println("Numero de pessoas acima dos 40 nervosas: " + nervoso40);
		System.out.println("Numero de pessoas calmas abaixo dos 18: " + calmo18);
	}
}
