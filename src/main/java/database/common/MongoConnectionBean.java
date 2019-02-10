package database.common;

public class MongoConnectionBean {
    
    private String mongoUrl;

    public MongoConnectionBean(){
        
    }
    
    public MongoConnectionBean(String mongoUrl) {
        this.mongoUrl = mongoUrl;
    }

    public String getMongoUrl() {
        return mongoUrl;
    }

    public void setMongoUrl(String mongoUrl) {
        this.mongoUrl = mongoUrl;
    }
    
}
