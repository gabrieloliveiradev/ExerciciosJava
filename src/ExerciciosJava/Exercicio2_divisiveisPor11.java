package ExerciciosJava;

public class Exercicio2_divisiveisPor11 {
	public static void main(String[] args) {
		for(int i = 1000; i < 2000; i++) {
			if(i%11==0) {
				System.out.println("Esses s�o os n�meros divisiveis por 11: " + i);
			} else
				if(i%11==5) {
					System.out.println("Esses s�o os n�meros divisiveis por 11 com resto 5: " + i);;
				}
		}
	}
}
