/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

import customexceptions.PlutoNoSuchDatabaseEnum;


/**
 *
 * @author Nicolas Cunha
 */
public enum PlutoDatabaseEnum {
    MariaDB, MySQL, Oracle, PostgreSQL, SQLite, SQLServer;
    
    public String getClassName() 
            throws PlutoNoSuchDatabaseEnum{
        switch(this){
            case MariaDB:
                return "org.mariadb.jdbc.Driver";
            case MySQL:
                return "com.mysql.jdbc.Driver";
            case Oracle:
                return "oracle.jdbc.driver.OracleDriver";
            case PostgreSQL:
                return "org.postgresql.Driver";
            case SQLite:
                return "org.sqlite.JDBC";
            case SQLServer:
                return "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            default:
                throw new PlutoNoSuchDatabaseEnum();
        }
    }
    
}
