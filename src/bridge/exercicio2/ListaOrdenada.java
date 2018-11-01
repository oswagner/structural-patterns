package bridge.exercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaOrdenada implements MyCustomListImpl {

	private List<String> list = new ArrayList<>();

	@Override
	public void adicionar(String s) {
		list.add(s);
		list.sort(String::compareTo);
	}

	@Override
	public String imprimir() {
		Iterator<String>listIterator = list.iterator();
		String res = "";
		
		while (listIterator.hasNext()) {
			res += listIterator.next() + "\n";
		}
		return res;
	}
}
