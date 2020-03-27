import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

public class PersonnelTest {

	@Test
	public void test() {
		ArrayList<String> numero = new ArrayList<String>();
    	numero.add("07.65.90.76.23");
        Personnel p = new Personnel.Personnel_Builder("Jeff", "Bezos", LocalDate.of(2000, 05, 04), numero).build();
        p.tostring();
        assertNotNull(p);
        }

}
