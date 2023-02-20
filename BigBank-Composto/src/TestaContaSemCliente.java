
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaLivia = new Conta();
		
		contaDaLivia.titular = new Cliente();
		contaDaLivia.titular.nome = "Livia"; 
		System.out.println(contaDaLivia.titular.nome);

	}

}
