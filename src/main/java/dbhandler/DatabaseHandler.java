package dbhandler;

import enums.JulyDatabaseEnum;
import customexceptions.JulyNoSuchDatabaseEnum;
import customexceptions.JulySQLException;
import exception.ExceptionHandler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class DatabaseHandler {

    private static Connection dbConn = null;
    
    public static void createConnection(HashMap properties,
            JulyDatabaseEnum param)
            throws JulySQLException, ClassNotFoundException, JulyNoSuchDatabaseEnum {
        try {
            switch (param) {
                case PostgreSQL:
                    Class.forName("org.postgresql.Driver");
                    String url      = (String) properties.get("url");
                    String username = (String) properties.get("username");
                    String password = (String) properties.get("password");
                    dbConn = DriverManager.getConnection(url, username, password);
                    break;
                case MySQL:
                    Class.forName("com.mysql.jdbc.Driver");
                    url      = (String) properties.get("url");
                    username = (String) properties.get("username");
                    password = (String) properties.get("password");
                    dbConn = DriverManager.getConnection(url, username, password);
                    break;
                case IBM_DB2_App:
                    Class.forName("com.ibm.db2.jdbc.app.DB2Driver");
                    url      = (String) properties.get("url");
                    username = (String) properties.get("username");
                    password = (String) properties.get("password");
                    dbConn = DriverManager.getConnection(url, username, password);
                    break;
                case IBM_DB2_Net:
                    Class.forName("com.ibm.db2.jdbc.net.DB2Driver");
                    url      = (String) properties.get("url");
                    username = (String) properties.get("username");
                    password = (String) properties.get("password");
                    dbConn = DriverManager.getConnection(url, username, password);
                    break;
                case MS_ACCESS_JDBC_ODBC:
                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                    url      = (String) properties.get("url");
                    username = (String) properties.get("username");
                    password = (String) properties.get("password");
                    dbConn = DriverManager.getConnection(url, username, password);
                    break;
                case MSQL_SERVER:
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    url      = (String) properties.get("url");
                    username = (String) properties.get("username");
                    password = (String) properties.get("password");
                    dbConn = DriverManager.getConnection(url, username, password);
                    break;
                case SYBASE:
                    Class.forName("com.sybase.jdbc.SybDriver");
                    url      = (String) properties.get("url");
                    username = (String) properties.get("username");
                    password = (String) properties.get("password");
                    dbConn = DriverManager.getConnection(url, username, password);
                    break;
                case TERADATA:
                    Class.forName("com.teradata.jdbc.TeraDriver");
                    url      = (String) properties.get("url");
                    username = (String) properties.get("username");
                    password = (String) properties.get("password");
                    dbConn = DriverManager.getConnection(url, username, password);
                    break;
                default:
                    throw new JulyNoSuchDatabaseEnum();
            }
        } catch (ClassNotFoundException ex) {
            throw new ClassNotFoundException(ExceptionHandler.getExceptionDetails(ex));
        } catch (SQLException ex) {
            throw new JulySQLException(ExceptionHandler.getExceptionDetails(ex));
        }
    }

    public static Connection getEstablishedConnection(){
        return dbConn == null ? null : dbConn;
    }
    
    public static boolean setDatabaseConnection(Connection conn,
            boolean override) {
        if (dbConn == null) {
            dbConn = conn;
            return true;
        } else {
            if (dbConn != null && override) {
                dbConn = conn;
                return true;
            }
            return false;
        }
    }

    public static void executePureSQL(String sql) 
            throws JulySQLException{
        if(dbConn != null){
            try {
                PreparedStatement ps = dbConn.prepareStatement(sql);
                ps.execute();
            } catch (SQLException ex) {
                throw new JulySQLException(ExceptionHandler.getExceptionDetails(ex));
            }
        }
    }
    
    public static ResultSet executePureSQLQuery(String sql) 
            throws JulySQLException{
        ResultSet rs = null;
        if(dbConn != null){
            try {
                PreparedStatement ps = dbConn.prepareStatement(sql);
                sql = sql.toLowerCase();
                return ps.executeQuery();
            } catch (SQLException ex) {
                throw new JulySQLException(ExceptionHandler.getExceptionDetails(ex));
            }
        }
        return rs;
    }
    
    public static boolean createTable(String sql)
            throws JulySQLException {
        if (dbConn != null) {
            try {
                PreparedStatement ps = dbConn.prepareStatement(sql);
                return ps.execute();
            } catch (SQLException ex) {
                throw new JulySQLException(ExceptionHandler.getExceptionDetails(ex));
            }
        }
        return false;
    }

    public static boolean tableExists(String tableName)
            throws JulySQLException {

        if (dbConn != null) {
            try {
                String sql = "SELECT EXISTS (\n"
                        + "   SELECT 1\n"
                        + "   FROM   information_schema.tables \n"
                        + "   WHERE  table_name = ?\n"
                        + "   );";
                PreparedStatement ps = dbConn.prepareStatement(sql);
                ps.setString(1, tableName);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    return rs.getBoolean("exists");
                }
            } catch (SQLException ex) {
                throw new JulySQLException(ExceptionHandler.getExceptionDetails(ex));
            }
        }

        return false;
    }

    public static boolean createStoredProcedure(String sql) {
        return false;
    }

    public static boolean createStoredFunction(String sql) {
        return false;
    }

    public static boolean createView(String sql) {
        return false;
    }

    public static boolean dropTable(String sql) {
        return false;
    }

    public static boolean dropView(String sql) {
        return false;
    }

}
