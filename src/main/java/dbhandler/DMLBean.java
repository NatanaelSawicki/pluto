package dbhandler;

import customexceptions.JulyNoEstablishedConnectionException;
import customexceptions.JulyNoStatementToBeExecutedException;
import customexceptions.JulySQLException;
import exception.ExceptionHandler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DMLBean {

    private PreparedStatement ps = null;
    private Connection conn = null;

    public DMLBean(String sql)
            throws JulyNoEstablishedConnectionException, JulySQLException {
        if (DatabaseHandler.getEstablishedConnection() == null) {
            throw new JulyNoEstablishedConnectionException();
        }
        conn = DatabaseHandler.getEstablishedConnection();
        try {
            ps = conn.prepareStatement(sql);
        } catch (SQLException ex) {
            throw new JulySQLException(ExceptionHandler.getExceptionDetails(ex));
        }
    }

    public DMLBean(String sql, Connection conn)
            throws JulySQLException {
        this.conn = conn;
        try {
            ps = this.conn.prepareStatement(sql);
        } catch (SQLException ex) {
            throw new JulySQLException(ExceptionHandler.getExceptionDetails(ex));
        }
    }

    public void execute()
            throws JulyNoStatementToBeExecutedException, JulySQLException {
        if (ps != null) {
            try {
                ps.execute();
            } catch (SQLException ex) {
                throw new JulySQLException(ExceptionHandler.getExceptionDetails(ex));
            }
        } else {
            throw new JulyNoStatementToBeExecutedException();
        }
    }

    public ResultSet executeAsQuery()
            throws JulyNoStatementToBeExecutedException, JulySQLException {
        if (ps != null) {
            try {
                return ps.executeQuery();
            } catch (SQLException ex) {
                throw new JulySQLException(ExceptionHandler.getExceptionDetails(ex));
            }
        } else {
            throw new JulyNoStatementToBeExecutedException();
        }
    }

    public void addSQLParameter(int index, Object value)
            throws JulyNoStatementToBeExecutedException, JulySQLException {
        if (ps != null) {
            try {
                ps.setObject(index, value);
            } catch (SQLException ex) {
                throw new JulySQLException(ExceptionHandler.getExceptionDetails(ex));
            }
        } else {
            throw new JulyNoStatementToBeExecutedException();
        }
    }

}
