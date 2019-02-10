package database.dbms.postgresql;

import customexceptions.PlutoNoParametersAssignedException;
import customexceptions.PlutoNullPointerException;
import customexceptions.PlutoSQLException;
import database.common.SQLValidator;
import exception.ExceptionHandler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import string.StringHandler;

public class PostgreSQLHandler {

    public static boolean execute(String sql, List<Object> parameters, Connection conn)
            throws PlutoSQLException, PlutoNullPointerException,
            PlutoNoParametersAssignedException {
        SQLValidator.validateParameters(sql, parameters, conn);
        ArrayList<Object> queryParams = (ArrayList<Object>) parameters;
        try {
            PreparedStatement p = conn.prepareStatement(sql);
            long count = StringHandler.countOccurrencesOf("?", sql);
            for (int i = 1; i <= count; i++) {
                p.setObject(i, queryParams.get(i-1));
            }
            return p.execute() == false;
        } catch (SQLException ex) {
            throw new PlutoSQLException(ExceptionHandler.getExceptionDetails(ex));
        }

    }
    public static ResultSet executeQuery(String sql, List<Object> parameters, Connection conn)
            throws PlutoSQLException, PlutoNullPointerException,
            PlutoNoParametersAssignedException {
        SQLValidator.validateParameters(sql, parameters, conn);
        ArrayList<Object> queryParams = (ArrayList<Object>) parameters;
        try {
            PreparedStatement p = conn.prepareStatement(sql);
            long count = StringHandler.countOccurrencesOf("?", sql);
            for (int i = 1; i <= count; i++) {
                p.setObject(i, queryParams.get(i-1));
            }
            return p.executeQuery();
        } catch (SQLException ex) {
            throw new PlutoSQLException(ExceptionHandler.getExceptionDetails(ex));
        }

    }
    
    

}
