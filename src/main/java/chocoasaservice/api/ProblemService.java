package chocoasaservice.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created by tandrieux on 26/05/2017.
 */
@Path("/problem")
public class ProblemService {
	@POST
	public Response postProblem() {
		return Response.status(200).build();
	}

	@GET
	@Path("{id}")
	public Response getProblem(@PathParam("id") int id) {
		return Response.status(200).build();
	}
}
