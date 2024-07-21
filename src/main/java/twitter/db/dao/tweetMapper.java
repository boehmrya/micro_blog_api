package twitter.db.dao;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;
import java.sql.ResultSet;
import java.sql.SQLException;
import twitter.model.Tweet;

public class tweetMapper implements RowMapper<Tweet> {
    @Override
    public Tweet map(ResultSet rs, StatementContext ctx) throws SQLException {
        Tweet tweet = new Tweet();
        tweet.setText(rs.getString("text"));
        tweet.setCreatedDate(rs.getTimestamp("createdDate").toLocalDateTime());
        tweet.setAuthorId(rs.getInt("authorId"));
        return tweet;
    }
}
