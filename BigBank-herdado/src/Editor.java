// A classe funcionario herda da classe Funcionario
public class Editor extends Funcionario{

	
	public double getBonificacao() {
		System.out.println("Bonificacao do EDITOR");
		return super.getBonificacao() + 100.0;
	}

}
