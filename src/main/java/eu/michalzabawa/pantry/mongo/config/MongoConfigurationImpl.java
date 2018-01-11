package eu.michalzabawa.pantry.mongo.config;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by mzabawa on 11.01.18.
 */
@Configuration
@PropertySource("classpath:app.properties")
public class MongoConfigurationImpl implements MongoConfiguration{

    @Value("${db.host.name}")
    @NotEmpty
    private String dbHost;

    @Value("${db.host.user}")
    @NotEmpty
    private String dbUser;

    @Value("${db.host.password}")
    @NotEmpty
    private String dbPassword;

    @Override
    public String getDbHost() {
        return dbHost;
    }

    @Override
    public String getDbUser() {
        return dbUser;
    }

    @Override
    public String getDbPassword() {
        return dbPassword;
    }
}