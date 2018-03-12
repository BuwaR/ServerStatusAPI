package services;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@Path("/status")
public class CheckStatus {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response serverStatus(){
		JsonObject result = Json.createObjectBuilder()
				.add("error", false)
				.add("message", "request processed successfully")
				.add("status", 200)
				.build();
		return Response.status(200).entity(result).build();
	}
}