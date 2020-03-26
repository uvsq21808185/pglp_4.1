import java.awt.List;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Win10
 *
 */
public class CompositePersonnel implements Annuaire {
	
	private String nomAnnuaire;
    private ArrayList<Personnel> listPersonnels = new ArrayList<Personnel>();

    public void print() 
    {
        // TODO Auto-generated method stub
        System.out.println("Annuaire de "+nomAnnuaire);
    }

    public CompositePersonnel(String nom)
    {
        this.nomAnnuaire = nom;
    }

    public void addPersonnel(Personnel personnel)
    {
        listPersonnels.add(personnel);
    }

    public void removePersonnel(Personnel personnel)
    {
        listPersonnels.remove(personnel);
    }

}
