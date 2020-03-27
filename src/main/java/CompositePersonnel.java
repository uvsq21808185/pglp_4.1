import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 */

/**
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
    public CompositePersonnel(String nom)
    {
        this.nomAnnuaire = nom;
    }
    public CompositePersonnel(){
    	
    }
   

    public void addPersonnel(Interface_annuaire personnel)
    {
        listPersonnels.add(personnel);
    }

    public void removePersonnel(Personnel personnel)
    {
        listPersonnels.remove(personnel);
    }
    
    public Iterator<Interface_annuaire> iterator() {
		return listPersonnels.iterator();
	}
    public final String getNomAnnuaire() {
    	return nomAnnuaire;
    
    }


}
