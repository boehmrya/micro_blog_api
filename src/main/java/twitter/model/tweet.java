package twitter.model;
import java.time.LocalDateTime;

public class Tweet {
    private int id;
    private String text;
    private LocalDateTime createdDate;
    private Integer authorId;

    public Tweet() {}

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}
