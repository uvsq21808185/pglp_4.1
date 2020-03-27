import java.util.ArrayList;
import java.util.Iterator;

public class Afficher implements Iterable<Interface_annuaire>  {

	
	private ArrayList<Interface_annuaire> c = new ArrayList<Interface_annuaire>();
	/**
	 * retourne un it�rateur sur la liste g�n�r� par le parcours.
	 * @return it�rateur sur la liste
	 */
	public Iterator<Interface_annuaire> iterator() {
		return c.iterator();
	}
	/**
	 * affiche le parcours en largeur.
	 */
	public void print() {
		CompositePersonnel tmp;
		//affichage du parcours
		for (Interface_annuaire c2 : c) {
			if (c2.getClass() == CompositePersonnel.class) {
				tmp = (CompositePersonnel) c2;
				System.out.println(tmp.getNomAnnuaire());
			} else {
				c2.tostring();
			}
		}
	}
}
