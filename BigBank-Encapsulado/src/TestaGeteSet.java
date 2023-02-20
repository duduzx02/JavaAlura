
public class TestaGeteSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 25987);
		System.out.println(conta.getNumero());
		
		Cliente eduardo = new Cliente();
		conta.setTitular(eduardo);
		eduardo.setNome("Eduardo Lima");
		
		System.out.println(conta.getTitular().getNome()); 
		
		conta.getTitular().setProfissao("Programador");
		
		System.out.println(conta.getTitular().getProfissao());
	
		
		
		
	}
}
