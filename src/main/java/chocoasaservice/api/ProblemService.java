package chocoasaservice.api;

import chocoasaservice.entities.Problem;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by tandrieux on 26/05/2017.
 */
@Path("/problem")
public class ProblemService {
	@POST
	@Consumes("application/xml")
	@Produces("application/json")
	public String postProblem(String xml) {
		Problem pb = new Problem(xml);
		return "{ text: " + xml + " }";
	}

	@GET
	@Path("{id}")
	public Response getProblem(@PathParam("id") int id) {
		return Response.status(200).build();
	}
}
