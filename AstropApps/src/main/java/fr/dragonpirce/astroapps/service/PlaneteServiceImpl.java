/**
 * 
 */
package fr.dragonpirce.astroapps.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;

import fr.dragonpirce.astroapps.dao.PlaneteDao;
import fr.dragonpirce.astroapps.model.Planete;

/**
 * @author nivek
 *
 */
@Path("/planetes")
public class PlaneteServiceImpl implements PlaneteService {

	@Autowired
	private PlaneteDao planeteDao;
	
	/* (non-Javadoc)
	 * @see fr.dragonpirce.astroapps.service.PlaneteService#getPlanetes()
	 */
	@GET
	@Path("/")
	@Procedure(MediaType.APPLICATION_JSON)
	@Override
	public List<Planete> getPlanetes() {
		return planeteDao.getPlanetes();
	}

	/* (non-Javadoc)
	 * @see fr.dragonpirce.astroapps.service.PlaneteService#getPlaneteById(long)
	 */
	@GET
	@Path("/{id}")
	@Override
	public Planete getPlaneteById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.dragonpirce.astroapps.service.PlaneteService#getPlaneteByName(java.lang.String)
	 */
	@Override
	public Planete getPlaneteByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.dragonpirce.astroapps.service.PlaneteService#updatePlanete(fr.dragonpirce.astroapps.model.Planete)
	 */
	@Override
	public boolean updatePlanete(Planete planete) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see fr.dragonpirce.astroapps.service.PlaneteService#deletePlanete(fr.dragonpirce.astroapps.model.Planete)
	 */
	@Override
	public boolean deletePlanete(Planete planete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addPlanete(Planete planete) {
		// TODO Auto-generated method stub
		return false;
	}

}
