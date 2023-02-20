public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

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
	
	public double getSalgo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}