
public class TestaReferencias {

	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		g1.setNome("Eduardo");
		g1.setSalario(5000.0);
		
		Funcionario e1 = new Editor();
		e1.setNome("Seila");
		e1.setSalario(2500.0);
		
		Funcionario p1 = new Programador();
		p1.setSalario(2000.0);
	
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(e1);
		controle.registra(p1);
		
		System.out.println(controle.getSoma());
	}
	
	
}
