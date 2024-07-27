package twitter.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/tweets")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TweetsResource {
    private final TweetsDAO personDAO;

    public TweetsResource(TweetsDAO tweetsDAO) {
        this.tweetsDAO = tweetsDAO;
    }

    @GET
    public List<Tweet> getAllTweets() {
        return tweetsDAO.findAll();
    }
}
