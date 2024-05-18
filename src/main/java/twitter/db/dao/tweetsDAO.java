package twitter.db.dao;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

public interface tweetsDAO {
    @SqlQuery("SELECT * FROM your_table WHERE id = :id")
    YourEntity findEntityById(@Bind("id") int id);
}
