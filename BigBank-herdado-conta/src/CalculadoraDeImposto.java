
public class CalculadoraDeImposto {
	
	private double totalImposto;

	public void registra(Tributavel tri) {
		double valor = tri.getValorImposto();
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
	
}
