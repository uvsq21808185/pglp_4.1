import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 */

/** Classe CompositePersonnel qui hérite de la classe Abstraire Interface_annuaire
 * @author Win10
 *
 */
public class CompositePersonnel extends Interface_annuaire {
	
	private String nomAnnuaire;
    private ArrayList<Interface_annuaire> listPersonnels = new ArrayList<Interface_annuaire>();

    public void tostring() 
    {
        System.out.println("Annuaire de "+nomAnnuaire);
        for (Interface_annuaire ip : listPersonnels) {
			ip.tostring();
    }
    }
    //
   // public Interface_annuaire pollFirst(ArrayList<Interface_annuaire> listPersonnels) {
    //	Interface_annuaire c = listPersonnels[0];
    //}
//
    /* 
     * Constructeur qui prend une chaine de caractère en entrée 
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
     * Méthode pour ajouter des personnels dans la liste 
     */
    public void addPersonnel(Interface_annuaire personnel)
    {
        listPersonnels.add(personnel);
    }
    /* 
     * Méthode pourcsupprimer des personnels de la liste 
     */

    public void removePersonnel(Personnel personnel)
    {
        listPersonnels.remove(personnel);
    }
    /* 
     * Cette méthode renvoie un itérateur sur ListPersonnels
     */
    public Iterator<Interface_annuaire> iterator() {
		return listPersonnels.iterator();
	}
    /* 
     * Cette méthode renvoie le nom de l'annuaire
     */
    public final String getNomAnnuaire() {
    	return nomAnnuaire;
    
    }


}
