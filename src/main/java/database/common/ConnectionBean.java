package database.common;

import customexceptions.PlutoIOException;
import java.io.Serializable;
import serializer.SerializeHandler;

public class ConnectionBean implements Serializable {

    private String connectionUsername,
            connectionUrl,
            connectionPassword;

    public String serialize()
            throws PlutoIOException {
        return SerializeHandler.serialize(this);
    }

    public ConnectionBean(){
        
    }
    
    public ConnectionBean(String connectionUrl, String connectionUsername, String connectionPassword) {
        this.connectionUsername = connectionUsername;
        this.connectionUrl = connectionUrl;
        this.connectionPassword = connectionPassword;
    }

    public String getConnectionUsername() {
        return connectionUsername;
    }

    public void setConnectionUsername(String connectionUsername) {
        this.connectionUsername = connectionUsername;
    }

    public String getConnectionUrl() {
        return connectionUrl;
    }

    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    public String getConnectionPassword() {
        return connectionPassword;
    }

    public void setConnectionPassword(String connectionPassword) {
        this.connectionPassword = connectionPassword;
    }

}
