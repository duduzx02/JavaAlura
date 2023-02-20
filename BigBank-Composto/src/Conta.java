public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Valor do deposito: " + valor);
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("O valor do saque: " + valor);
			return true;
		} else {
			System.out.println("Saldo insuficiente!");
			return false;
		}

	}

	public boolean tranfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("O valor da tranferencia: " + valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double pegaSaldo() {
		return this.saldo;
	}
}