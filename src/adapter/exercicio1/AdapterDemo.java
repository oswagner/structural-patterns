package adapter.exercicio1;

public class AdapterDemo {

	public static void main(String[] args) {
		int[][] matrix = { 
				{ 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 } 
				};
		
		CustomMap customMap = new CustomMap(matrix);

		customMap.forEach((k, v) -> {
			System.out.println(k.toString() + "=" + v);
		});
	}
}