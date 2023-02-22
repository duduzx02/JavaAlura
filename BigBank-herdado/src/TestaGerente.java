
public class TestaGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setCpf("111.111.111-57");
		g1.setNome("Eduardo");
		g1.setSalario(5000.0);
		g1.setSenha(8888);
		
		System.out.println(g1.getCpf());
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());

		System.out.println(g1.autentica(8888));
	}

}
