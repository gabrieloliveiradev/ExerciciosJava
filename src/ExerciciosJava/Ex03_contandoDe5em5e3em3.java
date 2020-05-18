//3- Faça um
//programa que mostre uma contagem na tela de 233 a 456, só que contando de
//3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.

package ExerciciosJava;

public class Ex03_contandoDe5em5e3em3 {
	public static void main(String[] args) {
		for (int i = 233; i <457; i++) {
			if(i < 300 || i > 400) {
				i = i + 4;
			} else {
				i = i + 2;
			}
		}
	}
}

