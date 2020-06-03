package cours.agilite.projetVille;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import cours.agilite.projetVille.gaulois.Romain;
import cours.agilite.projetVille.gaulois.Gaulois;


public class AdaptateurTest {

	private AdaptateurGaulois asterix;
	private AdaptateurGaulois obelix;
	private Romain cesar;
	private Pays gaule;
	private Ville ville;
	
	//test
	
	@Before
	public void setUp() 
	{
		gaule = new Pays("Gaule");
		ville = new Ville("village", gaule);
		asterix = new AdaptateurGaulois("Asterix", "", "H", ville, 10, 10);
		asterix = new AdaptateurGaulois("Obelix", "", "H", ville, 10, 10);
	}

	/***
	 * Cette méthode permet de tester les gets des classes Gaulois et Romain 
	 * pour les champs vitesse, force et ennemi 
	 * (la liste d'amis sera testée dans une autre méthode spécifique)
	 */
	@Test
	public void testCreationPersonnage() 
	{
		assertEquals(asterix.getForce(),10);
		assertEquals(asterix.getVitesse(),10);
	}

	/***
	 * Cette méthode permet de tester les sets des classes Gaulois et Romain 
	 * pour les champs vitesse, force et ennemi 
	 * (la liste d'amis sera testée dans une autre méthode spécifique)
	 */
	@Test
	public void testSet() 
	{
		asterix.setForce(8);
		asterix.setVitesse(20);

		assertEquals(asterix.getForce(),8);
		assertEquals(asterix.getVitesse(),20);
	}

	/***
	 * Cette méthode vérifie que la force et la vitesse passe bien à 500 apres avoir bu de la potion magique
	 */
	@Test
	public void testPotionGauloise() 
	{
		asterix.boirePotionMagique();
		assertTrue(asterix.getForce()>=500 & asterix.getVitesse()>=500);
	}
	

}
