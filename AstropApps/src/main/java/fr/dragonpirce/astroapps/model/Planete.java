/**
 * 
 */
package fr.dragonpirce.astroapps.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import fr.dragonpirce.astroapps.model.enums.Categorie;
import fr.dragonpirce.astroapps.model.enums.TypePlanete;

/**
 * @author nivek
 *
 */
@Entity
@Table(name="PLANETE")
public class Planete {
	@Id
	@GeneratedValue
	@Column(name="id_planete")
	private long idPlanete;
	
	@Column(name="nom", nullable = false)
	private String nom;
	
	@Enumerated(EnumType.STRING)
	@Column(name="type_planete")
	private TypePlanete typePlanete;
	
	@Column(name="nb_anneau")
	private int nbAnneau;
	
	@Column(name="nb_satellite")
	private int nbSatellite;
	
	@Column(name="description")
	private String description;
	
	@Enumerated(EnumType.STRING)
	@Column(name="categorie")
	private Categorie categorie;
	
	@Column(name="url_image")
	private String urlImage;	
	
	/**
	 * 
	 */
	public Planete() {
		super();
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
