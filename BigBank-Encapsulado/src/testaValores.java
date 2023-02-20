
public class testaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 25874);
		Conta conta1 = new Conta(1337, 2884);
		Conta conta2 = new Conta(1337, 2474);
		
		System.out.println("Numero da conta: " + conta.getNumero());
		
		System.out.println("Numero de contas: " + Conta.getTotal());
		
	}
}
