package dbhandler;

import customexceptions.PlutoNoEstablishedConnectionException;
import customexceptions.PlutoNoStatementToBeExecutedException;
import customexceptions.PlutoSQLException;
import exception.ExceptionHandler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DMLBean {

    private PreparedStatement ps = null;
    private Connection conn = null;

    public DMLBean(String sql)
            throws PlutoNoEstablishedConnectionException, PlutoSQLException {
        if (DatabaseHandler.getEstablishedConnection() == null) {
            throw new PlutoNoEstablishedConnectionException();
        }
        conn = DatabaseHandler.getEstablishedConnection();
        try {
            ps = conn.prepareStatement(sql);
        } catch (SQLException ex) {
            throw new PlutoSQLException(ExceptionHandler.getExceptionDetails(ex));
        }
    }

    public DMLBean(String sql, Connection conn)
            throws PlutoSQLException {
        this.conn = conn;
        try {
            ps = this.conn.prepareStatement(sql);
        } catch (SQLException ex) {
            throw new PlutoSQLException(ExceptionHandler.getExceptionDetails(ex));
        }
    }

    public void execute()
            throws PlutoNoStatementToBeExecutedException, PlutoSQLException {
        if (ps != null) {
            try {
                ps.execute();
            } catch (SQLException ex) {
                throw new PlutoSQLException(ExceptionHandler.getExceptionDetails(ex));
            }
        } else {
            throw new PlutoNoStatementToBeExecutedException();
        }
    }

    public ResultSet executeAsQuery()
            throws PlutoNoStatementToBeExecutedException, PlutoSQLException {
        if (ps != null) {
            try {
                return ps.executeQuery();
            } catch (SQLException ex) {
                throw new PlutoSQLException(ExceptionHandler.getExceptionDetails(ex));
            }
        } else {
            throw new PlutoNoStatementToBeExecutedException();
        }
    }

    public void addSQLParameter(int index, Object value)
            throws PlutoNoStatementToBeExecutedException, PlutoSQLException {
        if (ps != null) {
            try {
                ps.setObject(index, value);
            } catch (SQLException ex) {
                throw new PlutoSQLException(ExceptionHandler.getExceptionDetails(ex));
            }
        } else {
            throw new PlutoNoStatementToBeExecutedException();
        }
    }

}
