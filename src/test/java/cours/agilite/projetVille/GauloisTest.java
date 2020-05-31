package cours.agilite.projetVille;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import cours.agilite.projetVille.gaulois.Gaulois;

import org.junit.After;
import org.junit.Before;;

class GauloisTest {
	
        /**
         * Verifie si la methode addAmi relie bien les deux objets en ajoutant chacun a la liste de l'autre
         */
	    @Test
	    public void testAddAmi()
	    {
	        Gaulois asterix=new Gaulois();
	        Gaulois obelix=new Gaulois(500,500);
	        asterix.addAmi(obelix);
	        assertTrue(asterix.getAmis().contains(obelix));
	        assertTrue(obelix.getAmis().contains(asterix));
	        
	        
	    }
	    
	    
	  /**
        * Verifie si la methode removeAmi coupe le lien d'amitie dans les deux sens en enlevant chacun de la liste d'amis de l'autre 
       */ 
	 @Test
	 public void testRemoveAmi() 
	    {
		 
		 
	        Gaulois asterix=new Gaulois();
	        Gaulois obelix=new Gaulois(500,500);
	        asterix.addAmi(obelix);
	        asterix.deleteAmi(obelix);
	        assertFalse(asterix.getAmis().contains(obelix));
	        assertFalse(obelix.getAmis().contains(asterix));	        	       
	        
	    }

}
