package decorator.exercicio2;

public class EntreChaves implements ImprimirInterface {
	private NumeroUm numero;

	public EntreChaves(NumeroUm numero) {
		super();
		this.numero = numero;
	}

	@Override
	public void imprimir() {
		System.out.print("{");
		numero.imprimir();
		System.out.print("}");
	}
}
