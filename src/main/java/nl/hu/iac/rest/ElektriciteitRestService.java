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
import nl.hu.iac.service.Prijs;
import nl.hu.iac.service.ServiceProvider;

@Path("/prijzen")
public class ElektriciteitRestService {
	
	@GET
	@Path("/{prijsId}")
	@Produces({MediaType.APPLICATION_JSON})
	public Prijs getPrijs(@PathParam("prijsId") int datum) {
		ElektriciteitServiceImpl elektriciteitServiceImpl = ServiceProvider.getTrackService();
		return elektriciteitServiceImpl.getPrijsBijDatum(datum);
	}

	@GET
	@Path("/")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Prijs> getAllePrijzen() {
		ElektriciteitServiceImpl elektriciteitServiceImpl = ServiceProvider.getTrackService();
		return elektriciteitServiceImpl.getPrijzen();
	}
	
	@PUT
	@Consumes ({MediaType.APPLICATION_JSON})
	@Produces ({MediaType.APPLICATION_JSON})
	public Prijs createUser(Prijs prijs){
		ElektriciteitServiceImpl elektriciteitServiceImpl = ServiceProvider.getTrackService();
		return elektriciteitServiceImpl.add(prijs);

	}





}
