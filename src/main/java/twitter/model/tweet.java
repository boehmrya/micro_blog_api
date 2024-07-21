package twitter.model;
import java.time.LocalDateTime;

public class Tweet {
    private String text;
    private LocalDateTime createdDate;
    private Integer authorId;

    public Tweet() {}

    public Tweet(String text, LocalDateTime createdDate, Integer authorId) {
        this.text = text;
        this.createdDate = createdDate;
        this.authorId = authorId;
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
