// A classe funcionario herda da classe Funcionario
public class Gerente extends Funcionario{

	
	public double getBonificacao() {
		System.out.println("Bonificacao do GERENTE");
		return super.getSalario();
	}

}
