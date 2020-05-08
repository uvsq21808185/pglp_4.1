import java.time.LocalDate;
import java.util.ArrayList;

/**
 * La classe main
 * @author ZAOUAM Sirageddine
 * @version 2.0
 *
 */
public class App {
	/**
	 * @param args arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Création des composites
		CompositePersonnel c1 = new CompositePersonnel();
    	CompositePersonnel c2 = new CompositePersonnel();
    	CompositePersonnel c3 = new CompositePersonnel();
    	//Création des numéros
    	ArrayList<String> numero = new ArrayList<String>();
    	numero.add("06.23.43.55.40");
    	numero.add("07.54.43.22.10");
    	numero.add("01.50.00.22.99");
    	
    	//Création d'un personnel en utilisant le pattern builder.
        Personnel p = new Personnel.Personnel_Builder(
        	"Stevan", "Elie", LocalDate.of(2000, 05, 04), numero).build();
        Personnel p2 = new Personnel.Personnel_Builder(
            	"Bill", "Gates", LocalDate.of(2000, 05, 04), numero).build();
        //Ajout des personnels dans des composites.
        c1.addPersonnel(p);
        c2.addPersonnel(c1);
        c2.addPersonnel(p2);
        c3.addPersonnel(c2);
        // La liste des personnels :
        ArrayList<Interface_annuaire> liste_personnels = c3.getlist();
        //Affichage
        c3.tostring();
        System.out.println("\n\nParcours en largeur : ");
        Afficher aff = new Afficher(liste_personnels);
        aff.print();        
      
	}
}
