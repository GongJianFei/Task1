package main.java.com.Rjdbc.Util;

import java.sql.*;



public class JDBCutil {
static {
    new JDBCutil();
}
    private  JDBCutil(){}
    private  static String url="jdbc:mysql:///jdbcdemo";
    private  static String name="root";
    private  static String password="admin";
    private  static String classname="com.mysql.jdbc.Driver";

    public static Connection jdbcGetConnection(){
        try {
            Class.forName(classname);
            return  DriverManager.getConnection(url,name,password);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }


    public static void jdbcclose(ResultSet rs, PreparedStatement ps, Connection conn){
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

