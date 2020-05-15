package ExerciciosJava;

public class Ex03_contandoDe5em5e3em3 {
	public static void main(String[] args) {
		for (int i = 0; i <457; i++) {
			if(i < 300 || i > 400) {
				i = i + 4;
			} else {
				i = i + 2;
			}
		}
	}
}
