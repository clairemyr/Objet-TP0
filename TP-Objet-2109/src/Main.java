import java.io.IOException;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		Image image = new Image("lena512x512.pgm");
		
		image.affiche();
	}

}
