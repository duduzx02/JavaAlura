
public class TesteReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		segundaConta.saldo += 100;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo );

		if(primeiraConta == segundaConta) {
			System.out.println(primeiraConta);
			System.out.println(segundaConta);
			System.out.println("Mesma refereência!");
		}
	}

}
