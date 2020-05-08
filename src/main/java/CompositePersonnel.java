import java.util.ArrayList;
import java.util.Iterator;
/** Classe CompositePersonnel qui hérite de la classe Abstraire Interface_annuaire.
 * 
 * @author ZAOUAM Sirageddine
 * @version 3.0
 */
public class CompositePersonnel extends Interface_annuaire {
	/*
	 * Le nom de l'annuaire.
	 */
	private String nomAnnuaire;
	/*
	 * La liste des personnels.
	 */
    private ArrayList<Interface_annuaire> listPersonnels = new ArrayList<Interface_annuaire>();
    /*
     * Implémentation de la méthode tostring de l'interface pour afficher un descriptif d'annuaire.
     */
    public void tostring() 
    {
        System.out.println("Annuaire de "+nomAnnuaire);
        for (Interface_annuaire ip : listPersonnels) {
			ip.tostring();
			}
    } 
    /*
     * Retourne la liste des personnels.
     * @return la liste des personnels
     */
    public ArrayList<Interface_annuaire> getlist(){
    	return listPersonnels;
    }
    /* 
     * Constructeur de la classe qui prend une chaine de caractère en entrée.
     */
    public CompositePersonnel(String nom)
    {
        this.nomAnnuaire = nom;
    }
    /* 
     * Constructeur par défault 
     */
    public CompositePersonnel(){
    	
    } 
    /* 
     * Méthode pour ajouter des personnels dans la liste.
     */
    public void addPersonnel(Interface_annuaire personnel)
    {
        listPersonnels.add(personnel);
    }
    /* 
     * Méthode pour supprimer des personnels de la liste.
     */

    public void removePersonnel(Personnel personnel)
    {
        listPersonnels.remove(personnel);
    }
    /* 
     * Cette méthode renvoie un itérateur sur ListPersonnels.
     * @return un itérateur sur la liste personnels.
     */
    public Iterator<Interface_annuaire> iterator() {
		return listPersonnels.iterator();
	}
    /* 
     * Cette méthode renvoie le nom de l'annuaire.
     * @return le nom de l'annuaire.
     */
    public final String getNomAnnuaire() {
    	return nomAnnuaire;
    }

}
