import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.dsk.bean.Patients;
import com.dsk.controller.Fetch;
import com.dsk.dbconnection.DSKDaoImplementation;

public class TestOPData {
	DSKDaoImplementation dsk = new DSKDaoImplementation();
	@Test
	public void patientsdata() {
		
		List<Patients> data = dsk.Fetch();
		assertEquals(Fetch.size(), 3);
		assertEquals(Fetch.get(0).getPatientNumber(), 1);
		
		
	}
	

}
