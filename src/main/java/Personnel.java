import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Win10
 *
 */
public final class Personnel {
	
	private final String nom;
	
	private final String prenom;
	
	private final ArrayList<String> tel;
	
	private final java.time.LocalDate Date;
	
	
	private Personnel(Personnel_Builder builder)
	{
		this.nom=builder.nom;
		this.prenom=builder.prenom;
		this.tel= builder.tel;
		this.Date= builder.date;
		
	
	}
	
	public void tostring() {
		
		System.out.println("****************");
		System.out.print(prenom + " " + nom + ", Née le : " + Date
			+ ", numéro de téléphone : ");
		for (String i : tel) {
			System.out.print(i + "  ");
		}
		System.out.println("****************");
	}
	
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
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
}
