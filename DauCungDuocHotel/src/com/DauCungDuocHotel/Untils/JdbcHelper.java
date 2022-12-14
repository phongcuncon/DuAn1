package com.DauCungDuocHotel.Untils;


/**
 *
 * @author ps22004_taquocphong
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcHelper {

    public static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String dburl = "jdbc:sqlserver://localhost:1433;databaseName=QLKS_DB;encrypt=true;trustServerCertificate=true";
    public static String username = "sa";
    public static String password = "Password.1";
//    public static String password = "123";
  //  public static String password = "myPassw0rd";
    public static Connection conn;

    static {
        try {
            Class.forName(driver);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    public static Connection getConnect() {
		try {
			        Connection conn = DriverManager.getConnection(dburl, username, password);

		}catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        Connection conn = DriverManager.getConnection(dburl, username, password);
        PreparedStatement stmt;
        if (sql.trim().startsWith("{")) {
            stmt = conn.prepareCall(sql);
        } else {
            stmt = conn.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;

    }

    public static int update(String sql, Object... args)  {
        try {
            PreparedStatement stmt = JdbcHelper.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static ResultSet query(String sql, Object... args) throws SQLException {
        PreparedStatement stmt = JdbcHelper.getStmt(sql, args);
        return stmt.executeQuery();
    }
    public static int sp_dp()throws SQLException {
	Connection conn = DriverManager.getConnection(dburl, username, password);
	 CallableStatement cstmt = conn.prepareCall("{call sp_loadPhong}");
	int rs = cstmt.executeUpdate();
	return rs;
    }

    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
