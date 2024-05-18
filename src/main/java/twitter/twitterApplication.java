package twitter;

import org.jdbi.v3.core.Jdbi;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import io.dropwizard.jdbi3.JdbiFactory;
import twitter.health.TemplateHealthCheck;
import twitter.resources.HelloWorldResource;

public class twitterApplication extends Application<twitterConfiguration> {

    public static void main(final String[] args) throws Exception {
        new twitterApplication().run(args);
    }

    @Override
    public String getName() {
        return "twitter";
    }

    @Override
    public void initialize(final Bootstrap<twitterConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final twitterConfiguration configuration,
                    final Environment environment) {

        final JdbiFactory factory = new JdbiFactory();
        final Jdbi jdbi = factory.build(environment, configuration.getDataSourceFactory(), "mysql");
        // You can now bind JDBI DAOs or use it directly
        
        HelloWorldResource resource = new HelloWorldResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        environment.jersey().register(resource);


        TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
    }

}
