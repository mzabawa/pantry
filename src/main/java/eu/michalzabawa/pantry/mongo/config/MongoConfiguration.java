package eu.michalzabawa.pantry.mongo.config;

/**
 * Created by mzabawa on 11.01.18.
 */
public interface MongoConfiguration {
    String getDbHost();
    String getDbUser();
    String getDbPassword();
}
