package cours.agilite.projetVille;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import cours.agilite.projetVille.gaulois.Romain;
import cours.agilite.projetVille.gaulois.Gaulois;


public class GauloisTest {

	private Gaulois asterix;
	private Gaulois obelix;
	private Romain cesar;
	
	//test
	
	@Before
	public void setUp() 
	{
		asterix = new Gaulois();
		obelix = new Gaulois();
		cesar = new Romain(10, 15, asterix);
	}

	/***
	 * Cette méthode permet de tester les gets des classes Gaulois et Romain 
	 * pour les champs vitesse, force et ennemi 
	 * (la liste d'amis sera testée dans une autre méthode spécifique)
	 */
	@Test
	public void testCreationPersonnage() 
	{
		assertEquals(cesar.getForce(),15);
		assertEquals(cesar.getVitesse(),10);
		assertEquals(cesar.getEnnemi(),asterix);

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
		cesar.setForce(1);
		cesar.setVitesse(30);
		cesar.setEnnemi(obelix);

		asterix.setForce(8);
		asterix.setVitesse(20);
		asterix.setEnnemi(cesar);

		assertEquals(cesar.getForce(),1);
		assertEquals(cesar.getVitesse(),30);
		assertEquals(cesar.getEnnemi(),obelix);

		assertEquals(asterix.getForce(),8);
		assertEquals(asterix.getVitesse(),20);
		assertEquals(asterix.getEnnemi(),cesar);
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

	/***
	 * Cette méthode vérifie que le romain attaque bien uniquement lorsque sa force est supérieure à celle 
	 * son adversaire
	 */
	@Test
	public void testPeutAttaquerEnnemi() 
	{
		asterix.setForce(10);
		cesar.setForce(50);
		cesar.setEnnemi(asterix);

		assertTrue(cesar.peutAttaquerEnnemi());
		asterix.boirePotionMagique();
		assertFalse(cesar.peutAttaquerEnnemi());
	}

	/***
	 * Cette méthode effectue tous les tests liés à la liste d'amis d'un gaulois
	 */
	@Test
	public void testAmisGaulois() 
	{
		//test du getAmis
		obelix.addAmi(asterix);
		ArrayList<Gaulois> listeTest = new ArrayList<Gaulois>();
		listeTest.add(asterix);
		assertEquals(obelix.getAmis(),listeTest);
		ArrayList<Gaulois> listeTest2 = new ArrayList<Gaulois>();
		listeTest2.add(obelix);
		assertEquals(asterix.getAmis(),listeTest2);

		//teste qu'un ami n'est ajouté qu'une fois
		obelix.addAmi(asterix);
		assertEquals(obelix.getAmis(),listeTest);
		assertEquals(asterix.getAmis(),listeTest2);

		//teste qu'un ami est bien supprime des deux listes d'amis 
		listeTest = new ArrayList<Gaulois>();
		listeTest.add(asterix);
		listeTest.add(asterix);
		obelix.setAmis(listeTest);
		obelix.deleteAmi(asterix);
		assertEquals(obelix.getAmis(),new ArrayList<Gaulois>());
		assertEquals(asterix.getAmis(),new ArrayList<Gaulois>());

		//teste du setAmis
		listeTest = new ArrayList<Gaulois>();
		listeTest.add(asterix);
		obelix.setAmis(listeTest);
		listeTest2 = new ArrayList<Gaulois>();
		listeTest2.add(obelix);
		assertEquals(obelix.getAmis(),listeTest);
		assertEquals(asterix.getAmis(),listeTest2);

		//teste qu'on ne peut pas set une liste qui contient le gaulois lui meme 
		obelix.setAmis(new ArrayList<Gaulois>());
		listeTest = new ArrayList<Gaulois>();
		listeTest.add(asterix);
		listeTest.add(obelix);
		obelix.setAmis(listeTest);
		assertEquals(obelix.getAmis(),new ArrayList<Gaulois>());
	}

}
