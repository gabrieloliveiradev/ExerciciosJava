//1- Desenvolver um sistema que efetue a soma de todos os números ímpares
//que são múltiplos de três e que se encontram no conjunto dos números de 1
//até 500.

package ExerciciosJava;

public class Exercicio1_SomarImpar {
	public static void main(String[] args) {
		int soma =0;
		for (int i = 1; i < 501; i++) {
			if (i%2 != 0 && i%3==0) {
				System.out.println(i);
				soma = soma + i;
			}
		}
		System.out.println("O resultado da soma dos impares: " + soma);
	}
}

