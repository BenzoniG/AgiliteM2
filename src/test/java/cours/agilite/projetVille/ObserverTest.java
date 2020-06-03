package cours.agilite.projetVille;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObserverTest {

	@Test
	public void test() throws Exception 
	{
		Pays france = new Pays("France");
		Ville paris = new Ville("Paris", france);
		Ville montpelier = new Ville("Montpelier", france);
		Habitant asterix = new AdaptateurGaulois("Asterix", "", "H", paris, 10 , 10);
		Habitant obelix = new AdaptateurGaulois("Obelix", "", "H", paris, 10 , 10);
		Habitant falbala = new AdaptateurGaulois("Falbala", "", "F", paris, 10 , 10);
		
		paris.tauxInfection();
		assertEquals(0, paris.getTauxInfection(), 0);
		obelix.setTestCovid(true);
		assertEquals(0, paris.getTauxInfection(), 0);
		asterix.demenager(montpelier);
		assertEquals(0, paris.getTauxInfection(), 0);
		asterix.addObserver(paris);
		asterix.setTestCovid(true);
		assertEquals(0.5, paris.getTauxInfection(), 0);
	}

}
