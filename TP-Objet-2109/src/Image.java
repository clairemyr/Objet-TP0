import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Image {
	private int[][] Tableau;

	private int hauteur;
	private int largeur;
	
	public Image(String texte) throws IOException {
		// Lecture du fichier texte
		Scanner scanner = new Scanner(new File(texte));

		// Prise en compte d'une ligne
		scanner.nextLine();
		scanner.nextLine();
		String ligne = scanner.nextLine();

		// traitement de la ligne courante: decouper les mots separes par des
		// delimiteurs
		String delimiteurs = " ";
		StringTokenizer st = new StringTokenizer(ligne, delimiteurs);
		String largeurstring = st.nextToken();
		String hauteurstring = st.nextToken();
		Integer largeur = new Integer(largeurstring);
		Integer hauteur = new Integer(hauteurstring);

		int[][] Tableau = new int[largeur][hauteur];

		for (int i = 0; i < hauteur; i++) {
			for (int j = 0; j < largeur; j++) {
				String line = scanner.nextLine();
				Tableau[i][j] = new Integer(line);
			}
		}

	}

	
	public void affiche(){
		for (int i = 0; i < hauteur; i++) {
			for (int j = 0; j <largeur; j++) {
				System.out.println(this.Tableau[i][j]);;
			}
			System.out.println("/n");
		}
	}
	
	
}
