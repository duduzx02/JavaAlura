
public class TestandoCondicionais {

	public static void main(String[] args) {
		int idade = 17;
		if(idade >= 18 && idade <= 65) {
			System.out.println("Você é de maior, mas não é idoso!");
		} else if(idade >= 65){
			System.out.println("Você tem mais de 65 anos!");
		} else {
			System.out.println("Você pode ser de menor ou idoso!");
		}

	}

}
