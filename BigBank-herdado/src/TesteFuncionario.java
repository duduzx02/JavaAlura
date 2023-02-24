
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente eduardo = new Gerente();
		eduardo.setNome("Eduardo");
		eduardo.setCpf("111.111.111-69");
		eduardo.setSalario(100);
		
		System.out.println(eduardo.getNome());
		System.out.println(eduardo.getBonificacao());

	}

}
