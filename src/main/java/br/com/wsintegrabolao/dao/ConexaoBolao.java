package br.com.wsintegrabolao.dao;

import java.sql.*;

/**
 *
 * @author alexandro.pergher
 */
public class ConexaoBolao {

    private static Connection cnx;
    private static Statement stmt;
    private static PreparedStatement pstmt;
    private static CallableStatement stmtCall;
    private static boolean autoCommit;
    private static final String porta = "5432";
    private static final String servidor = "bolao.cacznkwpq5yo.us-east-2.rds.amazonaws.com";
    private static final String banco = "bolao";
    private static final String usuario = "bruno";
    private static final String senha = "brunosoad02";
    private static final String url = "jdbc:postgresql://bolao.cacznkwpq5yo.us-east-2.rds.amazonaws.com/bolao";

    static {
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());

        } catch (Exception ex) {
            System.err.println("Erro loading Driver:" + ex.getMessage());
        }
    }

    public static Connection getConnect() throws Exception {

        return DriverManager.getConnection(url, usuario, senha);

    }

    public static Statement getStatement() throws Exception {
        if (stmt != null) {
            return stmt;
        }
        if (cnx == null) {
            cnx = getConnect();
        }
        try {
            return cnx.createStatement();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return stmt;
    }

    public static Statement getUpdatableStatement() throws Exception {
        if (stmt != null) {
            return stmt;
        }
        if (cnx == null) {
            cnx = getConnect();
        }
        try {
            return cnx.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return stmt;
    }

    public static PreparedStatement getStatement(String sql) throws Exception {
        if (cnx == null) {
            cnx = getConnect();
        }
        if (pstmt == null) {
            try {
                pstmt = cnx.prepareStatement(sql);
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
        }
        return pstmt;
    }

}
