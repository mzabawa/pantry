package eu.michalzabawa.pantry.mongo;

import com.mongodb.MongoClient;
/**
 * Created by mzabawa on 11.01.18.
 */
public interface MongoServerProvider {
    MongoClient getMongoClient();
}
