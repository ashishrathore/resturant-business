package application;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class ResturantApp extends Application<Config> {


    public static void main(String[] args) throws Exception {
        new ResturantApp().run(args);
    }

    @Override
    public void run(final Config configuration,
                    final Environment environment) {

    }
}
