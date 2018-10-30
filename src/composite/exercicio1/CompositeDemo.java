package composite.exercicio1;

public class CompositeDemo {

	public static void main(String[] args) {

		AbstractFile root = new FileComposite("Wagner");
		AbstractFile img1 = new ImageFile("summer_time.jpg");
		AbstractFile img2 = new ImageFile("default.jpg");

		try {
			root.addFile(img1);
			root.addFile(img2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("Pesquisando arquivos:\n");
			root.getFile("default.jpg").printFilename();
			root.getFile("summer_time.jpg").printFilename();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}
}
