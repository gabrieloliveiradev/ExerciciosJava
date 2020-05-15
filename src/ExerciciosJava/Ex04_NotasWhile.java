//4- Ler
//o nome de um aluno e as suas duas notas A e B, e após calcular a média
//ponderada entre estas notas (A tem peso 1 e B tem peso 2). Verifique se a
//nota digitada é valida, caso seja inválida, repita a leitura. Repetir este
//procedimento para uma turma composta por cinco alunos, usando o comando
//While.
//
//Exemplo de tela de saída: Entre com o
//nome do aluno: Fulano da Silva Entre com
//o grau A: 5.0 Entre com o grau B: 6.0 O
//aluno Fulano da Silva tem uma media: 5.66
//Entre com o nome do aluno: Ciclano da
//Silva Entre com o grau A: 12.5 Nota
//invalida! Entre com o grau A: 2.5 ...

package ExerciciosJava;

import java.util.Scanner;

public class Ex04_NotasWhile {
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
