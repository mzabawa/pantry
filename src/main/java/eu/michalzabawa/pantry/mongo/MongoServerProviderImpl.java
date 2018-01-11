package eu.michalzabawa.pantry.mongo;

import com.mongodb.MongoClient;
import eu.michalzabawa.pantry.mongo.config.MongoConfigurationImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by mzabawa on 11.01.18.
 */
public class MongoServerProviderImpl implements MongoServerProvider {
    private final MongoConfigurationImpl mongoConfiguration;

    @Autowired
    public MongoServerProviderImpl(MongoConfigurationImpl mongoConfiguration){
        this.mongoConfiguration = mongoConfiguration;
    }

    @Override
    public MongoClient getMongoClient() {
        return null;
    }
}
