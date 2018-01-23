import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by devraj.singh on 6/23/17.
 */
public class HelloWorld extends Application<HWConfiguration>{
    public static void main(String[] args) throws Exception {
        new HelloWorld().run(args);
    }
    @Override
    public String getName()
    {
        return "My Name is Devraj...";
    }
    @Override
    public void initialize(Bootstrap<HWConfiguration> bootstrap)
    {
        // nothing now
    }
    @Override
    public void run(HWConfiguration hwConfiguration, Environment environment)
    {
        final HelloWorldResource helloWorldResource = new HelloWorldResource(hwConfiguration.getTemplate(),
                hwConfiguration.getDefaultName());
        final TemplateHealthCheck templateHealthCheck = new TemplateHealthCheck(hwConfiguration.getTemplate());
        environment.healthChecks().register("template", templateHealthCheck);
        environment.jersey().register(helloWorldResource);
    }
}
