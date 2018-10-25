package adapter.exercicio1;

import java.util.TreeMap;

public class CustomMap extends TreeMap {

	public CustomMap(int[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			this.put(matrix[0][i], matrix[1][i]);
		}
	}
}
