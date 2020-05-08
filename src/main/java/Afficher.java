import java.util.ArrayList;
import java.util.Iterator;
/*
 * Classe Afficher qui implémente la méthode print pour afficher le parcours
 * en largeur.
 * 
 * @author ZAOUAM SIrgaeddine
 * @version 2.0
 */
public class Afficher implements Iterable<Interface_annuaire>  {
	/*
	 * Une liste de personnel
	 */
	private ArrayList<Interface_annuaire> c = new ArrayList<Interface_annuaire>();
	/*
	 * Constructeur de la classe
	 */
	public Afficher(ArrayList<Interface_annuaire> liste) {
		this.c=liste;
	}
	/**
	 * retourne un itérateur sur la liste généré par le parcours.
	 * @return itérateur sur la liste
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
