package twitter.db.dao;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.Bind;
import twitter.model.Tweet;

public interface tweetsDAO {
    @SqlQuery("SELECT * FROM tweets WHERE id = :id")
    Tweet findTweetById(@Bind("id") int id);
}
