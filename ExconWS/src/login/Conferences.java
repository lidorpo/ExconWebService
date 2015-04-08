package login;



import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/conferences")
public class Conferences {
	
	@Path("/user_conferences")
	@POST
	@Produces("application/json")
	public List<entities.Conference> Mobile(@FormParam("uid") String uid) {
		
		List<entities.Conference> user_conferences = db.Conference.GetUserConferences(uid);

		return user_conferences;	
	}

}
