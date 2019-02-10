package database.common;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import customexceptions.PlutoClassNotFoundException;
import customexceptions.PlutoNoSuchDatabaseEnum;
import customexceptions.PlutoSQLException;
import enums.PlutoDatabaseEnum;
import exception.ExceptionHandler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBuilder {
    
    public static Connection build(ConnectionBean bean, PlutoDatabaseEnum param) 
            throws PlutoSQLException, PlutoNoSuchDatabaseEnum, 
            PlutoClassNotFoundException{
        
        try {
            Class.forName(param.getClassName());    
        } catch (ClassNotFoundException ex) {
            throw new PlutoClassNotFoundException(ExceptionHandler.getExceptionDetails(ex));
        }
        
        String url = bean.getConnectionUrl();
        String user = bean.getConnectionUsername();
        String password = bean.getConnectionPassword();
        
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            throw new PlutoSQLException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
    public static MongoClient buildForMongo(MongoConnectionBean bean){
        MongoClient mongoClient = new MongoClient(new MongoClientURI(bean.getMongoUrl()));
        return mongoClient;
    }
    
}
