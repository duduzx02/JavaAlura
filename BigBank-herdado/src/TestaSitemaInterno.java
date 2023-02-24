
public class TestaSitemaInterno {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		Gerente h = new Gerente();
		h.setSenha(1111);
		Administrador adm = new Administrador();
		adm.setSenha(222);
		Cliente cl = new Cliente();
		cl.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(h);
		si.autentica(adm);
		si.autentica(cl);
		

	}

}
