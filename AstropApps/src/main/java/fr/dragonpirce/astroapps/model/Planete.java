/**
 * 
 */
package fr.dragonpirce.astroapps.model;

import fr.dragonpirce.astroapps.model.enums.Categorie;
import fr.dragonpirce.astroapps.model.enums.TypePlanete;

/**
 * @author nivek
 *
 */
public class Planete {
	
	private long idPlanete;
	private String nom;
	private TypePlanete typePlanete;
	private int nbAnneau;
	private int nbSatellite;
	private String description;
	private Categorie categorie;
	private String urlImage;
	
	
	
	/**
	 * 
	 */
	public Planete() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	/**
	 * @param idPlanete
	 * @param nom
	 * @param prenom
	 * @param typePlanete
	 * @param nbAnneau
	 * @param nbSatellite
	 * @param description
	 * @param categorie
	 * @param urlImage
	 */
	public Planete(long idPlanete, String nom, TypePlanete typePlanete, int nbAnneau, int nbSatellite,
			String description, Categorie categorie, String urlImage) {
		super();
		this.idPlanete = idPlanete;
		this.nom = nom;
		this.typePlanete = typePlanete;
		this.nbAnneau = nbAnneau;
		this.nbSatellite = nbSatellite;
		this.description = description;
		this.categorie = categorie;
		this.urlImage = urlImage;
	}




	/**
	 * @return the idPlanete
	 */
	public long getIdPlanete() {
		return idPlanete;
	}
	/**
	 * @param idPlanete the idPlanete to set
	 */
	public void setIdPlanete(long idPlanete) {
		this.idPlanete = idPlanete;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the typePlanete
	 */
	public TypePlanete getTypePlanete() {
		return typePlanete;
	}
	/**
	 * @param typePlanete the typePlanete to set
	 */
	public void setTypePlanete(TypePlanete typePlanete) {
		this.typePlanete = typePlanete;
	}
	/**
	 * @return the nbAnneau
	 */
	public int getNbAnneau() {
		return nbAnneau;
	}
	/**
	 * @param nbAnneau the nbAnneau to set
	 */
	public void setNbAnneau(int nbAnneau) {
		this.nbAnneau = nbAnneau;
	}
	/**
	 * @return the nbSatellite
	 */
	public int getNbSatellite() {
		return nbSatellite;
	}
	/**
	 * @param nbSatellite the nbSatellite to set
	 */
	public void setNbSatellite(int nbSatellite) {
		this.nbSatellite = nbSatellite;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}
	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	/**
	 * @return the urlImage
	 */
	public String getUrlImage() {
		return urlImage;
	}
	/**
	 * @param urlImage the urlImage to set
	 */
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	
	
	
}
