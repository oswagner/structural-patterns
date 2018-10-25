package adapter.exercicio2;

import java.util.ArrayList;

public class SomadorAdapter implements SomadorEsperado {
	
	private SomadorExistente somador;
	
	public SomadorAdapter() {
		this.somador = new SomadorExistente();
	}

	@Override
	public int somaVetor(int[] vetor) {
		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0; i < vetor.length; i++) {
			temp.add(vetor[i]);
		}
		return somador.somaLista(temp);
	}

}
