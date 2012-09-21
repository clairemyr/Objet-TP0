import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Image {
	private int[][] Tableau;

	private int hauteur;
	private int largeur;
	
	/**
	 * Constructeur.
	 * Il stock l'image dans une matrice, à partir du fichier image
	 * 
	 * @param texte
	 * @throws IOException
	 */
	
	public Image(String texte) throws IOException {
		// Lecture du fichier contenant l'image
		Scanner scanner = new Scanner(new File(texte));

		// Passage à la troisième ligne, on ignore les lignes inutiles
		scanner.nextLine();
		scanner.nextLine();
		String ligne = scanner.nextLine();

		// lecture de la hauteur et de la largeur de l'image
		String delimiteurs = " ";
		StringTokenizer st = new StringTokenizer(ligne, delimiteurs);
		String largeurstring = st.nextToken();
		String hauteurstring = st.nextToken();
		Integer largeur = new Integer(largeurstring);
		Integer hauteur = new Integer(hauteurstring);

		int[][] Tableau = new int[largeur][hauteur];
		
		// Lecture des valeurs des pixels, et completion du tableau
		for (int i = 0; i < hauteur; i++) {
			for (int j = 0; j < largeur; j++) {
				String line = scanner.nextLine();
				Tableau[i][j] = new Integer(line);
			}
		}

	}

	
	/**
	 * Méthode d'affichage du tableau.
	 * L'affichage se fait comme dans le ficher, à partir de la première valeur de pixel renseignée 
	 */
	
	public void affiche(){
		for (int i = 0; i < hauteur; i++) {
			for (int j = 0; j <largeur; j++) {
				System.out.println(this.Tableau[i][j]);;
			}
		}
	}
	
	
}
