package database.common;

import customexceptions.PlutoNoParametersAssignedException;
import customexceptions.PlutoNullPointerException;
import java.sql.Connection;
import java.util.List;

public class SQLValidator {

    public static void validateParameters(String sql, List<Object> parameters, Connection conn) 
            throws PlutoNoParametersAssignedException, PlutoNullPointerException{
        if (conn == null) {
            throw new PlutoNullPointerException();
        }

        if (sql.contains("?") && (parameters.isEmpty())) {
            throw new PlutoNoParametersAssignedException();
        }
    }
    
}
