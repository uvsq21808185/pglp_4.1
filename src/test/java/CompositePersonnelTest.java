import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class CompositePersonnelTest {

	@Test
	public void testAdd() {
		CompositePersonnel res = new CompositePersonnel("service");
		res.addPersonnel(new CompositePersonnel("Departement"));
		assertNotNull(res);
		
	}
	public void testConstructeur() {
		CompositePersonnel res = new CompositePersonnel();
		Iterator<Interface_annuaire> ip = res.iterator();
		assertFalse(ip.hasNext());
	}

}
