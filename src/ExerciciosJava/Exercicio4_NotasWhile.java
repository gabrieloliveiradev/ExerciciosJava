package ExerciciosJava;

import java.util.Scanner;

public class Exercicio4_NotasWhile {
	public static void main(String[] args) {
		int i = 0;
		while(i < 5) {
			Scanner entrada = new Scanner(System.in);
			System.out.print("Entre com o nome do aluno: ");
			String nome = entrada.nextLine();
			System.out.print("Entre com o grau A: ");
			float nota1 = entrada.nextFloat();
			if(nota1 < 0 || nota1 > 10) {
				while(nota1 < 0 || nota1 > 10) {
						System.out.println("Nota inválida");
						System.out.print("Entre com o grau A: ");
						nota1 = entrada.nextFloat();
				}
			}
			System.out.print("Entre com o grau B: ");
			float nota2 = entrada.nextFloat();
				if(nota2 < 0 || nota2 > 10) {
					while(nota2 < 0 || nota2 > 10) {
						System.out.println("Nota inválida");
						System.out.print("Entre com o grau B: ");
						nota2 = entrada.nextFloat();
					}
				}
			float media = (nota1+nota2*2)/3;
			System.out.println("A media de " + nome + " é: " + media);
			i++;
		}
	}
}