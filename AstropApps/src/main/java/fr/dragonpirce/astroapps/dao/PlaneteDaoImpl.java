/**
 * 
 */
package fr.dragonpirce.astroapps.dao;

import java.util.ArrayList;
import java.util.List;

import fr.dragonpirce.astroapps.model.Planete;
import fr.dragonpirce.astroapps.model.enums.Categorie;
import fr.dragonpirce.astroapps.model.enums.TypePlanete;

/**
 * @author nivek
 *
 */
public class PlaneteDaoImpl implements PlaneteDao {
	
	private List<Planete> listPlanetes;
	
	

	public PlaneteDaoImpl() {
		super();
		this.listPlanetes = new ArrayList<Planete>(); {
		this.listPlanetes.add(new Planete(1, "Terre", TypePlanete.tellurique, 0, 1, "texte ...", Categorie.planete, ""));
		this.listPlanetes.add(new Planete(2, "Jupiter", TypePlanete.gazeuse, 3, 72, "texte ...", Categorie.planete, ""));
		this.listPlanetes.add(new Planete(3, "Pluton", TypePlanete.tellurique, 0, 5, "texte ...", Categorie.naine, ""));
			
		};
	}
	


	/* (non-Javadoc)
	 * @see fr.dragonpirce.astroapps.dao.PlaneteDao#getPlanetes()
	 */
	@Override
	public List<Planete> getPlanetes() {

		return this.listPlanetes;
	}

	/* (non-Javadoc)
	 * @see fr.dragonpirce.astroapps.dao.PlaneteDao#getPlaneteById(long)
	 */
	@Override
	public Planete getPlaneteById(long id) {

		return this.listPlanetes.stream()
				.filter(planete -> id == planete.getIdPlanete())
				.findAny()
				.orElse(null);
	}

	/* (non-Javadoc)
	 * @see fr.dragonpirce.astroapps.dao.PlaneteDao#getPlaneteByName(java.lang.String)
	 */
	@Override
	public Planete getPlaneteByName(String name) {
		return this.listPlanetes.stream()
				.filter(planete -> name == planete.getNom())
				.findAny()
				.orElse(null);
	}

	/* (non-Javadoc)
	 * @see fr.dragonpirce.astroapps.dao.PlaneteDao#updatePlanete(fr.dragonpirce.astroapps.model.Planete)
	 */
	@Override
	public boolean updatePlanete(Planete planete) {
		listPlanetes.stream()
		.filter(plan -> plan.equals(planete))
		.forEach(plan -> plan = planete);
		return true;
	}

	/* (non-Javadoc)
	 * @see fr.dragonpirce.astroapps.dao.PlaneteDao#deletePlanete(fr.dragonpirce.astroapps.model.Planete)
	 */
	@Override
	public boolean deletePlanete(Planete planete) {
		return listPlanetes.removeIf(plan -> plan.equals(planete));

	}



	@Override
	public boolean addPlanete(Planete planete) {
		
		return listPlanetes.add(planete);
	}

}
