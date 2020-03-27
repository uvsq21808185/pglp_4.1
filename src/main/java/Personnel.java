import java.util.ArrayList;

/**
 * 
 */

/** Classe Personnel qui implémente la classe abstraire Interface_annuaire
 * @author Win10
 *
 */
public final class Personnel extends Interface_annuaire {
	
	private final String nom;
	
	private final String prenom;
	
	private final ArrayList<String> tel;
	
	private final java.time.LocalDate Date;
	
	 /* 
     * Constructeur de la classe Personnel 
     * @param builder pour créer le personnel
     */
	private Personnel(Personnel_Builder builder)
	{
		this.nom=builder.nom;
		this.prenom=builder.prenom;
		this.tel= builder.tel;
		this.Date= builder.date;
		
	
	}
	 /* 
     * Cette méthode affiche le personnel : son nom, son prenom , sa date de naissance
     * et son numéro de télephone sous forme d'une chaine de caractères
     */
	public void tostring() {
		
		System.out.println("****************");
		System.out.print(prenom + " " + nom + ", Née le : " + Date + ", numéro de téléphone : ");
		for (String i : tel) {
			System.out.print(i + "  ");
		}
		System.out.println("\n");

		System.out.println("****************");
	}
	 /* 
     * La classe Personnel_Builder pour créer un personnel
     */
	
	public static class Personnel_Builder {
		
		private final String nom;
		
		private final String prenom;
		
		private final java.time.LocalDate date;
		
		private final ArrayList<String> tel;
		
		public Personnel_Builder(final String nomP, final String prenomP,
				
			final java.time.LocalDate dateNaissanceP,
			final ArrayList<String> numeroTelephoneP) {
			this.nom = nomP;
			this.prenom = prenomP;
			this.date = dateNaissanceP;
			this.tel = numeroTelephoneP;
		}
		
		public Personnel build() {
			return new Personnel(this);
		}
	}
	 /* 
     * Cette méthode renvoie le nom d'un personnel
     */
	public String getNom() {
		return nom;
	}
	 /* 
     * Cette méthode renvoie le prenom d'un personnel
     */
	public String getPrenom() {
		return prenom;
	}
	
}
