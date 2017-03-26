package nl.hu.iac.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import nl.hu.iac.service.ElektriciteitServiceImpl;
import nl.hu.iac.service.ServiceProvider;
import nl.hu.iac.service.Elektriciteit;

@Path("/prijzen")
public class ElektriciteitRestService {
	
	@GET
	@Path("/{prijsId}")
	@Produces({MediaType.APPLICATION_JSON})
	public Elektriciteit getPrijs(@PathParam("prijsId") int datum) {
		ElektriciteitServiceImpl elektriciteitServiceImpl = ServiceProvider.getTrackService();
		return elektriciteitServiceImpl.getTrackById(datum);
	}

	@GET
	@Path("/")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Elektriciteit> getAllePrijzen() {
		ElektriciteitServiceImpl elektriciteitServiceImpl = ServiceProvider.getTrackService();
		return elektriciteitServiceImpl.getElektriciteits();
	}
	
	@PUT
	@Consumes ({MediaType.APPLICATION_JSON})
	@Produces ({MediaType.APPLICATION_JSON})
	public Elektriciteit createUser(Elektriciteit elektriciteit){
		ElektriciteitServiceImpl elektriciteitServiceImpl = ServiceProvider.getTrackService();
		return elektriciteitServiceImpl.add(elektriciteit);

	}





}
