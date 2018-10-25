package adapter.exercicio2;

public class AdapterDemo {

	public static void main(String[] args) {
		SomadorEsperado somador = new SomadorAdapter();
		Cliente cliente = new Cliente(somador);
		cliente.executar();
	}
}
