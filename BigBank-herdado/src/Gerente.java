// A classe funcionario herda da classe Funcionario
public class Gerente extends Funcionario implements Autenticavel {

	private autenticador autenticador;
	
	public Gerente() {
		this.autenticador = new autenticador();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		 return this.autenticador.autentica(senha);
	}

	public double getBonificacao() {
		System.out.println("Bonificacao do GERENTE");
		return super.getSalario();
	}

}
