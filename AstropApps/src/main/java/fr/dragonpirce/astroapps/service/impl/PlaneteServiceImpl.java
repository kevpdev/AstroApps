/**
 * 
 */
package fr.dragonpirce.astroapps.service.impl;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.dragonpirce.astroapps.model.Planete;
import fr.dragonpirce.astroapps.repository.PlaneteRepository;
import fr.dragonpirce.astroapps.service.PlaneteService;

/**
 * @author nivek
 *
 */

@Path("/planetes")
public class PlaneteServiceImpl implements PlaneteService {

	@Autowired
	private PlaneteRepository planeteRepository;
	
	/* (non-Javadoc)
	 * @see fr.dragonpirce.astroapps.service.PlaneteService#getPlanetes()
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public List<Planete> getPlanetes() {
		return (List<Planete>) planeteRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see fr.dragonpirce.astroapps.service.PlaneteService#getPlaneteById(long)
	 */
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public Planete getPlaneteById(@PathParam("id") long id) {
		return planeteRepository.findById(id).get();
	}

	/* (non-Javadoc)
	 * @see fr.dragonpirce.astroapps.service.PlaneteService#getPlaneteByName(java.lang.String)
	 */
	@GET
	@Path("/name/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public Planete getPlaneteByName(@PathParam("name") String name) {
		return planeteRepository.findByNom(name);
	}

	/* (non-Javadoc)
	 * @see fr.dragonpirce.astroapps.service.PlaneteService#updatePlanete(fr.dragonpirce.astroapps.model.Planete)
	 */
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public boolean updatePlanete(Planete planete) {
		if(planeteRepository.existsById(planete.getIdPlanete())) {
			 planeteRepository.save(planete);
			 return true;
		}		
		return false;

	}

	/* (non-Javadoc)
	 * @see fr.dragonpirce.astroapps.service.PlaneteService#deletePlanete(fr.dragonpirce.astroapps.model.Planete)
	 */
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public boolean deletePlanete(Planete planete) {
		if(planeteRepository.existsById(planete.getIdPlanete())) {
			planeteRepository.deleteById(planete.getIdPlanete());
			return true;
		}
		return false;
	}
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public boolean addPlanete(Planete planete) {
		Planete p = planeteRepository.save(planete);
		if (p != null) {
			return true;
		}
		return false;
	}

}
