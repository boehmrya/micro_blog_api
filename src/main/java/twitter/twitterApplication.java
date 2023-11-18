package twitter;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

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
        // TODO: implement application
    }

}
