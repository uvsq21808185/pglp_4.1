import java.util.ArrayList;

/**
 * 
 */

/** Classe Personnel qui impl�mente la classe abstraire Interface_annuaire
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
     * @param builder pour cr�er le personnel
     */
	private Personnel(Personnel_Builder builder)
	{
		this.nom=builder.nom;
		this.prenom=builder.prenom;
		this.tel= builder.tel;
		this.Date= builder.date;
		
	
	}
	 /* 
     * Cette m�thode affiche le personnel : son nom, son prenom , sa date de naissance
     * et son num�ro de t�lephone sous forme d'une chaine de caract�res
     */
	public void tostring() {
		
		System.out.println("****************");
		System.out.print(prenom + " " + nom + ", N�e le : " + Date + ", num�ro de t�l�phone : ");
		for (String i : tel) {
			System.out.print(i + "  ");
		}
		System.out.println("\n");

		System.out.println("****************");
	}
	 /* 
     * La classe Personnel_Builder pour cr�er un personnel
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
     * Cette m�thode renvoie le nom d'un personnel
     */
	public String getNom() {
		return nom;
	}
	 /* 
     * Cette m�thode renvoie le prenom d'un personnel
     */
	public String getPrenom() {
		return prenom;
	}
	
}
