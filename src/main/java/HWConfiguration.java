import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by devraj.singh on 6/23/17.
 */
public class HWConfiguration extends Configuration {

    @NotEmpty
    private String template;
    @NotEmpty
    private String defaultName = "Devraj the monk who sold his code";

    @JsonProperty
    public String getTemplate()
    {
        return template;
    }
    @JsonProperty
    public void setTemplate(String template)
    {
        this.template = template;
    }
    @JsonProperty
    public String getDefaultName()
    {
        return defaultName;
    }
    @JsonProperty
    public void setDefaultName(String defaultName)
    {
        this.defaultName = defaultName; float g = 2.3f;
    }
}
