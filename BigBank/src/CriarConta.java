
public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 500;
		System.out.println(segundaConta.saldo);
		segundaConta.saldo += 1800;
		System.out.println(segundaConta.saldo);
		
	}
}
