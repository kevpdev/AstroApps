/**
 * 
 */
package fr.dragonpirce.astroapps.dao;

import java.util.List;

import fr.dragonpirce.astroapps.model.Planete;

/**
 * @author nivek
 *
 */
public interface PlaneteDao {
	
	/**
	 * 
	 */
	public List<Planete> getPlanetes();
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Planete getPlaneteById(long id);
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public Planete getPlaneteByName(String name);
	
	/**
	 * 
	 * @param planete
	 * @return
	 */
	public boolean addPlanete(Planete planete);
	
	/**
	 * 
	 * @param planete
	 * @return
	 */
	public boolean updatePlanete(Planete planete);
	
	/**
	 * 
	 * @param planete
	 * @return
	 */
	public boolean deletePlanete(Planete planete);
	
	

}
