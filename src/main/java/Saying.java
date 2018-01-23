import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

/**
 * Created by devraj.singh on 6/24/17.
 */
public class Saying {

    private long id;
    @Length (max = 3)
    private String content;

    public Saying() {
        // Jackson
    }
    public Saying(long id, String content)
    {
        this.id = id;
        this.content = content;
    }
    @JsonProperty
    public long getId()
    {
        return id;
    }
    @JsonProperty String getContent()
    {
        return content;
    }
}
