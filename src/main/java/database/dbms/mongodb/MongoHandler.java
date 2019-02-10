package database.dbms.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;

public class MongoHandler {
    
    public static ArrayList<Object> getDocument(MongoClient mongoClient, String mongoDatabase, 
            String mongoCollection, Bson filter){
        ArrayList<Object> returnObject = new ArrayList<>();
        MongoDatabase mongoDatabaseBean = mongoClient.getDatabase(mongoDatabase);
        MongoCollection mongoCollectionBean = mongoDatabaseBean.getCollection(mongoCollection);
        FindIterable<Document> findIterable = mongoCollectionBean.find(filter);
        MongoCursor<Document> mongoCursor = findIterable.iterator();
        while(mongoCursor.hasNext()){
            returnObject.add(mongoCursor.next().toJson());
        }
        return returnObject;
    }
    
    public static ArrayList<Object> getDocuments(MongoClient mongoClient, String mongoDatabase, 
            String mongoCollection){
        ArrayList<Object> returnObject = new ArrayList<>();
        MongoDatabase mongoDatabaseBean = mongoClient.getDatabase(mongoDatabase);
        MongoCollection mongoCollectionBean = mongoDatabaseBean.getCollection(mongoCollection);
        FindIterable<Document> findIterable = mongoCollectionBean.find();
        MongoCursor<Document> mongoCursor = findIterable.iterator();
        while(mongoCursor.hasNext()){
            returnObject.add(mongoCursor.next().toJson());
        }
        return returnObject;
    }
    
    public static ArrayList<String> getAllDatabases(MongoClient mongoClient){
        ArrayList<String> returnList = new ArrayList<>();
        MongoIterable<String> mongoIterableString = mongoClient.listDatabaseNames();
        for (String iterableString : mongoIterableString) {
            returnList.add(iterableString);
        }
        return returnList;
    }
    
    public static boolean insertDocument(MongoClient mongoClient, String mongoDatabase, 
            String mongoCollection, Document docParam){
        MongoDatabase mongoDatabaseBean = mongoClient.getDatabase(mongoDatabase);
        MongoCollection mongoCollectionBean = mongoDatabaseBean.getCollection(mongoCollection);
        mongoCollectionBean.insertOne(docParam);
        return true;
    }
    
    public static boolean insertAllDocument(MongoClient mongoClient, String mongoDatabase, 
            String mongoCollection, List<Document> docParam){
        MongoDatabase mongoDatabaseBean = mongoClient.getDatabase(mongoDatabase);
        MongoCollection mongoCollectionBean = mongoDatabaseBean.getCollection(mongoCollection);
        docParam.forEach((documentIterator) -> {
            mongoCollectionBean.insertOne(documentIterator);
        });
        return true;
    }
    
    public static ArrayList<String> getCollections(MongoClient mongoClient, String mongoDatabase){
        ArrayList<String> returnObject = new ArrayList<>();
        MongoDatabase mongoDatabaseBean = mongoClient.getDatabase(mongoDatabase);
        MongoIterable<String> mongoIterableBean = mongoDatabaseBean.listCollectionNames();
        for (String stringIterator : mongoIterableBean) {
            returnObject.add(stringIterator);
        }
        return returnObject;
    }
    
    public static boolean createCollection(MongoClient mongoClient, String mongoDatabase,
            String mongoCollection){
        MongoDatabase md = mongoClient.getDatabase(mongoDatabase);
        md.createCollection(mongoCollection);
        return true;
    }
    
    public static boolean dropCollection(MongoClient mongoClient, String mongoDatabase,
            String mongoCollection){
        MongoDatabase md = mongoClient.getDatabase(mongoDatabase);
        MongoCollection mColl = md.getCollection(mongoCollection);
        mColl.drop();
        return true;
    }
    
    public static boolean dropDatabase(MongoClient mongoClient, String mongoDatabase){
        MongoDatabase md = mongoClient.getDatabase(mongoDatabase);
        md.drop();
        return true;
    }
    
    public static boolean removeAllDocuments(MongoClient mongoClient, String mongoDatabase,
            String mongoCollection){
        MongoDatabase mongoDatabaseBean = mongoClient.getDatabase(mongoDatabase);
        MongoCollection mongoCollectionBean = mongoDatabaseBean.getCollection(mongoCollection);
        FindIterable<Document> findIterable = mongoCollectionBean.find();
        MongoCursor<Document> mongoCursor = findIterable.iterator();
        while(mongoCursor.hasNext()){
            mongoCollectionBean.deleteOne(mongoCursor.next());
        }
        return true;
    }
    
    public static boolean removeDocument(MongoClient mongoClient, String mongoDatabase,
            String mongoCollection, Bson filter){
        MongoDatabase mongoDatabaseBean = mongoClient.getDatabase(mongoDatabase);
        MongoCollection mongoCollectionBean = mongoDatabaseBean.getCollection(mongoCollection);
        return mongoCollectionBean.deleteOne(filter).wasAcknowledged();
    }
    
    public static boolean removAllDocument(MongoClient mongoClient, String mongoDatabase,
            String mongoCollection, Bson filter){
        MongoDatabase mongoDatabaseBean = mongoClient.getDatabase(mongoDatabase);
        MongoCollection mongoCollectionBean = mongoDatabaseBean.getCollection(mongoCollection);
        return mongoCollectionBean.deleteMany(filter).wasAcknowledged();
    }
    
    public static boolean updateDocument(MongoClient mongoClient, String mongoDatabase,
            String mongoCollection, Document newDoc, Bson filter){
        MongoDatabase md = mongoClient.getDatabase(mongoDatabase);
        MongoCollection mColl = md.getCollection(mongoCollection);
        mColl.updateOne(filter, new Document("$set",newDoc));
        return true;
    }
    
    public static boolean updateAllDocuments(MongoClient mongoClient, String mongoDatabase,
            String mongoCollection, Document newDoc, Bson filter){
        MongoDatabase md = mongoClient.getDatabase(mongoDatabase);
        MongoCollection mColl = md.getCollection(mongoCollection);
        mColl.updateMany(filter, new Document("$set",newDoc));
        return true;
    }
    
}
