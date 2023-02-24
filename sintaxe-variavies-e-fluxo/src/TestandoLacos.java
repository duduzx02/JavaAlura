
public class TestandoLacos {

	public static void main(String[] args) {
		for (int contador = 1; contador <= 10; contador++) {
			for (int i = 1; i <= 10; i++) {
				int resultado = i * contador;
				System.out.println("O contador: " + contador + " x " + "E o multiplicador: " + i + " = " + resultado);
			}
		}
	}
}