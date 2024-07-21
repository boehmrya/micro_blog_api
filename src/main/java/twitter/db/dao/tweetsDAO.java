package twitter.db.dao;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import twitter.model.Tweet;
import twitter.model.User;
import java.util.List;

public interface tweetsDAO {

    @SqlQuery("SELECT * FROM tweets WHERE id = :id")
    @RegisterBeanMapper(value = Tweet.class, prefix = "tweet")
    Tweet findTweetById(@Bind("id") int id);

    @SqlQuery("SELECT t.id AS tweet_id, t.text AS tweet_text, t.created_date AS tweet_created_date, u.id AS user_id, u.name AS user_name, a.bio " +
              "FROM tweets t " +
              "JOIN users u ON t.author_id = u.id " +
              "WHERE u.id = :id")
    @RegisterBeanMapper(value = Tweet.class, prefix = "tweet")
    @RegisterBeanMapper(value = User.class, prefix = "user")
    List<Tweet> getAllTweetsByAuthor(@Bind("id") int id);
}
