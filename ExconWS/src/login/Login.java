package login;



import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;




@Path("/login")
public class Login {
	@Path("/website")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response Website(@FormParam("userName") String userName, @FormParam("password") String password) {
		
		String result;
		
		if(userName.equals("lidor") && password.equals("politzer")){
			result = "User is authenticated";
		} else {
			result = "Who the fuck you are?";
		}
		
		return Response.status(200).entity(result).build();
	}
	
	@Path("/mobile")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public entities.User Mobile(@FormParam("email") String email) {
		
		entities.User us;
		us = db.User.GetUserInfo(email);

		return us;	
	}
}
