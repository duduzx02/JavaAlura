
public class TestaReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Eduardo");
		System.out.println(g1.getNome());
		
		
		Funcionario f1 = new Gerente();
		f1.setNome("Eduardo");
		System.out.println(f1.getNome());
	}
}
