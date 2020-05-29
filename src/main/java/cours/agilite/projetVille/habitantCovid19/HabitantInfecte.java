package cours.agilite.projetVille.habitantCovid19;

import java.util.Date;

import cours.agilite.projetVille.Habitant;
import cours.agilite.projetVille.Ville;

public class HabitantInfecte extends Habitant{
	
	public HabitantInfecte(String prenom, String nom, Date dateNaissance, String sexe, boolean depistage,
			boolean positifCOVID, Ville ville, int nir) {
		super(prenom, nom, dateNaissance, sexe, depistage, positifCOVID, ville);
		// TODO Auto-generated constructor stub
	}

	boolean positif;
	boolean symptomes;
	boolean possedeAnticorps;
	
	StatutMalade statutMalade;
	Etat etatGravite;
	
	
	public boolean isPositif() {
		return positif;
	}
	public void setPositif(boolean positif) {
		this.positif = positif;
	}
	public boolean isSymptomes() {
		return symptomes;
	}
	public void setSymptomes(boolean symptomes) {
		this.symptomes = symptomes;
	}
	public boolean isPossedeAnticorps() {
		return possedeAnticorps;
	}
	public void setPossedeAnticorps(boolean possedeAnticorps) {
		this.possedeAnticorps = possedeAnticorps;
	}
	public StatutMalade getStatutMalade() {
		return statutMalade;
	}
	public void setStatutMalade(StatutMalade statutMalade) {
		this.statutMalade = statutMalade;
	}
	public Etat getEtatGravite() {
		return etatGravite;
	}
	public void setEtatGravite(Etat etatGravite) {
		this.etatGravite = etatGravite;
	}
	
	@Override
	public String toString() {
		return "HabitantInfecte [positif=" + positif + ", symptomes=" + symptomes + ", possedeAnticorps="
				+ possedeAnticorps + ", statutMalade=" + statutMalade + ", etatGravite=" + etatGravite + "]";
	}
	
	
	

}
