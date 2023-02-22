public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de conta é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma nova conta: " + this.agencia);
	}
	

	public void deposita(double valor) {
		this.saldo += valor;
		//System.out.println("Valor do deposito: " + valor);
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
		
		if(numero <= 0) {
			System.out.println("Não é permitido valor menor que 0");
			return;
		}
		
		this.numero = numero;
	
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		
		if(agencia <= 0) {
			System.out.println("Não é permitido valor menor que 0");
			return;
		}
		
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}