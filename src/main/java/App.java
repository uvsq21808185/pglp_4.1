import java.time.LocalDate;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Win10
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompositePersonnel c1 = new CompositePersonnel();
    	CompositePersonnel c2 = new CompositePersonnel();
    	CompositePersonnel c3 = new CompositePersonnel();
    	
    	ArrayList<String> numero = new ArrayList<String>();
    	numero.add("06.23.43.55.40");
    	numero.add("07.54.43.22.10");
    	numero.add("01.50.00.22.99");
    	
    	
        Personnel p = new Personnel.Personnel_Builder(
        	"Stevan", "Elie", LocalDate.of(2000, 05, 04), numero).build();
        
        c3.addPersonnel(p);
        c2.addPersonnel(c3);
        c1.addPersonnel(c2);
        Afficher aff = new Afficher();
        aff.print();
        System.out.println("\n\nParcours en profondeur : ");
        c1.tostring();

	}

}
