package decorator.exercicio2;

public class EntreColchetes implements ImprimirInterface {

	private NumeroUm numero;

	public EntreColchetes(NumeroUm numero) {
		super();
		this.numero = numero;
	}

	@Override
	public void imprimir() {
		System.out.print("[");
		numero.imprimir();
		System.out.print("]");
	}

}
